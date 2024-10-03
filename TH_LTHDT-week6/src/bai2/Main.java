package bai2;

import bai2.DanhSachSinhVien;

public class Main {
    public static void main(String[] args) {
        DanhSachSinhVien ds = new DanhSachSinhVien();
        ds.NhapDS();
        System.out.println("Danh sách sinh viên trước khi sắp xếp:");
        ds.InDS();
    }
}