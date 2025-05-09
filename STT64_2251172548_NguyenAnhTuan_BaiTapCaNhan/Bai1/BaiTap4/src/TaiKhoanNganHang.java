class TaiKhoanNganHang {
    private String soTaiKhoan;
    private double soDu;

    public TaiKhoanNganHang(String soTaiKhoan, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.soDu = soDu;
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public double getSoDu() {
        return soDu;
    }

    public boolean rutTien(double soTien) {
        if (soTien > 0 && soDu >= soTien) {
            soDu -= soTien;
            return true;
        }
        return false;
    }
}