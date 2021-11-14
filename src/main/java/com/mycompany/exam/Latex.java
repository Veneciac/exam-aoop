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
public class Latex extends Bed {
        
    public String generateId(int num) {
        return "LX" + Integer.toString(num);
    }
    
    public int getPrice() {
        int base = 0;
        
        if (this.size == "single") {
            base = 1300000  ;
        } else if (this.size == "queen") {
            base = 1900000 ;
        } else {
            base = 2200000 ;
        }
        
        if (this.feel == "medium") {
            base += 250000;
        } else if (this.feel == "hard") {
            base += 150000;
        }
        
        return base;
    }
    
    public Latex (String feel, String size, int qty) {
        this.feel = feel;
        this.size = size;
        this.qty = qty;
    }
}
