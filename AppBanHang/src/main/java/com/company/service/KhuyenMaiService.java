/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.service;

import com.company.conf.JdbcUtils;
import com.company.pojo.KhuyenMai;
import com.company.pojo.NhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class KhuyenMaiService {
    public static KhuyenMai KhuyenMaiByID(String ID) throws SQLException{
        List<KhuyenMai> list = new ArrayList<>();
        try (Connection conn = JdbcUtils.getConn()) {
            String sql = "SELECT * FROM tblkhuyenmai";
            if (ID != null && !ID.isEmpty())
                sql += " WHERE id = ?";
            
            PreparedStatement stm = conn.prepareCall(sql);
            if (ID != null && !ID.isEmpty())
                stm.setString(1, ID);
            
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
               KhuyenMai n = new KhuyenMai(rs.getInt("id"),rs.getDate("NgayBatDau"),rs.getDate("NgayKetThuc"),rs.getInt("GiaTri"));
               list.add(n);
            }
            KhuyenMai a = list.get(0);
            return a;
    }
}
}
