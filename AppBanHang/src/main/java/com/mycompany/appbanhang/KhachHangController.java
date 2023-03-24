/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appbanhang;

import com.company.pojo.KhachHang;
import com.company.service.KhachHangService;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author DELL
 */
public class KhachHangController implements Initializable {
    @FXML
    private TableView<KhachHang> listKhachHang;
    
    
    @FXML
    private TableColumn<KhachHang, String> MaKhach;
    
    @FXML
    private TableColumn<KhachHang, String> TenKhach;

    @FXML
    private TableColumn<KhachHang, String> DiaChi;
    
    @FXML
    private TableColumn<KhachHang, String> DienThoai;

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
        try {
            List<KhachHang> khachhang = KhachHangService.GetKhachHang();
            this.MaKhach.setCellValueFactory(new PropertyValueFactory<KhachHang,String>("MaKhach"));
            this.TenKhach.setCellValueFactory(new PropertyValueFactory<KhachHang,String>("TenKhach"));
            this.DiaChi.setCellValueFactory(new PropertyValueFactory<KhachHang,String>("DiaChi"));
            this.DienThoai.setCellValueFactory(new PropertyValueFactory<KhachHang,String>("DienThoai"));
            this.listKhachHang.setItems(FXCollections.observableArrayList(khachhang));           
        } catch (SQLException ex) {
            Logger.getLogger(PrimaryController.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }
}
