package com.Lab3.SporniacSilviu;

import java.text.NumberFormat;

public interface Payable {

    default void pay(double amount) {
        System.out.println("Ati platit  " + String.format("%.2f", amount) + "$.");
    };
    String getName();
}