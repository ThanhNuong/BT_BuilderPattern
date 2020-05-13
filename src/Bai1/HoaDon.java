/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.util.ArrayList;

public class HoaDon {
    HoaDonHeader hdheader = new HoaDonHeader();
    ArrayList<CTHD> cthd = new ArrayList<>();

    public HoaDon(Builder builder) {
        this.hdheader = builder.hdheader;
        this.cthd = builder.cthd;
    }

    @Override
    public String toString() {
       String hd ="";
       for(int i=0;i<cthd.size();i++)
       {
          hd="\nThong tin sản phẩm thứ "+(i+1)+
                  "\n Sản phẩm: "   +cthd.get(i).getSanPham()
                    +"\n Số lượng: "  +cthd.get(i).getSoLuong()
                    +"\n Đơn giá: "   +cthd.get(i).getDonGia()
                    +"\n Chiết khấu: "+cthd.get(i).getChietKhau();
       } return hd;
    }

     public String hienThiThongTinChiTietHD(){
        return "Thông tin hóa đơn:"
               +"\nMã Hóa đơn: " + hdheader.getMaHD() +
                "\nTên khách hàng: " + hdheader.getTenKH() +
                "\nNgày bán: " + hdheader.getNgayBan()
               +"\nDanh sách các sản phẩm: " + toString();
    }
    
    public static class Builder{
        HoaDonHeader hdheader = new HoaDonHeader();
        ArrayList<CTHD> cthd = new ArrayList<>();

        public Builder() {
        }
        
        public Builder addHoaDon(HoaDonHeader Header)
        {
            this.hdheader = Header;
            return this;
        }
               
        public Builder addChiTietHoaDon(CTHD listHD)
        {
            this.cthd.add(listHD);
            return this;
        }
        
        public HoaDon build(){
            return new HoaDon(this);
        }
    }
  
}
