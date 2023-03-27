package com.mycompany.appbanhang;

import com.company.conf.JdbcUtils;
import com.company.pojo.ChiNhanh;
import com.company.pojo.Hang;
import com.company.pojo.KhachHang;
import com.company.pojo.NhanVien;
import com.company.pojo.UserSession;
import com.company.service.ChiNhanhService;
import com.company.service.NhanVienService;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;

import javafx.scene.control.DatePicker;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;

import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
;


public class IndexController implements Initializable{
         

    @FXML
    private TextField KhachHang;
   
    
    @FXML
    private TextField MaHoaDon;
         
         @FXML
    private TextField TenNV;
         
         @FXML
    private TextField ChiNhanh;

        @FXML
    private DatePicker NgayBan;
        
          @FXML
    private TextField GiamGia;
          
              @FXML
    private ComboBox<Hang> l;
          
    @FXML
    private void switchToChiNhanh() throws IOException, SQLException {
        App.setRoot("ChiNhanh");
    }

    @FXML
    private void switchToKhachHang() throws IOException, SQLException {
        App.setRoot("KhachHang");
    }

    @FXML
    private void switchToLoaiSanPham() throws IOException, SQLException {
        App.setRoot("LoaiSanPham");
    }

    @FXML
    private void switchToNhanVien() throws IOException, SQLException {
        App.setRoot("NhanVien");
    }

    @FXML
    private void switchToSanPham() throws IOException, SQLException {
        App.setRoot("SanPham");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Date date = new Date();
//        Format formatter = new SimpleDateFormat("yyyy-MM-dd");
//            String s = formatter.format(date);
//        this.NgayBan.setValue( LocalDate.parse(s));
        
        int maHoaDon =0 ;
        
        try(Connection conn = JdbcUtils.getConn()){
            
            Statement stm1 = conn.createStatement();
            
            ResultSet rs = stm1.executeQuery("SELECT * FROM tblhdban");
            while(rs.next()) maHoaDon = Integer.parseInt(rs.getString("MaHDBan")); 
            
            this.MaHoaDon.setText( Integer.toString(maHoaDon));
            
            NhanVien a = NhanVienService.GetNhanVienByID(UserSession.getUserID().toString()).get(0);
            this.TenNV.setText(a.getTenNV());
            ChiNhanh b = ChiNhanhService.GetChiNhanhByID(Integer.toString(a.getIDChiNhanh()));
            this.ChiNhanh.setText(b.getDiaChi());
            }catch (SQLException ex) {
                Logger.getLogger(PrimaryController.class.getName()).log(Level.SEVERE, null, ex);
            }
        

    }
    
    @FXML
    public void load(MouseEvent event) throws IOException {
        FXMLLoader fl = new FXMLLoader();
        fl.setLocation(getClass().getResource("KhachHang_1.fxml"));
        
        DialogPane KH = fl.load();
        KhachHangController c = fl.getController();
        Dialog<ButtonType> a = new Dialog<>();
        a.setDialogPane(KH);
        Optional<ButtonType> btn = a.showAndWait();
        if(btn.get() == ButtonType.APPLY){
            this.KhachHang.setText(c.getListKhachHang().getSelectionModel().getSelectedItem().getTenKhach());
        }
        
    }
    
   
}
