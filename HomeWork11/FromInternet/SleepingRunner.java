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
        while (insertNum >= 0) {
            insert();
        }
    }
    private static void insert() throws InterruptedException {
        try{
            if ((insertNum = in.nextInt()) >= 0){
                executor.execute(new Sleeping(insertNum));
            } else {
                System.out.print("\nEnding process");
                executor.close();
            }
        } catch (InputMismatchException e){
            System.out.print("\nOnly numbers");
            Thread.sleep(1000);
        }
    }
}
