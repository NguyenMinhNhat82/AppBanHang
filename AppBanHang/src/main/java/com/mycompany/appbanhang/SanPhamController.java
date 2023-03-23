/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appbanhang;

import com.company.pojo.Hang;
import com.company.service.SanPhamService;
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
public class SanPhamController implements Initializable{
    @FXML
    private TableView<Hang> listSanPham;
    
    
    @FXML
    private TableColumn<Hang, String> MaHang;
    
    @FXML
    private TableColumn<Hang, String> TenHang;

    @FXML
    private TableColumn<Hang, String> MaLoaiSanPham;
    
    @FXML
    private TableColumn<Hang, Double> SoLuong;
    
    @FXML
    private TableColumn<Hang, Double> DonGiaNhap;
    
    @FXML
    private TableColumn<Hang, Double> DonGiaBan;
    
    @FXML
    private TableColumn<Hang, String> Anh;

    @FXML
    private TableColumn<Hang, String> GhiChu;
    
    @FXML
    private TableColumn<Hang, Integer> IdKhuyenMai;

    @FXML
    private TableColumn<Hang, Integer> DonViTinh;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            List<Hang> hang = SanPhamService.GetSanPham();
            this.MaHang.setCellValueFactory(new PropertyValueFactory<Hang,String>("MaHang"));
            this.TenHang.setCellValueFactory(new PropertyValueFactory<Hang,String>("TenHang"));
            this.MaLoaiSanPham.setCellValueFactory(new PropertyValueFactory<Hang,String>("MaLoaiSanPham"));
            this.SoLuong.setCellValueFactory(new PropertyValueFactory<Hang,Double>("SoLuong"));
            this.DonGiaNhap.setCellValueFactory(new PropertyValueFactory<Hang,Double>("DonGiaNhap"));
            this.DonGiaBan.setCellValueFactory(new PropertyValueFactory<Hang,Double>("DonGiaBan"));
            this.Anh.setCellValueFactory(new PropertyValueFactory<Hang,String>("Anh"));
            this.GhiChu.setCellValueFactory(new PropertyValueFactory<Hang,String>("GhiChu"));
            this.IdKhuyenMai.setCellValueFactory(new PropertyValueFactory<Hang,Integer>("IdKhuyenMai"));
            this.DonViTinh.setCellValueFactory(new PropertyValueFactory<Hang,Integer>("DonViTinh"));
            this.listSanPham.setItems(FXCollections.observableArrayList(hang));
        } catch (SQLException ex) {
            Logger.getLogger(PrimaryController.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }
}
