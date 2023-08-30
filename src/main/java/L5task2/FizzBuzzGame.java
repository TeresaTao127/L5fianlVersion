package L5task2;

public class FizzBuzzGame {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (isFizzBuzz(i)) {
                System.out.println("FizzBuzz");
            } else if (isFizz(i)) {
                System.out.println("Fizz");
            } else if (isBuzz(i)) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static boolean isFizzBuzz(int i) {
        return (i % 3 == 0 && i % 5 == 0);
    }

    public static boolean isFizz(int i) {
        return (i % 3 == 0);
    }

    public static boolean isBuzz(int i) {
        return (i % 5 == 0);
    }
}

