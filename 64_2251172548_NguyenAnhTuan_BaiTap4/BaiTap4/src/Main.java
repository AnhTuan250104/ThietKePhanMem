public class Main {
    public static void main(String[] args) {
        
        TaiKhoanNganHang tk = new TaiKhoanNganHang("0376982270", 1000000);
        System.out.println("Tài khoản " + tk.getSoTaiKhoan() + " - Số dư ban đầu: " + tk.getSoDu());

        
        GiaoDich gd1 = new GiaoDich(500000, tk);
        gd1.thucHienGiaoDich();

        
        GiaoDich gd2 = new GiaoDich(700000, tk);
        gd2.thucHienGiaoDich();

        
        GiaoDich gd3 = new GiaoDich(100000, null);
        gd3.thucHienGiaoDich();
    }
}