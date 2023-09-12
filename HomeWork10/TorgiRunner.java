package HomeWork10;

import java.util.*;
import java.util.stream.Collectors;

public class TorgiRunner {
    private static List<Trader> traders = new ArrayList<>();
    private static List<Transaction> transactions = new ArrayList<>();

    public static void main(String[] args) {
        generate();

        System.out.println(1);
        transactions.stream()
                .filter(transactions -> transactions.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .forEach(System.out::println);
        System.out.println();

        System.out.println(2);
        traders.stream()
                .map(Trader::getCity)
                .collect(Collectors.toSet())
                .forEach(System.out::print);
        System.out.println("\n");

        System.out.println(3);
        traders.stream()
                .filter(trader -> trader.getCity() == "Cambridge ")
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);
        System.out.println();

        System.out.println(4);
        traders.stream()
                .sorted(Comparator.comparing(Trader::getName))
                .map(Trader::getName)
                .forEach(System.out::print);
        System.out.println("\n");

        System.out.println(5);
        Set<Trader> traderSet =  traders.stream()
                .filter(trader -> trader.getCity() == "Milan ")
                .collect(Collectors.toSet());
        if (traderSet.size() != 0 ) {
            System.out.println("Из Милана имеется");
        } else {
            System.out.println("Из Милана отсутствуют");
        }
        System.out.println();

        System.out.println(6);
        Optional<Integer> value = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity() == "Cambridge ")
                .map(Transaction::getValue)
                .reduce(Integer::sum);
        System.out.println(value.get() + "\n");


        System.out.println(7);
        value = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Math::max);
        System.out.println(value.get() + "\n");

        System.out.println(8);
        Optional<Integer> minTrans = transactions.stream()
                .map(Transaction::getValue)
                .reduce((x,y) -> Math.min(x,y));
        for (Transaction transaction : transactions) {
            while (transaction.getValue() == minTrans.get()){
                System.out.println("Самая дешёвая транзакция: " + transaction);
                return;
            }

        }
    }

    private static void generate() {
        traders.add(new Trader("Genre ", "Milan ")); //0
        traders.add(new Trader("Cavil ", "Morocco ")); //1
        traders.add(new Trader("Marta ", "Paris ")); //2
        traders.add(new Trader("George ", "Cambridge ")); //3
        traders.add(new Trader("Anastasia ", "Moscow ")); //4
        traders.add(new Trader("Doctor ", "Gallifrey ")); //5
        traders.add(new Trader("Cedric ", "Cambridge ")); //6
        traders.add(new Trader("Tina ", "New York ")); //7

        transactions.add(new Transaction(traders.get(0), 2010, 12_385));
        transactions.add(new Transaction(traders.get(1), 2009, 10_906));
        transactions.add(new Transaction(traders.get(2), 2011, 100_000));
        transactions.add(new Transaction(traders.get(3), 1997, 16_870)); //
        transactions.add(new Transaction(traders.get(4), 2011, 9_100));
        transactions.add(new Transaction(traders.get(5), 2000, 124_400));
        transactions.add(new Transaction(traders.get(5), 1811, 42));
        transactions.add(new Transaction(traders.get(2), 2011, 18_090));
        transactions.add(new Transaction(traders.get(4), 1998, 66_540));
        transactions.add(new Transaction(traders.get(6), 2014, 10_500)); //
        transactions.add(new Transaction(traders.get(7), 2014, 10_500));
        transactions.add(new Transaction(traders.get(6), 2014, 10_500));
        transactions.add(new Transaction(traders.get(4), 814, 10_500));

    }
}
