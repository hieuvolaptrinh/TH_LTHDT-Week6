/*Tạo lớp Sinh viên:
•	Tạo lớp SinhVien với các thuộc tính: mã sinh viên, tên, ngày sinh, điểm trung bình.
•	Viết các phương thức nhập thông tin, in thông tin.
•	Sắp xếp danh sách sinh viên theo điểm trung bình giảm dần. */

import java.util.Scanner;

public class Bai2 {
    public class SinhVien {
        private String MaSV;
        private String Ten;
        private String NgSinh;
        private double DTB;

        public SinhVien(String MaSV, String Ten, String NgSinh, double DTB ){
            this.MaSV=MaSV;
            this.Ten=Ten;
            this.NgSinh=NgSinh;
            this.DTB=DTB;
        }

        public void Nhap(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap vao ma sinh vien:" );
            String MaSV = sc.nextLine;
            System.out.println("Nhap vao ten sinh vien:" );
            String Ten = sc.nextLine;
            System.out.println("Nhap vao ngay sinh sinh vien:" );
            String NgSinh = sc.nextLine;
            System.out.println("Nhap vao diem trung binh:" );
            double MaSV = sc.nextDouble();
        }

        public void In(){
            System.out.println("Ma sinh vien :" +MaSV);
            System.out.println("Ten sinh vien :"+Ten);
            System.out.println("Ngay sinh:"+NgSinh);
            System.out.println("Diem trung binh cua sinh vien:" +DTB);
        }
    }
    public static void main(String[] args) {
        
    }
    
}
