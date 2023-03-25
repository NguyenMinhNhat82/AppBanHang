
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.service;

import com.company.conf.JdbcUtils;
import com.company.pojo.ChiNhanh;
import com.company.pojo.ChiNhanh;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author DELL
 */
public class ChiNhanhService {
    public static List<ChiNhanh> GetChiNhanh() throws SQLException{
        List<ChiNhanh> listchinhanh = new ArrayList<>();
         try ( Connection conn = JdbcUtils.getConn()) {           
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM tblchinhanh");
            while (rs.next()) {
                ChiNhanh c = new ChiNhanh(rs.getInt("id"), rs.getString("DiaChi"));
                listchinhanh.add(c);
            }
        }
        return listchinhanh;
    }
    
    public static List<ChiNhanh> GetChiNhanhByID(String ID) throws SQLException{
        List<ChiNhanh> listChiNhanh = new ArrayList<>();
        try (Connection conn = JdbcUtils.getConn()) {
            String sql = "SELECT * FROM tblchinhanh";
            if (ID != null && !ID.isEmpty())
                sql += " WHERE id = ?";
            
            PreparedStatement stm = conn.prepareCall(sql);
            if (ID != null && !ID.isEmpty())
                stm.setString(1, ID);
            
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
               ChiNhanh n = new ChiNhanh(rs.getInt("id"), rs.getString("DiaChi"));
               listChiNhanh.add(n);
            }
            return listChiNhanh;
    }
    }
    
    public boolean addChiNhanh(String DiaChi) throws SQLException{
        
        try(Connection conn = JdbcUtils.getConn()){
            int dem = 1;
            Statement stm1 = conn.createStatement();
           
            ResultSet rs = stm1.executeQuery("SELECT * FROM tblchinhanh");
            while(rs.next()) dem++;
            String sql = "insert into tblchinhanh values(?,?)";
            PreparedStatement stm = conn.prepareCall(sql);
            int id = dem;
            stm.setInt(1,id);
            stm.setString(2,DiaChi);
            int r  = stm.executeUpdate();
            return r >0;           
        }
    }
}
