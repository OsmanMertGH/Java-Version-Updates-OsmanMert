package com.cydeo;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {

        double amount1 = 374.56;
        double amount2 = 374.26;

        System.out.println(amount1 - amount2);

        BigDecimal b1 = new BigDecimal("374.56");
        BigDecimal b2 = new BigDecimal("374.26");
        BigDecimal b3 = new BigDecimal(374.56);
        BigDecimal b4 = BigDecimal.TEN;
        BigDecimal b5 = BigDecimal.ONE;


        System.out.println(b1.add(BigDecimal.TEN));
        System.out.println(b1.subtract(b2));
    }
}
