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
        // TODO code application logic here
//        ShapeStore store1 = new CircleStore();
//        Shape shape1 = store1.kindShape(ShapeType.Circle);
//        System.out.println(shape1.toString());
        
//        ShapeStore store2 = new TriangleStore();
//        Shape shape2 = store2.kindShape(ShapeType.Triangle);
//        System.out.println(shape2.toString());
//        
         ShapeStore store = new RectangleStore();
        Shape shape = store.kindShape(ShapeType.Rectangle);
        System.out.println(shape.toString());
    }
    
}
