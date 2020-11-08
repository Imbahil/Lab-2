package nine;

import static java.lang.String.format;
import static java.util.stream.IntStream.rangeClosed;

public class MultiplicationTable {
    public static void main(String[] args) {

        computeMultiplicationTableNestedForLoop();

        computeMultiplicationTableNestedStream();
    }

    private static void computeMultiplicationTableNestedStream() {
        System.out.println("\nSecond solution:\n");
        rangeClosed(1, 10)
                .forEach(firstElement -> {
                    rangeClosed(1, 10)
                            .forEach(secondElement -> {
                                int multi = firstElement * secondElement;
                                System.out.print(format(" %d", multi));
                                System.out.print(multi < 10 ? "  " : " ");
                            });
                    System.out.println();
                });
    }

    private static void computeMultiplicationTableNestedForLoop() {
        System.out.println("First solution:");
        for (int i = 1; i <= 10; ++i) {
            for (int j = 1; j <= 10; ++j) {
                int multi = i * j;
                System.out.print(" " + multi);
                System.out.print(multi < 10 ? "  " : " ");
            }
            System.out.println();
        }
    }
}
