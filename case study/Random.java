public class Random {
    public static void main(String[] args) {
        int count = 0;
        int total = 1_000_000;
        for (int i = 0; i < total; i++) {
            double x = Math.random() * 2 -1;
            double y = Math.random() * 2 -1;
            if ((x > 0 && y > 0) || (x < 0 && y < 0)) {
                count++;
            }
        }
        double probability = (double) count / total;
        System.out.println("Probability = " + probability);
    }
}
