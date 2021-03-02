package com.Lab3.SporniacSilviu;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Hotel h1 = new Hotel("Capitol");
        Museum m1 = new Museum("Muzeul Universitatii");
        Restaurant r1 = new Restaurant("Mc Donalds");
        Church c1 = new Church("Mitropolia Iasi");

        List<Object> locations = new LinkedList<Object>(Arrays.asList(h1, m1, r1, c1));

        City city = new City("Iasi", locations);

        city.print();
    }
}