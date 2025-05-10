class GiaoDich {
    private double soTien;
    private TaiKhoanNganHang taiKhoan;

    public GiaoDich(double soTien, TaiKhoanNganHang taiKhoan) {
        this.soTien = soTien;
        this.taiKhoan = taiKhoan;
    }

    public boolean thucHienGiaoDich() {
        if (taiKhoan == null) {
            System.out.println("Giao dịch thất bại: Tài khoản không tồn tại!");
            return false;
        }

        if (taiKhoan.rutTien(soTien)) {
            System.out.println("Giao dịch thành công! Rút " + soTien + " từ tài khoản " + taiKhoan.getSoTaiKhoan());
            System.out.println("Số dư còn lại: " + taiKhoan.getSoDu());
            return true;
        } else {
            System.out.println("Giao dịch thất bại: Số dư không đủ hoặc số tiền không hợp lệ!");
            return false;
        }
    }
}