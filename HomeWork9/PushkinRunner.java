package HomeWork9;

import java.io.*;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class PushkinRunner {
    static Map<Character, Integer> chars = new HashMap<>();
    public static void main(String[] args) throws IOException {

        File stihi = Path.of("HomeWork9", "Resorce", "Pushkin.txt").toFile();
        countChars(stihi);
    }

    public static void countChars(File file) throws IOException {
        HashSet DELETE = new HashSet<>();
        DELETE.add(' ');
        DELETE.add(',');
        DELETE.add('.');
        DELETE.add(':');
        try (BufferedReader insert = new BufferedReader(new FileReader(file))) {
            String s;
            while  ((s = insert.readLine()) != null){
                s = s.toLowerCase();
                while (s.length() != 0) {
                    if (!DELETE.contains(s.charAt(0))) {
                        if (chars.containsKey(s.charAt(0))) {
                            chars.put(s.charAt(0), chars.get(s.charAt(0)) + 1);
                        } else {
                            chars.put(s.charAt(0), 1);
                        }
                        s = s.substring(1);
                    } else {
                        s = s.substring(1);
                    }
                }
            }
        }
        System.out.println(new TreeMap<>(chars));
    }
}
