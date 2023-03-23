/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.service;

import com.company.conf.JdbcUtils;

import com.company.pojo.LoaiSanPham;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class LoaiSanPhamService {
    public static List<LoaiSanPham> GetLoaiSanPham() throws SQLException{
        List<LoaiSanPham> listloaisanpham = new ArrayList<>();
         try ( Connection conn = JdbcUtils.getConn()) {           
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM tblloaisanpham");
            while (rs.next()) {
                LoaiSanPham c = new LoaiSanPham(rs.getString("MaLoaiSanPham"), rs.getString("TenLoaiSanPham"));
                listloaisanpham.add(c);
            }
        }
        return listloaisanpham;
    }
}
