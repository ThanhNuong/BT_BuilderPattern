/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Admin
 */
public class MainBai1 {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        HoaDon hd1 = new HoaDon.Builder()
               .addMaHD("HD002")
                .addTenKH("Thanh Nuong")
                .addNgayBan(new SimpleDateFormat("dd/MM/yy").parse("04/11/2020"))
                .build();
        System.out.println(hd1.toString());
    }
    
}
