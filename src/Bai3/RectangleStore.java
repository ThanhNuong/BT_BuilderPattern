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
public class RectangleStore extends ShapeStore{

    private static RectangleStore instance;

    public static RectangleStore Createinstance(){
        if(instance==null)
            instance = new RectangleStore();
        return instance;
    }
    @Override
    protected Shape createShape(ShapeType type) {
        switch(type){
            case Rectangle : return Rectangle.createinstance();
           }
        return null;
    }
    
}
