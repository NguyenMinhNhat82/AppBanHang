package com.mycompany.appbanhang;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToDangNhap() throws IOException {
        App.setRoot("DangNhap");
    }
    
    @FXML
     private void switchToQLNV() throws IOException {
        App.setRoot("NhanVien");
    }
}
