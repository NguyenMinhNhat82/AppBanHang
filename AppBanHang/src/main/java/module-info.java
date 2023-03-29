module com.mycompany.appbanhang {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;
    opens com.mycompany to javafx.fxml;
    opens com.mycompany.appbanhang to javafx.fxml,javafx.base;
    opens com.company.pojo to javafx.base;
    exports com.mycompany.appbanhang;
}
