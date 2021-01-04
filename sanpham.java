package data;

public class sanpham {
    private String masp;
    private String tensp;
    private int soluong;
    private double gianhap, giaban;
    private String size;
    private String ngaynhap;

    public sanpham(String masp, String tensp, int soluong, double gianhap, double giaban, String size, String ngaynhap) {
        this.masp = masp;
        this.tensp = tensp;
        this.soluong = soluong;
        this.gianhap = gianhap;
        this.giaban = giaban;
        this.size = size;
        this.ngaynhap = ngaynhap;
    }

    public sanpham() {
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getGianhap() {
        return gianhap;
    }

    public void setGianhap(double gianhap) {
        this.gianhap = gianhap;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    @Override
    public String toString() {
        return "sanpham{" +
                "masp='" + masp + '\'' +
                ", tensp='" + tensp + '\'' +
                ", soluong=" + soluong +
                ", gianhap=" + gianhap +
                ", giaban=" + giaban +
                ", size='" + size + '\'' +
                ", ngaynhap='" + ngaynhap + '\'' +
                '}';
    }
}
