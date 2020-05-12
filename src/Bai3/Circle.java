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

    private static Circle instance;

    protected Circle() {
        brush = "Brush của đối tượng Circle";
        paper = "paper của Circle";
        frame = "frame của Circle";
    }
    
    public static Circle createinstance(){
        if(instance==null)
            instance = new Circle();
        return instance;
    }
    
    @Override
    public String draw() {
        return "Vẽ theo đối tượng Circle";
    }
}
