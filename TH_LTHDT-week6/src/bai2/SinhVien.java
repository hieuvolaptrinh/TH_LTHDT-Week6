package bai2;

import java.util.Scanner;

public class SinhVien {
    private String tenSv;
    private String maSv;
    private Ngay NgaySinh;
    private double diemTB;

    public SinhVien(String tenSv, String maSv, Ngay ngaySinh, double diemTB) {
        this.tenSv = tenSv;
        this.maSv = maSv;
        this.NgaySinh = ngaySinh;
        this.diemTB = diemTB;
    }
    public void NhapThongTin(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap ma sinh vien :");
        this.maSv=sc.nextLine();
        System.out.println("Nhap ten sinh vien :");
        this.tenSv=sc.nextLine();
        System.out.println("Nhap ngay sinh(ngay/thang/nam) :");
        int ngay=sc.nextInt();
        int thang=sc.nextInt();
        int nam=sc.nextInt();
        this.NgaySinh=new Ngay(ngay,thang,nam);
        System.out.println("Nhap diem trung binh :");
        this.diemTB=sc.nextDouble();
    }
    public void InThongTin(){
        System.out.println("Ma sinh vien : "+this.maSv);
        System.out.println("Ten sinh vien : "+this.tenSv);
        System.out.println("Ngay sinh : "+this.NgaySinh);
        System.out.println("Diem trung binh : "+this.diemTB);
    }

    public double getDiemTB() {
        return diemTB;
    }
}
