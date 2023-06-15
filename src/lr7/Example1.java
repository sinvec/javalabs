package lr7;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        File folder = new File("src/lr7/example1_folder");
        if (!folder.exists()) {
            if (folder.mkdir()) {
                System.out.println("Папка создана: " + folder.getAbsolutePath());
            } else {
                System.out.println("Не удалось создать папку: " + folder.getAbsolutePath());
            }
        } else {
            System.out.println("Папка уже существует: " + folder.getAbsolutePath());
        }

        File file = new File(folder.getAbsolutePath() + File.separator + "example_file.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("Файл создан: " + file.getAbsolutePath());
            } else {
                System.out.println("Не удалось создать файл: " + file.getAbsoluteFile());
            }
        } catch (IOException e) {
            System.out.println("Ошибка при создании файла: " + e.getMessage());
        }

        Scanner in = new Scanner(System.in);
        System.out.print("Введите содержимое файла: ");
        String fileContents = in.nextLine();
        byte[] strToBytes = fileContents.getBytes();

        boolean successfulWrite = false;
        try {
            Files.write(Path.of(file.getAbsolutePath()), strToBytes);
            successfulWrite = true;
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
        if (successfulWrite) {
            System.out.println("Информация успешно записана в файл");
        }

        if (file.delete()) {
            System.out.println("Файл удален: " + file.getAbsoluteFile());
        } else {
            System.out.println("Не удалось удалить файл: " + file.getAbsoluteFile());
        }

        if (folder.delete()) {
            System.out.println("Папка удалена: " + folder.getAbsolutePath());
        } else {
            System.out.println("Не удалось удалить папку: " + folder.getAbsolutePath());
        }
    }
}
