package chucknorris;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        String ciphered = inputToBinary();
//        System.out.println("The result: ");
//        System.out.println(ciphered);
        decipher();
    }

    private static String inputToBinary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string: ");
        String userInput = scanner.nextLine();
        String bitRepresentation = "";
        String firstBlockZero = "00";
        String firstBlockOne = "0";
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
                    bitRepresentation.charAt(i) == bitRepresentation.charAt(i + 1)) {
                i++;
                count++;
            }
//            System.out.println(bitRepresentation.charAt(i) + "Has count of " + count);

            if (bitRepresentation.charAt(i) == '1') {
                chuckNorrisCode = chuckNorrisCode + firstBlockOne + " ";
            } else {
                chuckNorrisCode = chuckNorrisCode + firstBlockZero + " ";
            }
            for (int j = 0; j < count; j++) {
                chuckNorrisCode = chuckNorrisCode + "0";
            }
            chuckNorrisCode = chuckNorrisCode + " ";
//            System.out.println(chuckNorrisCode);

        }
//        System.out.println(chuckNorrisCode);
        return chuckNorrisCode;
    }

    public static void decipher(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input encoded string: ");
        String code = scanner.nextLine();
        String output = "";
        String[] strArray = null;
        strArray = code.split(" ");
        for (int i = 0; i < strArray.length; i++) {
            if (i % 2 == 0){
                if (strArray[i].length() == 1){
                    output = output + "1";
                }else {
                    output = output + "0";
                }
            }else {
                String block = strArray[i];
                char charToAdd = output.charAt(output.length() - 1);
                String chars = "";
                if (block.length() > 1){
                    for (int j = 1; j < block.length(); j++) {
                        chars = chars + charToAdd;
                    }
                    output = output + chars;
                }
            }
        }
        // the output is the binary representation.

        String decipherdWord = "";
        for (int i = 0; i < output.length(); i+=7) {
            int value = Integer.parseInt(output.substring(i,i+7),2);
            char charVal = (char) value;
            decipherdWord = decipherdWord + charVal;
        }
        System.out.println("The result: ");
        System.out.print(decipherdWord);
    }

}