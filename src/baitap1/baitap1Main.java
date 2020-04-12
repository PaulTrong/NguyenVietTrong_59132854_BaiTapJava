/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author TRONG
 */
public class baitap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             // tao moi nhan vien
        NhanVien nv1 = new NhanVien();
        nv1.setTen("Nguyen Viet Trong");
        nv1.setTuoi(21);
        nv1.setDiaChi("Ha Tinh");
        nv1.setTienLuong(10000000);
        nv1.setTongSoGioLam(100);
        
        // tao moi nhan vien
        NhanVien nv2 = new NhanVien();
        nv2.setTen("Nguyen Thi Yen");
        nv2.setTuoi(19);
        nv2.setDiaChi("Nha Trang - Khanh Hoa");
        nv2.setTienLuong(5000000);
        nv2.setTongSoGioLam(200);

        // in thong tin nhan vien
        System.out.println(nv1.getThongTin());
        System.out.println(nv2.getThongTin());
    }
    
}
