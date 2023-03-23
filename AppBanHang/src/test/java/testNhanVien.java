 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.company.conf.JdbcUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
         try {
            cnn = JdbcUtils.getConn();
        } catch (SQLException ex) {
            Logger.getLogger(testNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        PreparedStatement stm = cnn.prepareCall("Select * from tblnhanvien where MaNhanVien = ? and Password = ?");            
            stm.setString(1, "NV1");
            stm.setString(2, "123");
            ResultSet rs = stm.executeQuery();
        
        Assertions.assertTrue(rs.next());
          
    }
}
