/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;
import baitap1.NhanVien;
/**
 *
 * @author TRONG
 */
public class baitap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // create quan ly nhan vien object
    IQuanLy qlNhanVien = new QuanLyNhanVien();

    // create nhan vien
    NhanVien nv1 = new NhanVien();
    nv1.setTen("Nguyen Viet Vinh");
    nv1.setTuoi(20);
    nv1.setDiaChi("Ha Tinh");
    nv1.setTienLuong(50000000);
    nv1.setTongSoGioLam(500);

    // create nhan vien
    NhanVien nv2 = new NhanVien();
    nv2.setTen("Nguyen Viet Binh");
    nv2.setTuoi(24);
    nv2.setDiaChi("TP.HCM");
    nv2.setTienLuong(20000000);
    nv2.setTongSoGioLam(200);

    // create nhan vien
    NhanVien nv3 = new NhanVien();
    nv3.setTen("Le Quan Duc");
    nv3.setTuoi(22);
    nv3.setDiaChi("Nha Trang - Khanh Hoa");
    nv3.setTienLuong(19000000);
    nv3.setTongSoGioLam(150);

    // create nhan vien
    NhanVien nv4 = new NhanVien();
    nv4.setTen("Ho Thi Dao");
    nv4.setTuoi(23);
    nv4.setDiaChi("Vinh - Nghe An");
    nv4.setTienLuong(25000000);
    nv4.setTongSoGioLam(250);

    // create nhan vien
    NhanVien nv5 = new NhanVien();
    nv5.setTen("Ngo Van Nhat");
    nv5.setTuoi(24);
    nv5.setDiaChi("Da Nang");
    nv5.setTienLuong(150000000);
    nv5.setTongSoGioLam(100);

    // add nhan vien list vao qlNhanVien
    qlNhanVien.them(nv1);
    qlNhanVien.them(nv2);
    qlNhanVien.them(nv3);
    qlNhanVien.them(nv4);
    qlNhanVien.them(nv5);

    // in danh sach nhan vie
    qlNhanVien.inDS();
    }
    
}
