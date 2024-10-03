package bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> ds;

    public DanhSachSinhVien() {
        ds=new ArrayList<>();
    }
    public void NhapDS(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so luong sinh vien :");
        int n=sc.nextInt();
        SinhVien sv=new SinhVien("","",null,0);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cua sinh vien thu "+(i+1)+" : ");
            sv.NhapThongTin();
            ds.add(sv);
        }
    }
    public void InDS(){
        for (SinhVien sv:ds){
            sv.InThongTin();
            System.out.println("-------------");
        }

    }
}
