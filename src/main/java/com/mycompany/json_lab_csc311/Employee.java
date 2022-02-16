/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.json_lab_csc311;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author soblab
 */
public class Employee {

    @SerializedName("name")
    private String name;
    @SerializedName("id")
    private int id;
    
}
