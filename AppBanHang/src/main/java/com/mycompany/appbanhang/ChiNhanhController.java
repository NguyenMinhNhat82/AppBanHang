/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appbanhang;

import com.company.pojo.ChiNhanh;
import com.company.service.ChiNhanhService;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale.Category;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author DELL
 */
public class ChiNhanhController implements Initializable{
    @FXML
    private TableView<ChiNhanh> listChiNhanh;
    
    
    @FXML
    private TableColumn<ChiNhanh, Integer> id;

    @FXML
    private TableColumn<ChiNhanh, String> diachi;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            List<ChiNhanh> chinhanh = ChiNhanhService.GetChiNhanh();
            this.id.setCellValueFactory(new PropertyValueFactory<ChiNhanh,Integer>("id"));
            this.diachi.setCellValueFactory(new PropertyValueFactory<ChiNhanh,String>("DiaChi"));
            this.listChiNhanh.setItems(FXCollections.observableArrayList(chinhanh));           
        } catch (SQLException ex) {
            Logger.getLogger(PrimaryController.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }
}
