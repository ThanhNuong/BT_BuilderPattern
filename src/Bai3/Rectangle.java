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
public class Rectangle extends Shape{

    public Rectangle() {
        System.out.println("Đây là hình chữ nhật");
    }

    
    
   @Override
    public String draw() {
        brush ="\nVẽ bằng";
        paper ="\nVẽ giấy ";
        frame ="\nVẽ khung ";
        
        return brush + paper + frame;
    }
   

   
    
}
