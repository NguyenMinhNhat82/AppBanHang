/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.service;

import com.company.conf.JdbcUtils;
import com.company.pojo.KhachHang;
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
public class KhachHangService {
    public static List<KhachHang> GetKhachHang() throws SQLException{
        List<KhachHang> listkhachhang = new ArrayList<>();
         try ( Connection conn = JdbcUtils.getConn()) {           
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM tblkhach");
            while (rs.next()) {
                KhachHang c = new KhachHang(rs.getString("MaKhach"), rs.getString("TenKhach"),rs.getString("DiaChi"),rs.getString("DienThoai"));
                listkhachhang.add(c);
            }
        }
        return listkhachhang;
    }
}
