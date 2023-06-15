package lr7;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя файла: ");
        String file_name = "src/lr7/" + in.nextLine();

        System.out.print("Введите содержимое файла: ");
        String data = in.nextLine();

        int cWritten = 0;

        try (FileOutputStream fileOutputStream = new FileOutputStream(file_name);
             DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream)){
            dataOutputStream.writeBytes(data);
            cWritten = dataOutputStream.size();
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        System.out.println("Количество записанных символов: " + cWritten);
    }
}
