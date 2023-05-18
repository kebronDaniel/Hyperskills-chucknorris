package chucknorris;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputToBinary();
    }

    private static void inputToBinary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string: ");
        String userInput = scanner.nextLine();
        String bitRepresentation = "";
        String firstBlockZero="00";
        String firstBlockOne="0";
        for (int i = 0; i < userInput.length(); i++) {
            char x = userInput.charAt(i);
            String binary = Integer.toBinaryString(x);
            if (binary.length() < 7) {
                binary = "0" + binary;
            }
//            System.out.printf("%c = %07d\n",x,Integer.parseInt(Integer.toBinaryString(x)));
            bitRepresentation = bitRepresentation + binary;
        }
//        System.out.println(bitRepresentation);
        String chuckNorrisCode = "";
        for (int i = 0; i < bitRepresentation.length(); i++) {
            int count = 1;
            while (i + 1 < bitRepresentation.length() &&
                    bitRepresentation.charAt(i) == bitRepresentation.charAt(i + 1)){
                i++;
                count++;
            }
//            System.out.println(bitRepresentation.charAt(i) + "Has count of " + count);

            if (bitRepresentation.charAt(i) == '1'){
                chuckNorrisCode = chuckNorrisCode + firstBlockOne + " ";
            }
            else {
                chuckNorrisCode = chuckNorrisCode + firstBlockZero + " ";
            }
            for (int j = 0; j < count; j++) {
                chuckNorrisCode = chuckNorrisCode + "0";
            }
            chuckNorrisCode = chuckNorrisCode + " ";
//            System.out.println(chuckNorrisCode);

        }
        System.out.println("The result: ");
        System.out.println(chuckNorrisCode);
    }



}