package com.hms.model;

public class PathologicalTest {
    String title;
    double cost;
    boolean isAvailable;
    
    // Constructor
    PathologicalTest(String title, double cost, boolean isAvailable) {
        this.title = title;
        this.cost = cost;
        this.isAvailable = isAvailable;
    }
    
    // Method to show test details
    String show() {
        String output = "Test name: " + this.title + "<br>" 
                      + "Cost: " + this.cost + "<br>";
        return output;
    }
    
    // Method to search for a test by title
    void search(String title) {
        if (this.title.equals(title)) { // Use equals() for string comparison
            System.out.println(show()); // Call the show method
        } else {
            System.out.println("Test not found.");
        }
    }
}
