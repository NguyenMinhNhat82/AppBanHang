
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.service;

import com.company.conf.JdbcUtils;
import com.company.pojo.ChiNhanh;
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
    
}
