/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.pojo;

/**
 *
 * @author DELL
 */
public class Hang {

    /**
     * @return the maHang
     */
    public String getMaHang() {
        return maHang;
    }

    /**
     * @return the TenHang
     */
    public String getTenHang() {
        return TenHang;
    }

    /**
     * @param TenHang the TenHang to set
     */
    public void setTenHang(String TenHang) {
        this.TenHang = TenHang;
    }

    /**
     * @return the MaLoaiSanPham
     */
    public String getMaLoaiSanPham() {
        return MaLoaiSanPham;
    }

    /**
     * @param MaLoaiSanPham the MaLoaiSanPham to set
     */
    public void setMaLoaiSanPham(String MaLoaiSanPham) {
        this.MaLoaiSanPham = MaLoaiSanPham;
    }

    /**
     * @return the SoLuong
     */
    public double getSoLuong() {
        return SoLuong;
    }

    /**
     * @param SoLuong the SoLuong to set
     */
    public void setSoLuong(double SoLuong) {
        this.SoLuong = SoLuong;
    }

    /**
     * @return the donGiaNhap
     */
    public double getDonGiaNhap() {
        return donGiaNhap;
    }

    /**
     * @param donGiaNhap the donGiaNhap to set
     */
    public void setDonGiaNhap(double donGiaNhap) {
        this.donGiaNhap = donGiaNhap;
    }

    /**
     * @return the DonGiaBan
     */
    public double getDonGiaBan() {
        return DonGiaBan;
    }

    /**
     * @param DonGiaBan the DonGiaBan to set
     */
    public void setDonGiaBan(double DonGiaBan) {
        this.DonGiaBan = DonGiaBan;
    }

    /**
     * @return the Anh
     */
    public String getAnh() {
        return Anh;
    }

    /**
     * @param Anh the Anh to set
     */
    public void setAnh(String Anh) {
        this.Anh = Anh;
    }

    /**
     * @return the GhiChu
     */
    public String getGhiChu() {
        return GhiChu;
    }

    /**
     * @param GhiChu the GhiChu to set
     */
    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    /**
     * @return the IDKhuyenMai
     */
    public int getIDKhuyenMai() {
        return IDKhuyenMai;
    }

    /**
     * @param IDKhuyenMai the IDKhuyenMai to set
     */
    public void setIDKhuyenMai(int IDKhuyenMai) {
        this.IDKhuyenMai = IDKhuyenMai;
    }

    /**
     * @return the IDDonViTinh
     */
    public int getIDDonViTinh() {
        return IDDonViTinh;
    }

    /**
     * @param IDDonViTinh the IDDonViTinh to set
     */
    public void setIDDonViTinh(int IDDonViTinh) {
        this.IDDonViTinh = IDDonViTinh;
    }
    private String maHang;
    private String TenHang;
    private String MaLoaiSanPham;
    private double SoLuong;
    private double donGiaNhap;
    private double DonGiaBan;
    private String Anh;
    private String GhiChu;
    private int IDKhuyenMai;
    private int  IDDonViTinh;

    public Hang() {
    }

    public Hang(String maHang, String TenHang, String MaLoaiSanPham, double SoLuong, double donGiaNhap, double DonGiaBan, String Anh, String GhiChu, int IDKhuyenMai, int IDDonViTinh) {
        this.maHang = maHang;
        this.TenHang = TenHang;
        this.MaLoaiSanPham = MaLoaiSanPham;
        this.SoLuong = SoLuong;
        this.donGiaNhap = donGiaNhap;
        this.DonGiaBan = DonGiaBan;
        this.Anh = Anh;
        this.GhiChu = GhiChu;
        this.IDKhuyenMai = IDKhuyenMai;
        this.IDDonViTinh = IDDonViTinh;
    }
    
    
    
}
