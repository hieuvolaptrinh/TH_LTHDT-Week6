package bai2_trenLop;

import java.util.Calendar;
import java.util.Scanner;

public class SinhVien {
    Scanner sc = new Scanner(System.in);
    String maSV;
    String hoTen;
    Calendar ngaySinh;
    float diemTB;

    public void nhapThongTin() {
        System.out.println("Nhap ma sinh vien: ");
        this.maSV = sc.nextLine();
        System.out.println("Nhap ho ten sinh vien: ");
        this.hoTen = sc.nextLine();

        System.out.println("Nhap nam sinh: ");
        int nam = sc.nextInt();
        System.out.println("Nhap thang sinh: ");
        int thang = sc.nextInt();
        System.out.println("Nhap ngay sinh: ");
        int ngay = sc.nextInt();
        sc.nextLine();
        this.ngaySinh = Calendar.getInstance();
        this.ngaySinh.set(nam, thang - 1, ngay);  // Tháng tính từ 0, nên phải trừ 1
        System.out.println("Nhap diem trung binh: ");
        this.diemTB = sc.nextFloat();
    }

    public void inThongTin() {
        System.out.println("Ma sinh vien: " + this.maSV);
        System.out.println("Ho ten sinh vien: " + this.hoTen);
        System.out.println("Ngay sinh: " + this.ngaySinh.get(Calendar.DATE) + "/" + (this.ngaySinh.get(Calendar.MONTH) + 1) + "/" + this.ngaySinh.get(Calendar.YEAR));
        System.out.println("Diem trung binh: " + this.diemTB);
        System.out.println("------------------------------------------------------------");
    }

}
