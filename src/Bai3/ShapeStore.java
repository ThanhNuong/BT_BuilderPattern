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
public abstract class ShapeStore {
    
    protected abstract Shape createShape(ShapeType type);
    public Shape kindShape(ShapeType type){
        Shape shape = createShape(type);
        shape.draw();
        return shape;
    }
}
