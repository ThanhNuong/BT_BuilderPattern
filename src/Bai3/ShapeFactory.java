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
public  class ShapeFactory {
    public Shape createShape(ShapeType type)
    {
        switch(type)
        {
            case Rectangle : return new Rectangle();
            case Triangle: return new Triangle();
            case Circle: return new Circle();
                    
        }return null;
    }
    
    public static ShapeFactory instance;
        
        public static ShapeFactory createInstance()
        {
            if(instance == null)
                instance = new ShapeFactory();
                return instance;
        }
}
