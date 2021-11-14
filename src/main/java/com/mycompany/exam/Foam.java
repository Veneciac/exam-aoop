/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exam;

/**
 *
 * @author veneciacalista
 */
public class Foam extends Bed {
     public String generateId(int num) {
        return "FO" + Integer.toString(num);
    }
    
    public int getPrice() {
        int base = 0;
        
        if (this.size == "single") {
            base = 500000  ;
        } else if (this.size == "queen") {
            base = 900000 ;
        } else {
            base = 1300000 ;
        }
        
        if (this.feel == "medium") {
            base += 100000;
        } 
        
        return base * this.qty;
    }
    
    public Foam (String feel, String size, int qty) {
        this.feel = feel;
        this.size = size;
        this.qty = qty;
    }
}
