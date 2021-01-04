package data;

public class khachhang {
    private String makh;
    private String tenkh;
    private String gioitinh;
    private String capdo;
    private String sdt;

    public khachhang(String makh, String tenkh, String gioitinh, String capdo, String sdt) {
        this.makh = makh;
        this.tenkh = tenkh;
        this.gioitinh = gioitinh;
        this.capdo = capdo;
        this.sdt = sdt;
    }

    public khachhang() {
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getCapdo() {
        return capdo;
    }

    public void setCapdo(String capdo) {
        this.capdo = capdo;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return "khachhang{" +
                "makh='" + makh + '\'' +
                ", tenkh='" + tenkh + '\'' +
                ", gioitinh='" + gioitinh + '\'' +
                ", capdo='" + capdo + '\'' +
                ", sdt='" + sdt + '\'' +
                '}';
    }
}
