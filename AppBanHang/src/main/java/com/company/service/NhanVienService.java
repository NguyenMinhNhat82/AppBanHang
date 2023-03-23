/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.service;

import com.company.conf.JdbcUtils;
import com.company.pojo.ChiNhanh;
import com.company.pojo.NhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class NhanVienService {
    public static boolean Login(String IDNV, String pw) throws SQLException{
        try ( Connection conn = JdbcUtils.getConn()) {
           
            PreparedStatement stm = conn.prepareCall("Select * from tblnhanvien where MaNhanVien = ? and Password = ?");            
            stm.setString(1, IDNV);
            stm.setString(2, pw);
            ResultSet r = stm.executeQuery();
            if(r.next())
                return true;
            else return false;
        }
    }
    
    public static List<NhanVien> GetNhanVien() throws SQLException{
        List<NhanVien> listNhanVien = new ArrayList<>();
         try ( Connection conn = JdbcUtils.getConn()) {           
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM tblnhanvien");
            while (rs.next()) {
                NhanVien n = new NhanVien(rs.getString("MaNhanVien"), rs.getString("TenNhanVien"),rs.getString("GioiTinh"),rs.getString("DiaChi"),rs.getString("DienThoai"),rs.getDate("NgaySinh"),rs.getInt("idChiNhanh"),rs.getString("Password"));
                listNhanVien.add(n);
            }
        }
        return listNhanVien; 
    }
}
