 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.company.conf.JdbcUtils;
import java.sql.Connection;
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
public class testConnection {
    private static Connection cnn;
    
//    @BeforeAll
//    public static void beforeAll() {
//        try {
//            cnn = JdbcUtils.getConn();
//        } catch (SQLException ex) {
//            Logger.getLogger(testConnection.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(testConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        Statement stm = cnn.createStatement();
        ResultSet rs = stm.executeQuery("Select * from tblnhanvien");
        
        while(rs.next()){
            String name = rs.getString("TenNhanVien");
            System.out.println(name);
        }
          
    }
}
