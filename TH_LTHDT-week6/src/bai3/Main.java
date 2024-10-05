package bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        TaiKhoan tk=new TaiKhoan(null,null,0);
        tk.NhapThongTinKhachHang();
        do {
            System.out.println("Nhập 0 để thoát ");
            System.out.println("Nhập 1 để gửi tiền ");
            System.out.println("Nhập 2 để rút tiền ");
            System.out.println("Nhập 3 để xem số dư tài khoản");
            n = sc.nextInt();
            if (n==1){
                System.out.println("Nhap so tien ban can gui :");
                double sotien=sc.nextDouble();
                tk.guiTien(sotien);
            }
            if (n==2) {
                System.out.println("Nhập số tiền cần gửi : ");
                double tienGui = sc.nextDouble();
                tk.guiTien(tienGui);
            }
            if (n==3)
                tk.kiemTraSoDu();
        }while (n!=0);
    }
}
