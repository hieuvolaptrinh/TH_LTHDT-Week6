import bai1_trenLop.HinhChuNhat;

public class test1_default {
    public static void main(String[] args) {
        HinhChuNhat hcn1 = new HinhChuNhat();
//        hcn1.chieuDai = 4;
        hcn1.chieuRong = 5;
        System.out.println("Dien tich hinh chu nhat la: " + hcn1.tinhDienTich());
        System.out.println("Chu vi hinh chu nhat la: " + hcn1.tinhChuVi());
    }
}
