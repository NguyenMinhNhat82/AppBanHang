/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.service;

import com.company.conf.JdbcUtils;
import com.company.pojo.Hang;
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
public class SanPhamService {
    public static List<Hang> GetSanPham() throws SQLException{
        List<Hang> listsanpham = new ArrayList<>();
         try ( Connection conn = JdbcUtils.getConn()) {           
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM tblhang");
            while (rs.next()) {
                Hang c = new Hang(rs.getString("MaHang"),
                        rs.getString("TenHang"),
                        rs.getString("MaLoaiSanPham"),
                        rs.getDouble("SoLuong"),
                        rs.getDouble("DonGiaNhap"),
                        rs.getDouble("DonGiaBan"),
                        rs.getString("Anh"),
                        rs.getString("GhiChu"),
                        rs.getInt("IdKhuyenMai"),
                        rs.getInt("DonViTinh"));
                listsanpham.add(c);
            }
        }
        return listsanpham;
    }
}
