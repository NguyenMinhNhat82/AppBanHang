/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appbanhang;

import com.company.pojo.ChiNhanh;
import com.company.pojo.NhanVien;
import com.company.service.ChiNhanhService;
import com.company.service.NhanVienService;
import java.net.URL;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author DELL
 */
public class NhanVienController implements Initializable{
    
     @FXML
    private TableView<NhanVien> listNhanVien;
    
    
    @FXML
    private TableColumn<NhanVien, String> id;
    
    
    @FXML
    private TableColumn<NhanVien, String> TenNhanVien;
    
    @FXML
    private TableColumn<NhanVien, String> GioiTinh;
    
    @FXML
    private TableColumn<NhanVien, String> DiaChi;
    
    @FXML
    private TableColumn<NhanVien, String> DienThoai;
    
    @FXML
    private TableColumn<NhanVien, Date> NgaySinh;
    
    
    @FXML
    private TableColumn<NhanVien, Integer> IDChiNhanh;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         try {
            List<NhanVien> nhanvien = NhanVienService.GetNhanVien();
            this.id.setCellValueFactory(new PropertyValueFactory<NhanVien,String>("MaNV"));
            this.TenNhanVien.setCellValueFactory(new PropertyValueFactory<NhanVien,String>("TenNV"));
            this.GioiTinh.setCellValueFactory(new PropertyValueFactory<NhanVien,String>("GioiTinh"));
            this.DiaChi.setCellValueFactory(new PropertyValueFactory<NhanVien,String>("DiaChi"));
            this.DienThoai.setCellValueFactory(new PropertyValueFactory<NhanVien,String>("DienThoai"));
            this.NgaySinh.setCellValueFactory(new PropertyValueFactory<NhanVien,Date>("NgaySinh"));
            this.IDChiNhanh.setCellValueFactory(new PropertyValueFactory<NhanVien,Integer>("IDChiNhanh"));           
            this.listNhanVien.setItems(FXCollections.observableArrayList(nhanvien));           
        } catch (SQLException ex) {
            Logger.getLogger(PrimaryController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
