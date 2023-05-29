import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int range = scanner.nextInt();
        int big = 0;
        int small = 0;
        int normal = 0;
        for (int i = 0; i<=range; i++){
            Scanner scan = new Scanner(System.in);
            int part = scan.nextInt();
            System.out.println(part);
            if (part == 0){
                normal++;
            } else if (part == 1) {
                big++;
            }
            else {
                small++;
            }
        }
        System.out.println(normal + " "+ big + " " + small + " ");
    }
}
