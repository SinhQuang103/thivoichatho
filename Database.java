package Thi;

public class Database {
    private int maSP;
    private String tenSP;
    private int gia;
    private int soluong;
    private String mota;

    public Database(int maSP, String tenSP, int gia, int soluong, String mota) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.gia = gia;
        this.soluong = soluong;
        this.mota = mota;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    @Override
    public String toString() {
        return "Database{" +
                "maSP=" + maSP +
                ", tenSP='" + tenSP + '\'' +
                ", gia=" + gia +
                ", soluong=" + soluong +
                ", mota='" + mota + '\'' +
                '}';
    }
}
