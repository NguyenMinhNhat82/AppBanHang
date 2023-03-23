/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.pojo;

/**
 *
 * @author DELL
 */
public class KhachHang {
    private String maKH;
    private String TenKhachhang;
    private String DiaChi;
    private String DienThoai;
    public KhachHang(){} 

    public KhachHang(String maKH, String TenKhachhang, String DiaChi, String DienThoai) {
        this.maKH = maKH;
        this.TenKhachhang = TenKhachhang;
        this.DiaChi = DiaChi;
        this.DienThoai = DienThoai;
    }
    
   

    /**
     * @return the maKH
     */
    public String getMaKH() {
        return maKH;
    }

    /**
     * @param maKH the maKH to set
     */

    /**
     * @return the TenKhachhang
     */
    public String getTenKhachhang() {
        return TenKhachhang;
    }

    /**
     * @param TenKhachhang the TenKhachhang to set
     */
    public void setTenKhachhang(String TenKhachhang) {
        this.TenKhachhang = TenKhachhang;
    }

    /**
     * @return the DiaChi
     */
    public String getDiaChi() {
        return DiaChi;
    }

    /**
     * @param DiaChi the DiaChi to set
     */
    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    /**
     * @return the DienThoai
     */
    public String getDienThoai() {
        return DienThoai;
    }

    /**
     * @param DienThoai the DienThoai to set
     */
    public void setDienThoai(String DienThoai) {
        this.DienThoai = DienThoai;
    }
   
}
