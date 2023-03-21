module com.mycompany.appbanhang {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.appbanhang to javafx.fxml;
    exports com.mycompany.appbanhang;
}
