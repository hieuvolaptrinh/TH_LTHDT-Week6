package bai3;

public class bai3_TKNganHang {
    private String soTK;
    private String chuTk;
    private long soDu;

    public bai3_TKNganHang(long soDu, String chuTk, String soTK) {
        this.soDu = soDu;
        this.chuTk = chuTk;
        this.soTK = soTK;
    }
    public bai3_TKNganHang( String chuTk, String soTK) {

        this.chuTk = chuTk;
        this.soTK = soTK;
    }
    public bai3_TKNganHang() {
    }

    public String getSoTK() {
        return soTK;
    }

    public void setSoTK(String soTK) {
        this.soTK = soTK;
    }

    public String getChuTk() {
        return chuTk;
    }

    public void setChuTk(String chuTk) {
        this.chuTk = chuTk;
    }

    public long getSoDu() {
        return soDu;
    }

    public void setSoDu(long soDu) {
        this.soDu = soDu;
    }
//    phương thức gửi thêm tiền zo tài khoản
    public void guiTien(long tienGui){
        System.out.println("bạn vừa nạp "   + tienGui + " vào tài khoản");
        this.setSoDu(this.getSoDu() + tienGui);
        System.out.println("số dư hiện tại của bạn là "+this.getSoDu());


    }
//    phương thức rút tiền
    public void rutTien(long tienRut){
        if(tienRut > this.getSoDu()){
            System.out.println("số dư không đủ để thực hiện giao dịch");
        }else{
            System.out.println("bạn vừa rút " + tienRut + " từ tài khoản");
            this.setSoDu(this.getSoDu() - tienRut);
            System.out.println("số dư hiện tại của bạn là "+this.getSoDu());
        }
    }
//    kiểm tra số dư
    public void kiemTraSoDu(){
        System.out.println("số dư hiện tại của bạn là "+this.getSoDu());
    }
}
