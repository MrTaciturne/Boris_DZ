package HomeWork11.Numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Runner {

    public static void main(String[] args) {
        Random rand = new Random();
        int size = rand.nextInt(1_000_000);
        List<Integer> threeHundred = new ArrayList<>(rand.nextInt(size));
        threeHundred.forEach(integer -> rand.nextInt(300));
        System.out.println("Size = " + threeHundred.size() + " " + rand.nextInt(1_000_000));



        int max = threeHundred.get(0);
        for (int i = 1; i < threeHundred.size(); i++) {

        }
    }

}
