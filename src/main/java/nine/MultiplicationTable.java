package nine;

public class MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; ++i) {
            for (int j = 1; j <= 10; ++j) {
                int multi = i * j;
                System.out.print(" " + multi);
                if (multi < 10) {
                    System.out.print("  ");
                } else if (multi < 100) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
