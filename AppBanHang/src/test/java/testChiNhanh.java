 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.company.conf.JdbcUtils;
import com.company.pojo.ChiNhanh;
import com.company.service.*;
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

import org.junit.jupiter.api.Test;
/**
 *
 * @author DELL
 */
public class testChiNhanh {
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
    public void testGetChiNhanh() throws SQLException{
        List<ChiNhanh> listchinhanh = new ArrayList<>();
         try ( Connection conn = JdbcUtils.getConn()) {           
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM tblchinhanh");
            while (rs.next()) {
                ChiNhanh c = new ChiNhanh(rs.getInt("id"), rs.getString("DiaChi"));
                listchinhanh.add(c);
            }
        }
         for(ChiNhanh i : listchinhanh){
             System.out.println(i.getId() + " "+ i.getDiaChi());
         }
    }
}
