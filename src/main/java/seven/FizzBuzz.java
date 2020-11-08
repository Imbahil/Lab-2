package seven;

import static java.lang.String.format;
import static java.lang.System.out;
import static java.util.stream.IntStream.rangeClosed;

public class FizzBuzz {
    public static void main(String[] args) {

        out.println("First solution with 3 ternary operators: ");
        rangeClosed(1, 100)
                .mapToObj(element -> element % 3 == 0 ? (element % 5 == 0 ? "FizzBuzz" : "Fizz") : (element % 5 == 0 ? "Buzz" : element))
                .forEach(out::println);

        out.println("\nSecond solution with 2 ternary operators:\n");
        rangeClosed(1, 100)
                .mapToObj(element -> new String[]{element + "", "Fizz", "Buzz", "FizzBuzz"}[(element % 3 == 0 ? 1 : 0) + (element % 5 == 0 ? 2 : 0)])
                .forEach(out::println);

        out.println("\nThird solution without ternary operator || if:\n");
        String[] fizzBuzz = {
                "FizzBuzz", "%d", "%d", "Fizz", "%d", "Buzz", "Fizz", "%d", "%d","Fizz", "Buzz", "%d", "Fizz", "%d", "%d"
        };

        rangeClosed(1, 100)
                .forEach(element -> out.println(format(fizzBuzz[element % 15], element)));
    }
}
