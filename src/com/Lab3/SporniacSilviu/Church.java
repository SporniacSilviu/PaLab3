package com.Lab3.SporniacSilviu;

import java.util.Set;
import java.util.TreeSet;

/**
 * Church is a class which represents a Church
 */
public class Church implements Visitable {
    // Static list of ordered strings representing all the Church objects
    private static TreeSet<String> names = new TreeSet<>();
    private String name;

    public Church(String name) {
        this.name = name;
        names.add(name);
    }

    /**
     * @return ordered list of all object declarations names
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
     * Sets new name to object
     * @param name - name to replace
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Implemented from Visitable
     *
     * Prints an "action" on the console
     */
    @Override
    public void action() {
        System.out.println("* Praying *");
    }

    /**
     * @return name of object
     */
    @Override
    public String toString() {
        return name;
    }
}