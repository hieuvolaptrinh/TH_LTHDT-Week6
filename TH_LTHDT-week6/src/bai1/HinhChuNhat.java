package bai1;

import java.util.Scanner;

public class HinhChuNhat {
    private double cd, cr;

    public HinhChuNhat()
    {
    }
    public double getCd()
    {
        return this.cd;
    }
    public void setCd(double cd)
    {
        this.cd = cd;
    }
    public double getCr()
    {

        return this.cr;
    }
    public void setCr(double cr)
    {
        this.cr = cr;
    }

    public double chuvi()
    {

        return ((cr + cd) * 2);
    }
    public double  dientich()
    {
        return (cd * cr);
    }
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        this.cd = sc.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        this.cr = sc.nextDouble();
    }
    public void xuat()
    {
        System.out.println("Chiều dài: "+this.cd);
        System.out.println("Chiều rộng "+this.cr);
        System.out.println("Chu vi hình chữ nhật là: "+this.chuvi());
        System.out.println("Diện tích hình chữ nhật là: "+this.dientich());
    }
}
