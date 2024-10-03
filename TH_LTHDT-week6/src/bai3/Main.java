package bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TaiKhoan tk=new TaiKhoan(null,null,0);
        tk.NhapThongTinKhachHang();
        System.out.println("Nhap so tien ban can gui :");
        double sotien=sc.nextDouble();
        tk.guiTien(sotien);
    }
}
