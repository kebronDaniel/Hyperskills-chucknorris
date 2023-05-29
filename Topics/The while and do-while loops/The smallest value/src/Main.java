import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long userInput = scanner.nextLong();

        long accumulator = 1;
        int counter = 0;
        for (int i = 1; accumulator <= userInput; i++) {
            accumulator = accumulator * i;
            counter++;
            if (accumulator > userInput){
                System.out.println(counter);
            }
        }
    }
}