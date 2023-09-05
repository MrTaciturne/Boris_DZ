package HomeWork7.English;

import java.lang.reflect.Array;
import java.util.HashMap;

public class EnglishStringRunner {

    public static void main(String[] args) {
        HashMap<String, Integer> wordList = new HashMap<>();

        String text = "Бла бла, чётр; бла. Бла!";
        text = text.toLowerCase();
        char[] charr = new char[]{',', '.', '!', '?', ':', ';', '(', ')'};
        for (char ch : charr) {
            text = text.replace(ch, ' ');
        }
        String[] words = text.split(" ");

        for (String word : words) {
            if (word != "") {
                if (wordList.containsKey(word)) {
                    wordList.put(word, wordList.get(word) + 1);
                } else {
                    wordList.put(word, 1);
                }
            }

        }
        System.out.println(wordList);

    }
}

