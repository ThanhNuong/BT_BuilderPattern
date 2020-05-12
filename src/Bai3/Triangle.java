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
public class Triangle extends Shape{
    
    private static Triangle instance;

    protected Triangle() {
        brush = "Brush của đối tượng Triangle";
        paper = "paper của Triangle";
        frame = "frame của Triangle";
    }
    
    public static Triangle createinstance(){
        if(instance==null)
            instance = new Triangle();
        return instance;
    }
    
    @Override
    public String draw() {
        return "Vẽ theo đối tượng Triangle";
    }
    
}
