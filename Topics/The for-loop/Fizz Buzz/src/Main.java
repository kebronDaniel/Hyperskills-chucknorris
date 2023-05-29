import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lower_number = scanner.nextInt();
        int limit = scanner.nextInt();
        for (;lower_number <= limit; lower_number++){
            if ((lower_number % 3==0) && (lower_number % 5==0)){
                System.out.println("FizzBuzz");
            } else if (lower_number % 3 == 0) {
                System.out.println("Fizz");
            } else if (lower_number % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(lower_number);
            }
        }
    }
}
