package HomeWork11.FromInternet;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SleepingRunner {
    static int insertNum = 0;
    static ExecutorService executor = Executors.newSingleThreadExecutor();
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {

        System.out.print("\nWaiting for seconds: ");
        while (true) {
            insertNum = in.nextInt();
            insert();
            if(!in.hasNextInt()) {
                return;
            }
        }
    }
    private static void insert() throws InterruptedException {
        try{
                if (!(insertNum < 0)) {
                    executor.execute(new Sleeping(insertNum));
                } else {
                    System.out.print("\nEnding process");
                    executor.close();
                }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
