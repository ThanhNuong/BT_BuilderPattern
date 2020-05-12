/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

/**
 *
 * @author Admin
 */
public class Circle extends Shape{

    public Circle() {
        System.out.println("Day la hinh tron");
    }

    
    
   @Override
    public String draw() {
        brush ="\nVẽ bằng";
        paper ="\nVẽ giấy ";
        frame ="\nVẽ khung ";
        
        return brush + paper + frame;
    }
   
}
