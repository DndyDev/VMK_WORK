package vmk.ru;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String alphabet = "АБВГДЕЖЗИКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯaбвгдежзиклмнопрстуфхцчшщъыьэюя";
        Scanner scanner = new Scanner(System.in);
        int step = scanner.nextInt();
        String string = "Привет мир";
//        int buffer;
        for (int i = 0; i < string.length(); i++){
             int buffer = alphabet.indexOf(string.charAt(i)); //
             if(buffer == -1) {
                 System.out.print(string.charAt(i));
             } else{
                 buffer =  (buffer + step) % alphabet.length();
                 System.out.print(alphabet.charAt(buffer));
             }
        }




    }
}
