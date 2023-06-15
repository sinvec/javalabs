package lr7;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя файла: ");
        String file_name = "src/lr7/" + in.nextLine();

        System.out.print("Введите слово для поиска: ");
        String search_word = in.nextLine();

        List<String> foundLines = new ArrayList<>();

        try(InputStream inputStream = new FileInputStream(file_name);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(search_word)) {
                    foundLines.add(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Возникла ошибка при чтении файла: " + e.getMessage());
        }

        if (foundLines.size() > 0) {
            System.out.println("Найдены следующие строки:");
            for(String str : foundLines) {
                System.out.println(str);
            }
        } else {
            System.out.println("Строки с search_word не найдены");
        }
    }
}
