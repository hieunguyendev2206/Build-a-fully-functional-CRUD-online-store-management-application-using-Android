package vn.poly.quanlybanhang.Model;

public class SanPham {
    private final String maSanPham;
    private final String maLoai;
    private final String ten;
    private final String donViTinh;
    private final double giaNhap;
    private final double giaBan;
    private final byte[] image;
    private int soLuong;

    public SanPham(String maSanPham, String maLoai, String ten, String donViTinh, int soLuong, double giaNhap, double giaBan, byte[] image) {
        this.maSanPham = maSanPham;
        this.maLoai = maLoai;
        this.ten = ten;
        this.donViTinh = donViTinh;
        this.soLuong = soLuong;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.image = image;
    }

    public byte[] getImage() {
        return image;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public String getMaLoai() {
        return maLoai;
    }


    public String getTen() {
        return ten;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public double getGiaBan() {
        return giaBan;
    }

}
