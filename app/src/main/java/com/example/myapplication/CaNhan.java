package com.example.myapplication;

public class CaNhan {
    // Khóa chính
    private int id;
    private String hoTen;
    private String dienThoai;
    private String email;
    private String ngaySinh;
    private String gioiTinh;
    private String diaChi;
    private String chucVu;
    private String congTy;
    private String moTa;
    private String giaoCho;

    // Constructor đầy đủ
    public CaNhan(int id, String hoTen, String dienThoai, String email,
                  String ngaySinh, String gioiTinh, String diaChi,
                  String chucVu, String congTy, String moTa, String giaoCho) {
        this.id = id;
        this.hoTen = hoTen;
        this.dienThoai = dienThoai;
        this.email = email;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.chucVu = chucVu;
        this.congTy = congTy;
        this.moTa = moTa;
        this.giaoCho = giaoCho;
    }

    // Constructor rỗng
    public CaNhan() {}

    // Getter và Setter
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getHoTen() { return hoTen; }
    public void setHoTen(String hoTen) { this.hoTen = hoTen; }

    public String getDienThoai() { return dienThoai; }
    public void setDienThoai(String dienThoai) { this.dienThoai = dienThoai; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getNgaySinh() { return ngaySinh; }
    public void setNgaySinh(String ngaySinh) { this.ngaySinh = ngaySinh; }

    public String getGioiTinh() { return gioiTinh; }
    public void setGioiTinh(String gioiTinh) { this.gioiTinh = gioiTinh; }

    public String getDiaChi() { return diaChi; }
    public void setDiaChi(String diaChi) { this.diaChi = diaChi; }

    public String getChucVu() { return chucVu; }
    public void setChucVu(String chucVu) { this.chucVu = chucVu; }

    public String getCongTy() { return congTy; }
    public void setCongTy(String congTy) { this.congTy = congTy; }

    public String getMoTa() { return moTa; }
    public void setMoTa(String moTa) { this.moTa = moTa; }

    public String getGiaoCho() { return giaoCho; }
    public void setGiaoCho(String giaoCho) { this.giaoCho = giaoCho; }

    @Override
    public String toString() {
        return "CaNhan{" +
                "id=" + id +
                ", hoTen='" + hoTen + '\'' +
                ", dienThoai='" + dienThoai + '\'' +
                ", email='" + email + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", chucVu='" + chucVu + '\'' +
                ", congTy='" + congTy + '\'' +
                ", moTa='" + moTa + '\'' +
                ", giaoCho='" + giaoCho + '\'' +
                '}';
    }
}
