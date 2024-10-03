package bai3;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class TaiKhoan {
    private String soTK;
    private String tenTK;
    private double soDu;
    public TaiKhoan(String soTK, String tenTK, double soDu) {
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.soDu = soDu;
    }
    //Phương thức gửi tiền
    public void guiTien(double soTien) {
        if (soTien > 0) {
            this.soDu += soTien;
            System.out.println("Đã gửi " + soTien + " vào tài khoản. Số dư hiện tại: " + soDu);
        } else {
            System.out.println("Số tiền gửi không hợp lệ.");
        }
    }

    // Phương thức rút tiền
    public void rutTien(double soTien) {
        if (soTien > 0 && soTien <= this.soDu) {
            this.soDu -= soTien;
            System.out.println("Đã rút " + soTien + " từ tài khoản. Số dư hiện tại: " + soDu);
        } else if (soTien > this.soDu) {
            System.out.println("Số dư không đủ để rút tiền.");
        } else {
            System.out.println("Số tiền rút không hợp lệ.");
        }
    }

    // Phương thức kiểm tra số dư
    public double kiemTraSoDu() {
        System.out.println("Số dư hiện tại: " + this.soDu);
        return this.soDu;
    }
    //Phương thức nhập thông tin khách hàng
    public void NhapThongTinKhachHang(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số tài khoản :");
        this.soTK=sc.nextLine();
        System.out.println("Nhập tên tài khoản :");
        this.tenTK=sc.nextLine();
        System.out.println("Nhập số dư :");
        this.soDu=sc.nextDouble();
    }
    //Phương thức xuất ra thông tin khách hàng
    public void InThongTinKhachHang(){
        System.out.println("Số tài khoản : "+this.soTK);
        System.out.println("Tên tài khoản :"+this.tenTK);
        System.out.println("Số dư tài khoản :"+this.soDu);
    }
}
