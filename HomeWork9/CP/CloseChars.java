package HomeWork9.CP;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CloseChars {
    public static void main(String[] args) throws IOException {

        File text = Path.of("HomeWork9", "CP", "Resorce", "Linkor.txt").toFile();
        closer(text);

    }

    private static void closer(File file) throws IOException {
        try (BufferedReader read = new BufferedReader(new FileReader(file))) {
            String s;
            String[] s1;
            List<String> sArray = new ArrayList<>();
            List<String> finArray = new ArrayList<>();

            while ((s = read.readLine()) != null) {
                s1 = s.toLowerCase().split(" ");
                for (int i = 0; i < s1.length; i++) {
                    sArray.add(s1[i]);
                }
                System.out.println(sArray);

                for (int i = 0; i < sArray.size() - 1; i++) {
                    if (sArray.get(i).charAt(sArray.get(i).length() - 1)
                            == sArray.get(i + 1).charAt(0)) {
                        finArray.add(sArray.get(i));
                    }
                }

            }
            System.out.println(finArray);
        }

    }
}

