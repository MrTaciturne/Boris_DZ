package HomeWork11.MyTry;

public class InsertStream extends Thread{

    private int number = -42;

    public void insertNumber(int number) {
        this.number = number;
    }
    @Override
    public void run() {
            while (true){
//                System.out.println(currentThread());
                if (number != -42) {
                    try {
                        wait(this.number * 10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Time of sleeping = " + this.number);
                    this.number = -42;
                } else if (this.number == -69){
                    throw new RuntimeException();
                }
            }
    }
}
