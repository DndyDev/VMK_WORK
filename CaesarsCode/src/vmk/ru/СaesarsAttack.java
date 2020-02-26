package vmk.ru;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class СaesarsAttack {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к файлу,который нужно расшифровать");
        String path = scanner.nextLine();
        FileInputStream file = new FileInputStream(path);


    }
}
