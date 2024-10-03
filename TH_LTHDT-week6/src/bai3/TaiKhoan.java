package bai3;

import java.util.Scanner;

public class TaiKhoan {
    private String sotk;
    private String chutk;
    private double sodu;

    public TaiKhoan(String sotk, String chutk, double sodu) {
        this.sotk = sotk;
        this.chutk = chutk;
        this.sodu = sodu;
    }
    public String getSotk()
    {
        return sotk;
    }
    public void setSotk(String sotk)
    {
        this.sotk = sotk;
    }
    public String getChutk()
    {
        return chutk;
    }
    public void setChutk(String chutk)
    {
        this.chutk = chutk;
    }
    public double getSodu()
    {
        return sodu;
    }
    public void setSodu(double sodu)
    {
        this.sodu = sodu;
    }
    public void guitien()
    {
        System.out.print("Nhap so tien gui: ");
        Scanner sc = new Scanner(System.in);
        double sotien = sc.nextDouble();
        if(sotien>0) {
            this.sodu = this.sodu + sotien;
            System.out.println("Gui thanh cong "+sotien +" VNĐ");
        }
        else
            System.out.println("So tien khong hop le ");
    }
    public void ruttien()
    {
        System.out.print("Nhap so tien rut ");
        Scanner sc = new Scanner(System.in);
        double sotien = sc.nextDouble();
        if(sotien > 0 && sotien <=this.sodu)
        {
            this.sodu = this.sodu - sotien;
            System.out.println("Rut thanh cong "+sotien +" VNĐ");
        }
        else
            System.out.println("So tien khong hop le");
    }
    public double kiemtrasodu()
    {
        return sodu;
    }
    @Override
    public String toString() {
        return "TaiKhoan{" +
                "sotk='" + sotk + '\'' +
                ", chutk='" + chutk + '\'' +
                ", sodu=" + sodu +
                '}';
    }
}
