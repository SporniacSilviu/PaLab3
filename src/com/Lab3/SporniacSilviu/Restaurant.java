package com.Lab3.SporniacSilviu;

import java.util.TreeSet;

/**
 * Restaurant is a class which represents a Restaurant
 */
public class Restaurant implements Payable {
    // Static list of ordered strings representing all the Restaurant objects
    private static TreeSet<String> names = new TreeSet<>();
    private String name;

    public Restaurant(String name) {
        this.name = name;
        names.add(name);
    }

    /**
     * @return all the object's type names
     */
    public static TreeSet<String> getNames() {
        return names;
    }

    /**
     * @return name of object
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * @return name of object
     */
    @Override
    public String toString() {
        return name;
    }

    /**
     * Changes the name of object
     * @param name - name to be changed into
     */
    public void changeName(String name) {
        Restaurant.names.remove(this.name);

        this.name = name;
        Restaurant.names.add(this.name);
    }

    /**
     * Implemented from Payable
     *
     * Prints an "action" on the console
     * @param amount - the amount that it's payed
     */
    @Override
    public void pay(double amount) {
        System.out.println("Ati platit " + String.format("%.2f", amount) + "$ la " + getName() + ".");
    }
}
