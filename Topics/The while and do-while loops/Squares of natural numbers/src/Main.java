import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        int number = (int) Math.sqrt((int)limit);
        int starter = 1;
        while (starter <= number){
            int result = starter * starter;
            System.out.println(result);
            starter++;
        }
    }
}
