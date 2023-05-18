import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupOne = scanner.nextInt();
        int groupTwo = scanner.nextInt();
        int groupThree = scanner.nextInt();

        int deskForGroupOne = groupOne / 2 + groupOne % 2;
        int deskForGroupTwo = groupTwo / 2 + groupTwo % 2;
        int deskForGroupThree = groupThree / 2 + groupThree % 2;

        System.out.println(deskForGroupOne + deskForGroupTwo + deskForGroupThree);
        
    }
}
