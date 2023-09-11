package HomeWork9;

import java.io.*;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Random;
import java.util.TreeSet;

public class NumbersWriter {
    static Random rand = new Random();
    public static void main(String[] args) throws IOException {

        File numbers = Path.of("HomeWork9", "Resorce", "Numbers.txt").toFile();
        generate(numbers, 10);
        print(numbers);
    }

    private static void generate(File file, int i) throws IOException {
        if(!file.exists()) {
            file.createNewFile();
        }
        int number;
        try(FileWriter generate = new FileWriter(file)) {
            for (int j = 0; j < i; j++) {
                number = rand.nextInt(100) + 1;
                generate.write(number + " ");
            }
        }
    }

    private static void print(File file) throws IOException {
        try(BufferedReader prinring = new BufferedReader(new FileReader(file))) {
            String s;
            TreeSet set = new TreeSet<Integer>();
            while  ((s = prinring.readLine()) != null){
                final String[] s1 = s.split(" ");
                set.addAll(Arrays.asList(s1));
            }
            System.out.println(set);
        }
    }
}
