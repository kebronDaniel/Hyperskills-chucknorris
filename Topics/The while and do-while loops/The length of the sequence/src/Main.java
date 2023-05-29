import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (true){
            int number = scanner.nextInt();
            if (number == 0){
                System.out.println(counter);
                break;
            }
            else {
                counter++;
            }
        }
    }
}
