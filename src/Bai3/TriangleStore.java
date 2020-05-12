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
public class TriangleStore extends ShapeStore{
    private static TriangleStore instance;

    public static TriangleStore Createinstance(){
        if(instance==null)
            instance = new TriangleStore();
        return instance;
    }
    @Override
    protected Shape createShape(ShapeType type) {
        switch(type){
            case Triangle : return Triangle.createinstance();
           }
        return null;
    }
}
