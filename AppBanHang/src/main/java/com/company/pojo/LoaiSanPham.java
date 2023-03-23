/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.pojo;

/**
 *
 * @author DELL
 */
public class LoaiSanPham {

    /**
     * @return the IDLoaiSP
     */
    public String getIDLoaiSP() {
        return IDLoaiSP;
    }

    /**
     * @return the TenLoaiSP
     */
    public String getTenLoaiSP() {
        return TenLoaiSP;
    }

    /**
     * @param TenLoaiSP the TenLoaiSP to set
     */
    public void setTenLoaiSP(String TenLoaiSP) {
        this.TenLoaiSP = TenLoaiSP;
    }
    private String IDLoaiSP;
    private String TenLoaiSP;

    public LoaiSanPham() {
    }

    public LoaiSanPham(String IDLoaiSP, String TenLoaiSP) {
        this.IDLoaiSP = IDLoaiSP;
        this.TenLoaiSP = TenLoaiSP;
    }
     
}
