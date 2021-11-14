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
public class SpringBed extends Bed {
    
    public String generateId(int num) {
        return "SB" + Integer.toString(num);
    }
    
    public int getPrice() {
        int base = 0;
        
        if (this.size == "single") {
            base = 900000 ;
        } else if (this.size == "queen") {
            base = 1400000;
        } else {
            base = 1700000;
        }
        
        if (this.feel == "medium") {
            base += 150000;
        }
        
        return base;
    }
    
    public SpringBed (String feel, String size, int qty) {
        this.feel = feel;
        this.size = size;
        this.qty = qty;
    }
}
