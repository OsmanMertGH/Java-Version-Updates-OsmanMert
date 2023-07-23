package com.cydeo.traderTask;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        System.out.println("---------------------------------------------------");
        //1. Find all transactions in the year 2011 and sort them by value(small to high)
        transactions.stream()
                .filter(p->p.getYear()==2011)
                .sorted(Comparator.comparing(Transaction::getYear))
                .forEach(System.out::println);

        System.out.println("---------------------------------------------------");
        //2. What are all the unique cities where the traders work?
        transactions.stream()
                .map(p->p.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        System.out.println("---------------------------------------------------");
        //3. Find all traders from Cambridge and sort them by name.
        transactions.stream()
                .filter(p->p.getTrader().getCity().equalsIgnoreCase("cambridge"))
                .sorted(Comparator.comparing(p->p.getTrader().getName()))
                .forEach(System.out::println);

        System.out.println("---------------------------------------------------");
        //4. Return a string of all traders’ names sorted alphabetically.
        String allTraders =
                transactions.stream()
                        .map(p -> p.getTrader().getName())
                        .sorted()
                        .distinct()
                        .collect(Collectors.joining(", "));

        System.out.println(allTraders);

        System.out.println("---------------------------------------------------");
        //5. Are any traders based in Milan?
        boolean anyMilan= transactions.stream()
                .anyMatch(p->p.getTrader().getCity().equalsIgnoreCase("milan"));

        System.out.println(anyMilan);

        System.out.println("---------------------------------------------------");
        //6. Print the values of all transactions from the traders living in Cambridge.
        transactions.stream()
                .filter(p->p.getTrader().getCity().equalsIgnoreCase("cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        System.out.println("---------------------------------------------------");
        //7. What is the highest value of all the transactions?
        int maxTransactionValue =  transactions.stream()
                .max(Comparator.comparing(Transaction::getValue))
                .map(Transaction::getValue).get();

        System.out.println(maxTransactionValue);

        System.out.println("---------------------------------------------------");
        //8. Find the transaction with the smallest value.
        Optional<Transaction> minTransactionValue  =  transactions.stream()
                .min(Comparator.comparing(Transaction::getValue));

        System.out.println(minTransactionValue);
    }
}