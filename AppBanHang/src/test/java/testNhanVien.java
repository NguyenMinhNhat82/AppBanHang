 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import com.company.conf.JdbcUtils;
import com.company.pojo.ChiNhanh;
import com.company.pojo.NhanVien;
import com.company.service.NhanVienService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
/**
 *
 * @author DELL
 */
public class testNhanVien {
    private static Connection cnn;
    
//    @BeforeAll
//    public static void beforeAll() {
//        try {
//            cnn = JdbcUtils.getConn();
//        } catch (SQLException ex) {
//            Logger.getLogger(testNhanVien.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    
    @AfterAll
    public static void AfterAll() throws SQLException{
        if(cnn!=null)
            cnn.close();
    }
    @Test
    public void testGetStaff() throws SQLException{
       List<NhanVien> listNhanVien = new ArrayList<>();
         try ( Connection conn = JdbcUtils.getConn()) {           
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM tblnhanvien");
            while (rs.next()) {
                NhanVien n = new NhanVien(rs.getString("MaNhanVien"), rs.getString("TenNhanVien"),rs.getString("GioiTinh"),rs.getString("DiaChi"),rs.getString("DienThoai"),rs.getDate("NgaySinh"),rs.getInt("idChiNhanh"),rs.getString("Password"));
                listNhanVien.add(n);
            }
        }
         for(NhanVien i : listNhanVien){
             System.out.println(i.getTenNV());
         }
          
    }
    
    

}
