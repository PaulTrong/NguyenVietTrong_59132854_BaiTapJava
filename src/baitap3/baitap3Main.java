/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

/**
 *
 * @author TRONG
 */
public class baitap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SinhVienIT sinhVienIT = new SinhVienIT("Ngo Nguyen Tuong Nghi", 10.0, 8.8, 8.0);
        sinhVienIT.Xuat();

        SinhVienBiz sinhVienBiz = new SinhVienBiz("Nguyen Hoang Lan Anh", 10.0, 10.0);
        sinhVienBiz.Xuat();
    }
    
}
