package data;

public class Nhanvien {
    private String Manv;
    private String Tennv;
    private int Sdt;

    public Nhanvien(String manv, String tennv, int sdt) {
        this.Manv = manv;
        this.Tennv = tennv;
        this.Sdt = sdt;
    }

    public String getManv() {
        return Manv;
    }

    public void setManv(String manv) {
        Manv = manv;
    }

    public String getTennv() {
        return Tennv;
    }

    public void setTennv(String tennv) {
        Tennv = tennv;
    }

    public int getSdt() {
        return Sdt;
    }

    public void setSdt(int sdt) {
        Sdt = sdt;
    }

    @Override
    public String toString() {
        return "Nhanvien{" +
                "Manv='" + Manv + '\'' +
                ", Tennv='" + Tennv + '\'' +
                ", Sdt=" + Sdt +
                '}';
    }
}
