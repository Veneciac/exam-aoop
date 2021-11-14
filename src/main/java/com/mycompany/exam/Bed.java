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
abstract public class Bed {
    public String feel;
    public String size;
    public int qty;
    
    public abstract String generateId (int id);
    public abstract int getPrice();
}
