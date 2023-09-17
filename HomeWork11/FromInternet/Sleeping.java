package HomeWork11.FromInternet;

import java.util.InputMismatchException;

public class Sleeping implements Runnable{

    private int number;

    public Sleeping(int number) {
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(number * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("\nTime of sleeping = " + this.number);
    }
}
