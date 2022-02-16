/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.json_lab_csc311;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author soblab
 */
public class Main {

    public static void main(String[] args) {
        try {

            FileReader fr = new FileReader("newjson.json");
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
            Employee e2 = gson.fromJson(fr, Employee.class);
            System.out.println("Name is: " + e2.getName());
            System.out.println("ID is: " + e2.getId());
            
        } catch (FileNotFoundException ex) {
            ex.getMessage();
        }
    }
}
