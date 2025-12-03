package org.example;
import java.util.HashMap;

class EnglishTranslator {
    // Це наша база даних слів. Перший String - англійське слово (ключ), Другий String - українське (значення)
    private HashMap<String, String> dictionary = new HashMap<>();

    // Метод для додавання пари слів
    public void addWord(String englishWord, String ukrainianWord) {
        // toLowerCase() робить букви маленькими, щоб "Hello" і "hello" були одним словом
        dictionary.put(englishWord.toLowerCase(), ukrainianWord.toLowerCase());
    }

    // Метод для перекладу цілої фрази
    public String translatePhrase(String phrase) {
        String[] words = phrase.split(" "); // Розрізаємо фразу на окремі слова по пробілу
        StringBuilder translatedPhrase = new StringBuilder();

        for (String word : words) {
            String cleanWord = word.toLowerCase();

            // getOrDefault шукає переклад. Якщо слова немає в словнику - повертає оригінал (англійське слово)
            String translatedWord = dictionary.getOrDefault(cleanWord, word);
            translatedPhrase.append(translatedWord).append(" "); // Додаємо переклад і пробіл
        }
        return translatedPhrase.toString().trim(); // Повертаємо готовий текст
    }
}
