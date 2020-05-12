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
public class MainBai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShapeFactory hop1 = new ShapeFactory().createInstance();
        ShapeFactory hop2 = new ShapeFactory().createInstance();
        ShapeFactory hop3 = new ShapeFactory().createInstance();
        
        Shape Hinh1 = hop1.createShape(ShapeType.Circle);
        System.out.println(Hinh1.draw());
        Shape Hinh2 = hop2.createShape(ShapeType.Triangle);
        System.out.println(Hinh2.draw());
        Shape Hinh3 = hop3.createShape(ShapeType.Rectangle);
        System.out.println(Hinh3.draw());
    }
    
}
