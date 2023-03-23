/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appbanhang;

import com.company.pojo.LoaiSanPham;
import com.company.service.LoaiSanPhamService;

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
public class LoaiSanPhamController implements Initializable{
    @FXML
    private TableView<LoaiSanPham> listLoaiSanPham;
    
    
    @FXML
    private TableColumn<LoaiSanPham, String> MaLoaiSanPham;

    @FXML
    private TableColumn<LoaiSanPham, String> TenLoaiSanPham;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            List<LoaiSanPham> loaisanpham = LoaiSanPhamService.GetLoaiSanPham();
            this.MaLoaiSanPham.setCellValueFactory(new PropertyValueFactory<LoaiSanPham,String>("MaLoaiSanPham"));
            this.TenLoaiSanPham.setCellValueFactory(new PropertyValueFactory<LoaiSanPham,String>("TenLoaiSanPham"));
            this.listLoaiSanPham.setItems(FXCollections.observableArrayList(loaisanpham));           
        } catch (SQLException ex) {
            Logger.getLogger(PrimaryController.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }
}
