/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.hms.controller;

import com.hms.model.PathologicalTest;
import com.hms.view.Home;

/**
 *
 * @author Nazmul
 */
public class HospitalManagementSoftware {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        new Home().setVisible(true);
        PathologicalTest ltest = new PathologicalTest("CBC",400,true);
        System.out.println(ltest.returnLabTestInfo());
    }
}
