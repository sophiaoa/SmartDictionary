package org.example;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EnglishTranslator translator = new EnglishTranslator();

        // Наповнюємо словник базовими словами
        translator.addWord("I", "я");
        translator.addWord("love", "люблю");
        translator.addWord("Java", "джава");
        translator.addWord("student", "студент");
        translator.addWord("is", "це");
        translator.addWord("programming", "програмування");

        System.out.println("=== Програма Перекладач ===");
        System.out.println("Базовий словник завантажено.");

        // Введення даних з клавіатури
        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Додати нове слово в словник");
            System.out.println("2. Перекласти фразу");
            System.out.println("3. Вийти");
            System.out.print("Ваш вибір: ");

            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.print("Введіть слово англійською: ");
                String eng = scanner.nextLine();
                System.out.print("Введіть переклад українською: ");
                String ukr = scanner.nextLine();
                translator.addWord(eng, ukr);
                System.out.println("Слово додано!");
            }
            else if (choice.equals("2")) {
                System.out.print("Введіть фразу англійською: ");
                String phrase = scanner.nextLine();
                String result = translator.translatePhrase(phrase);
                System.out.println("Переклад: " + result);
            }
            else if (choice.equals("3")) {
                break; // Вихід з програми
            }
        }
    }
}
