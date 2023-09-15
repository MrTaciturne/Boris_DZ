package HomeWork11.MyTry;

import java.util.Scanner;

public class InsertStreamRunner {

    static int insertNum;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        InsertStream insert = new InsertStream();
        insert.start();

        while (true){
            System.out.print("\nWaiting for seconds: ");
            insertNum = in.nextInt();
            if((insertNum = in.nextInt()) >= 0) {
                insert.insertNumber(insertNum);
            } else {
                System.out.println("\nClosable number. \nGood By");
                insert.insertNumber(-69);
            }
        }
    }
}
