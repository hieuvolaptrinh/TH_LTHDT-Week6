package bai3;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        bai3_TKNganHang tk = new bai3_TKNganHang();
//        bai3_TKNganHang tk2 = new bai3_TKNganHang("123456789", "Nguyễn Văn A");
//        System.out.println(tk2.getSoTK());
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số tài khoản");
        tk.setSoTK(sc.nextLine());
        System.out.println("nhập tên chủ tài khoản");
        tk.setChuTk(sc.nextLine());
        System.out.println("nhập số dư");
        tk.setSoDu(sc.nextLong());
        int luaChon;
        do {
            System.out.println("1. gửi tiền");
            System.out.println("2. rút tiền");
            System.out.println("3. kiểm tra số dư");
            System.out.println("0. thoát");
            luaChon = sc.nextInt();
            switch (luaChon){
                case 1:
                    System.out.println("nhập số tiền bạn muốn gửi");
                    long tienGui = sc.nextLong();
                    tk.guiTien(tienGui);
                    break;
                case 2:
                    System.out.println("nhập số tiền bạn muốn rút");
                    long tienRut = sc.nextLong();
                    tk.rutTien(tienRut);
                    break;
                case 3:
                    tk.kiemTraSoDu();
                    break;
                default:
                    System.out.println("bạn đã thoát ");
                    break;
            }

        }while (luaChon != 0);
    }
}
