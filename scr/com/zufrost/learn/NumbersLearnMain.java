package com.zufrost.learn;

import java.math.BigDecimal;

import static java.lang.Integer.decode;

public class NumbersLearnMain {
    public static void main(String[] args) {
        System.out.println("Byte.MIN_VALUE=" + Byte.MIN_VALUE);
        System.out.println("Byte.MAX_VALUE=" + Byte.MAX_VALUE);
        System.out.println("Short.MIN_VALUE=" + Short.MIN_VALUE);
        System.out.println("Short.MAX_VALUE=" + Short.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE=" + Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE=" + Integer.MAX_VALUE);
        System.out.println("Long.MIN_VALUE=" + Long.MIN_VALUE);
        System.out.println("Long.MAX_VALUE=" + Long.MAX_VALUE);
        System.out.println("Float.MIN_VALUE=" + Float.MIN_VALUE);
        System.out.println("Float.MAX_VALUE=" + Float.MAX_VALUE);
        System.out.println("Double.MIN_VALUE=" + Double.MIN_VALUE);
        System.out.println("Double.MAX_VALUE=" + Double.MAX_VALUE);
        Integer s = 100;
        System.out.println(decode("152"));
        System.out.println(s.toString());
        System.out.println(Math.pow(12344, 12344));

        System.out.println(0.1+0.2);

        System.out.println(new BigDecimal("0.1").add(new BigDecimal("0.2")));


    }
}
