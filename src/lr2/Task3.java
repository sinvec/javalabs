package lr2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String[] alphabet = {
                "абвгдеёжзийклмнопрстуфхцчшщъыьэюя",
                "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ",
                "abcdefghijklmnopqrstuvwxyz",
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
                "0123456789"
        };
        Scanner stdin = new Scanner(System.in);
        System.out.print("Input a text for the encoding: ");
        String text = stdin.nextLine();
        System.out.print("Input the key: ");
        int key = stdin.nextInt();
        int index;
        String encoded_text = "";
        char placeholder;
        for(int i = 0; i < text.length(); i++) {
            placeholder = text.charAt(i);
            for (int x = 0; x < alphabet.length; x++) {
                index = alphabet[x].indexOf(text.charAt(i));
                if (index != -1) {
                    index = (index + key) % alphabet[x].length();
                    if (index < 0) {
                        index += alphabet[x].length();
                    }
                    placeholder = alphabet[x].charAt(index);
                    break;
                }
            }
            encoded_text += placeholder;
        }
        System.out.printf("Encoded text: %s\n", encoded_text);
        System.out.print("Perform decoding? (y/n) ");
        char answer = 'x';
        String decoded_text = "";
        for (int j = 0; j < 4; j++) {
            answer = stdin.next().charAt(0);
            if (answer == 'y') {
                for(int i = 0; i < encoded_text.length(); i++) {
                    placeholder = encoded_text.charAt(i);
                    for (int x = 0; x < alphabet.length; x++) {
                        index = alphabet[x].indexOf(encoded_text.charAt(i));
                        if (index != -1) {
                            index = (index - key) % alphabet[x].length();
                            if (index < 0) {
                                index += alphabet[x].length();
                            }
                            placeholder = alphabet[x].charAt(index);
                            break;
                        }
                    }
                    decoded_text += placeholder;
                }
                System.out.printf("Decoded text: %s", decoded_text);
                break;
            } else if (answer == 'n') {
                System.out.println("Bye Bye!");
                break;
            } else if (j != 3) {
                System.out.print("Please, enter a correct answer (y/n) ");
            }
        }
        if (answer != 'n' && answer != 'y') {
            System.out.println("Please, try later");
        }
    }
}
