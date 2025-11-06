public class Divisible {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            // Print numbers divisible by 3 or 5, but not both
            if ((i % 3 == 0 || i % 5 == 0) && !(i % 3 == 0 && i % 5 == 0)) {
                System.out.println(i);
            }
        }
    }
}