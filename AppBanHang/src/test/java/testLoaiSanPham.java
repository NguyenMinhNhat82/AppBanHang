
import com.company.conf.JdbcUtils;
import com.company.pojo.LoaiSanPham;
import com.company.service.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class testLoaiSanPham {
    private static Connection cnn;
    @AfterAll
    public static void AfterAll() throws SQLException{
        if(cnn!=null)
            cnn.close();
    }
    
//    @Test
//    public void testGetLoaiSanPham() throws SQLException{
//        List<LoaiSanPham> listloaisanpham = new ArrayList<>();
//         try ( Connection conn = JdbcUtils.getConn()) {           
//            Statement stm = conn.createStatement();
//            ResultSet rs = stm.executeQuery("SELECT * FROM tblloaisanpham");
//            while (rs.next()) {
//                LoaiSanPham c = new LoaiSanPham(rs.getString("MaLoaiSanPham"), rs.getString("TenLoaiSanPham"));
//                listloaisanpham.add(c);
//            }
//        }
//         for(LoaiSanPham i : listloaisanpham){
//             System.out.println(i.getIDLoaiSP()+ " "+ i.getTenLoaiSP());
//         }
//    }
}