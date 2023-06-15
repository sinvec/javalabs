package lr7;

import java.io.*;

public class Example5 {
    public static void main(String[] args) {
        String inputFileName = "src/lr7/example5_input.txt";
        String outFileName = "src/lr7/example5_output.txt";
        try (InputStream inputStream = new FileInputStream(inputFileName);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            OutputStream outputStream = new FileOutputStream(outFileName);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter)) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    bufferedWriter.write(line.toUpperCase());
                    bufferedWriter.newLine();
                }
                System.out.println("Данные записаны в файл: " + outFileName);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении/записи файла: " + e.getMessage());
        }
    }
}
