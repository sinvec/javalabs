package lr7;

import java.io.File;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя файла: ");
        String file_name = "src/lr7/" + in.nextLine();

        File file = new File(file_name);
        if (file.exists() && file.isFile()) {
            System.out.println("Размер файла в байтах: " + file.length());
        } else {
            System.out.println("Ошибка: файл с таким именем не существует!");
        }
    }
}
