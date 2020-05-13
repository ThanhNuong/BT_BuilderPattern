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

    public Triangle() {
        System.out.println("\nChào các bạn!  Đây là hình Triangle");
    }

   @Override
    public String draw() {
        brush ="Chuẩn bị vẽ bằng bút chì màu xanh";
        paper ="\nchuẩn bị giấy vẽ màu hồng";
        frame ="\nChuẩn bị khung vẽ A0";
        return brush + paper + frame;
    }
}
