package bai2;

import java.util.Date;
import java.util.Scanner;

public class SinhVien {
    private String masv;
    private String tensv;
    private String ngaysinh;
    private double dtb;
    //    public SinhVien(String masv, String tensv, String ngaysinh, double dtb)
//    {
//        this.masv = masv;
//        this.tensv = tensv;
//        this.ngaysinh = ngaysinh;
//        this.dtb = dtb;
//    }
    public SinhVien()
    {
    }
    public String getMasv()
    {
        return masv;
    }
    public void setMasv(String masv)
    {
        this.masv = masv;
    }
    public String getTensv()
    {
        return tensv;
    }

    public void setTensv(String tensv)
    {
        this.tensv = tensv;
    }
    public String getNgaysinh()
    {
        return ngaysinh;
    }
    public void setNgaysinh(String ngaysinh)
    {
        this.ngaysinh = ngaysinh;
    }
    public double getDtb()
    {
        return dtb;
    }
    public void setDtb(double dtb)
    {
        this.dtb = dtb;
    }
    @Override
    public String toString() {
        return "SinhVien{" +
                "masv='" + masv + '\'' +
                ", tensv='" + tensv + '\'' +
                ", ngaysinh='" + ngaysinh + '\'' +
                ", dtb=" + dtb +
                '}';
    }
    public void nhapthongtin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien ");
        masv = sc.nextLine();
        System.out.print("Nhap ten sinh vien ");
        tensv = sc.nextLine();
        System.out.print("Nhap ngay thang nam sinh (dd/MM/yyyy): ");
        ngaysinh = sc.nextLine();
        System.out.print("Nhap diem trung binh ");
        dtb = sc.nextDouble();
    }
}
