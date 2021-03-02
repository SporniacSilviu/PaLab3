package com.Lab3.SporniacSilviu;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * City class is the holder of all the locations available.
 * It implements getters and setters for each member and supports an "unlimited" amount of places.
 */
public class City implements Classifiable {

    private String name;
    private List<Object> locations;
    private Object currentLocation;
    private Map<Pair<Object, Object>, Double> costs = new HashMap<>();

    public City(String name, List<Object> locations) {
        this.name = name;
        this.locations = locations;

        if(locations != null)
            this.currentLocation = locations.get(0);
    }

    /**
     * @return all locations
     */
    public List<Object> getLocations() {
        return locations;
    }

    /**
     * @return the location count
     */
    public int getLocationsCount() {
        return locations.size();
    }

    /**
     * Replaces the locations list with another locations list
     * @param locations to replace
     */
    public void setLocations(List<Object> locations) {
        this.locations = locations;
        this.currentLocation = null;
    }

    /**
     * Adds new location to locations list
     * @param location to be added
     */
    public void addLocations(Object location) {
        if(locations==null)
            this.currentLocation = location;

        this.locations.add(location);
    }

    /**
     * @return name variable of Object
     */
    public String getName() {
        return name;
    }

    /**
     * Replaces/Sets the object name variable
     * @param name - rename to
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return all the costs between locations
     */
    public Map<Pair<Object, Object>, Double> getCosts() {
        return this.costs;
    }

    /**
     * Replaces/Sets another map of costs
     * @param costs - replace to
     */
    public void setCosts(Map<Pair<Object, Object>, Double> costs) {
        this.costs = costs;
    }

    /**
     * @return currentLocation as an Object
     */
    public Object getCurrentLocation() {
        return this.currentLocation;
    }

    /**
     * Sets the current location
     * @param currentLocation - location to be set
     */
    public void setCurrentLocation(Object currentLocation) {
        this.currentLocation = currentLocation;
    }

    /**
     * Modifies the cost from location1 to location2
     * @param location1 - location 1
     * @param location2 - location 2
     * @param cost - the cost to replace to
     */
    public void setCostFromLocationToLocation(Object location1, Object location2, double cost) {
        this.costs.put(new Pair<>(location1, location2), cost);
    }

    /**
     * Prints a description about the Object
     */
    public void print() {
        System.out.println("Orasul " + getName() + " contine " + getLocationsCount() + " locatii: ");
        getLocations().forEach(e -> System.out.print(e.toString() + "(" + e.getClass().getSimpleName() + "); "));
    }

    /**
     * Implemented from Classifiable
     *
     * @param location1 - location 1
     * @param location2 - location 2
     * @return the cost betweet location1 and location2
     */
    @Override
    public double ComputeDistance(Object location1, Object location2) {
        return this.costs.get(new Pair<>(location1, location2));
    }

    /**
     * @return Object name variable
     */
    @Override
    public String toString() {
        return name;
    }
}