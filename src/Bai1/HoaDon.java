/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.util.ArrayList;
import java.util.Date;

public class HoaDon {
    HoaDonHeader hdheader;
    ArrayList<CTHD> cthd = new ArrayList<>();

    public HoaDon(Builder builder) {
        this.hdheader = builder.hdheader;
    }

    @Override
    public String toString() {
        return "Chi tiết hóa đơn: \n Mã hóa đơn: "+hdheader.getMaHD()+
                "\nTen khách hàng: "+hdheader.getTenKH()+ "\nNgay bán: "+hdheader.getNgayBan();
    }

    
    
    
    public static class Builder{
        HoaDonHeader hdheader;
        ArrayList<CTHD> cthd = new ArrayList<>();

        public Builder() {
        }
        
        public Builder addMaHD(String maHD){
            this.hdheader.setMaHD(maHD);
            return this;
        }
        
        public Builder addTenKH(String tenKH){
            this.hdheader.setTenKH(tenKH);
            return this;
        }
        
        public Builder addNgayBan(Date ngayBan){
            this.hdheader.setNgayBan(ngayBan);
            return this;
        }
        
        public HoaDon build(){
            return new HoaDon(this);
        }
    }
   
}
