/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

/**
 *
 * @author Nazmul
 */
public class PathologicalTest {
    private String title;
    private double cost;
    private boolean isAvailable;
    
    public PathologicalTest(String title,
                    double cost,
                    boolean isAvailable){
        this.title = title;
        this.cost = cost;
        this.isAvailable = isAvailable;               
    }
    public String show(){
        String output = "Test name: "+this.getTitle()+"<br>"
                + "Cost: "+this.getCost()+"<br>"
                + "Availability: "+this.isIsAvailable();
        return output;
    }
//    void search(String title){
//        if(this.title == title)
//            show();
//        else
//            System.out.println("Not found");
//    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the cost
     */
    public double getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * @return the isAvailable
     */
    public boolean isIsAvailable() {
        return isAvailable;
    }

    /**
     * @param isAvailable the isAvailable to set
     */
    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String returnLabTestInfo() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    String output = "Test name: "+this.getTitle()+"\r\n"
                + "Cost: "+this.getCost()+"\r\n"
                + "Availability: "+this.isIsAvailable();
        return output;
    }
}
