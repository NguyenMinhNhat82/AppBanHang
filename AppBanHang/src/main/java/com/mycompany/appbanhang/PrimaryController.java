package com.mycompany.appbanhang;

import com.company.service.NhanVienService;
import java.io.IOException;
import java.sql.SQLException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtA;
    @FXML private TextField txtB;
    @FXML private Label erro;
     
    @FXML
     private void switchToIndex() throws IOException, SQLException {
         String id = txtA.getText();
         String pw = txtB.getText();
         if(NhanVienService.Login(id, pw) == true){
             App.setRoot("index");
         }
         else
             erro.setText("Sai tên đăng nhập hoặc mật khẩu");
        
    }
}
