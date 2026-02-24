public class StringBox {
    char[] value;
    int count;
    public StringBox() {
        value = new char[16];
        count = 0;
    }

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public StringBox(String str) {
        value = new char[str.length() + 16];
        count = 0;
        add(str);
    }

    void expand(int min) {
        if (min > value.length) {
            int newSize = value.length * 2;
            if (newSize < min) newSize = min;
            char[] temp = new char[newSize];
            System.arraycopy(value, 0, temp, 0, count);
            value = temp;
        }
    }

    public int length() {
        return count;
    }

    public StringBox add(String str) {
        expand(count + str.length());
        for (int i = 0; i < str.length(); i++) {
            value[count++] = str.charAt(i);
        }
        return this;
    }

    public StringBox add(char ch) {
        expand(count + 1);
        value[count++] = ch;
        return this;
    }

    public char charAt(int index) {
        if (index < 0 || index >= count) throw new IndexOutOfBoundsException();
        return value[index];
    }

    public StringBox insert(int index, String str) {
        if (index < 0 || index > count) throw new IndexOutOfBoundsException();
        expand(count + str.length());
        for (int i = count - 1; i >= index; i--) {
            value[i + str.length()] = value[i];
        }
        for (int i = 0; i < str.length(); i++) {
            value[index + i] = str.charAt(i);
        }
        count += str.length();
        return this;
    }

    public StringBox remove(int start, int end) {
        if (start < 0 || end > count || start > end) throw new IndexOutOfBoundsException();
        int diff = end - start;
        for (int i = start; i < count - diff; i++) {
            value[i] = value[i + diff];
        }
        count -= diff;
        return this;
    }

    public int find(String str) {
        for (int i = 0; i <= count - str.length(); i++) {
            int j = 0;
            while (j < str.length() && value[i + j] == str.charAt(j)) {
                j++;
            }
            if (j == str.length()) return i;
        }
        return -1;
    }

    public StringBox swap(String target, String replacement) {
        int pos = find(target);
        while (pos != -1) {
            remove(pos, pos + target.length());
            insert(pos, replacement);
            pos = find(target);
        }
        return this;
    }

    public StringBox upper() {
        for (int i = 0; i < count; i++) {
            if (value[i] >= 'a' && value[i] <= 'z') {
                value[i] = (char)(value[i] - 32);
            }
        }
        return this;
    }

    public StringBox lower() {
        for (int i = 0; i < count; i++) {
            if (value[i] >= 'A' && value[i] <= 'Z') {
                value[i] = (char)(value[i] + 32);
            }
        }
        return this;
    }
    @Override
    public String toString() {
        return new String(value, 0, count);
    }
}