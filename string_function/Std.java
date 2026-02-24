public class Std {
    public static void main(String[] args) {

    StringBox box = new StringBox("Hello");

    System.out.println("Initial: " + box);

    box.add(" World");
    System.out.println("After add: " + box);

    box.insert(5, " Big");
    System.out.println("After insert: " + box);

    box.remove(5, 9);
    System.out.println("After remove: " + box);

    System.out.println("Length: " + box.length());

    System.out.println("Char at 1: " + box.charAt(1));

    System.out.println("Find 'World': " + box.find("World"));

    box.swap("World", "Java");
    System.out.println("After swap: " + box);

    box.upper();
    System.out.println("Uppercase: " + box);

    box.lower();
    System.out.println("Lowercase: " + box);
}
}
