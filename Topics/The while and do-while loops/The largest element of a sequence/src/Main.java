import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int pre_number = 0;
        while (true){
            int number = scanner.nextInt();
            if (number == 0){
                System.out.println(pre_number);
                break;
            }
            else {
                counter++;
                if (pre_number < number){
                    pre_number = number;
                }
            }
        }
    }
}
