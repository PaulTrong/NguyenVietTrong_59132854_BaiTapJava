package baitap4;

/**
 *
 * @author TRONG
 */
public class baitap4Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NoiThanh noiThanh1 = new NoiThanh("1","Nguyen Viet Trong","032",20,300,150000);
        NoiThanh noiThanh2 = new NoiThanh("1","Nguyen Viet Trong","1203",10,150,60000);
        NoiThanh noiThanh3 = new NoiThanh("1","Dinh Trong","723",15,1850,85000);

        NgoaiThanh ngoaiThanh1 = new NgoaiThanh("1","Nguyen Viet Trong","331","Ha Tinh",20,7000000);
        NgoaiThanh ngoaiThanh2 = new NgoaiThanh("1","Nguyen Viet Vinh","777","TPHCM",10,4500000);
        NgoaiThanh ngoaiThanh3 = new NgoaiThanh("1","Ho Quang Hieu","227","Khanh Hoa",15,800000);

        QuanLyChuyenXe quanLyChuyenXe= new QuanLyChuyenXe();
        quanLyChuyenXe.them(noiThanh1);
        quanLyChuyenXe.them(noiThanh2);
        quanLyChuyenXe.them(noiThanh3);
        quanLyChuyenXe.them(ngoaiThanh1);
        quanLyChuyenXe.them(ngoaiThanh2);
        quanLyChuyenXe.them(ngoaiThanh3);

        System.out.println("Thong tin tung chuyen xe:\n");
        quanLyChuyenXe.xuat();

        System.out.println("\nTong doanh thu cua xe noi thanh:"+quanLyChuyenXe.tinhDoanhThuNoiThanh());
        System.out.println("Tong doanh thu cua xe ngoai thanh:"+quanLyChuyenXe.tinhDoanhThuNgoaiThanh());
        System.out.println("Tong doanh thu: "+quanLyChuyenXe.tinhTongDoanhThu());
    }
}
