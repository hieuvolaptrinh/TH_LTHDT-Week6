package bai2_trenLop;

import java.util.ArrayList;
import java.util.Scanner;

public class test2_trenLop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> dsSV= new ArrayList<>();

        System.out.println("nhap so luong sinh vien trong danh sach");
        int n=sc.nextInt();
//        SinhVien[] dsSV2 = new SinhVien[n];
        for (int i = 0; i < n; i++) {
            SinhVien sv = new SinhVien();
            System.out.println("Nhap thong tin sinh vien thu " + (i+1));
            sv.nhapThongTin();
            dsSV.add(sv);
        }

        System.out.println("Danh sach sinh vien vua nhap la: ");
        for (SinhVien sv : dsSV) {
            sv.inThongTin();
        }
        System.out.println("sap xep danh sach sinh vien co diem giam dan la");
        for (int i = 0; i < dsSV.size(); i++) {
            for (int j = i+1; j < dsSV.size(); j++) {
                if (dsSV.get(i).diemTB < dsSV.get(j).diemTB) {
                    SinhVien temp = dsSV.get(i);
                    dsSV.set(i, dsSV.get(j));
                    dsSV.set(j, temp);
                }
            }
        }
        for (SinhVien sv : dsSV) {
            sv.inThongTin();
        }

    }
}
