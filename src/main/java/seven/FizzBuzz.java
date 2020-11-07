package seven;

import static java.util.stream.IntStream.rangeClosed;

public class FizzBuzz {
    public static void main(String[] args) {

        rangeClosed(1, 100)
                .mapToObj(element -> element % 3 == 0 ? (element % 5 == 0 ? "FizzBuzz" : "Fizz") : (element % 5 == 0 ? "Buzz" : element))
                .forEach(System.out::println);
    }
}
