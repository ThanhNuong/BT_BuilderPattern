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

    public static void main(String[] args) throws ParseException {
        HoaDonHeader hdheader = new HoaDonHeader("HD001", "Thanh Nương", new SimpleDateFormat("dd/mm/yy").parse("10/05/2020"));
        CTHD cthd1 = new CTHD("Mỹ phẩm chăm sóc da", 100, 5000000,0.7f);
        HoaDon hd1 = new HoaDon.Builder()
                .addHoaDon(hdheader)
                .addChiTietHoaDon(cthd1)
                .build();
        System.out.println(hd1.hienThiThongTinChiTietHD());
    }
    
}
