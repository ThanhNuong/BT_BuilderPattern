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
public class CircleStore extends ShapeStore{
    private static CircleStore instance;

    public static CircleStore Createinstance(){
        if(instance==null)
            instance = new CircleStore();
        return instance;
    }
    @Override
    protected Shape createShape(ShapeType type) {
        switch(type){
            case Circle : return Circle.createinstance();
           }
        return null;
    }
}
