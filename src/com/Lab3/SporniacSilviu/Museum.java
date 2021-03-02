package com.Lab3.SporniacSilviu;

import java.util.TreeSet;

/**
 * Museum is a class which represents a Museum
 */
public class Museum implements Visitable, Payable {
    // Static list of ordered strings representing all the Museum objects
    private static final TreeSet<String> names = new TreeSet<>();
    private String name;

    public Museum(String name) {
        this.name = name;
        names.add(name);
    }

    /**
     * @return all object's type names
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
        Museum.names.remove(this.name);

        this.name = name;
        Museum.names.add(this.name);
    }

    /**
     * Implemented from Visitable
     *
     * Prints an "action" on the console
     */
    @Override
    public void action() {
        System.out.println("O superba opera de arta!");
    }
}
