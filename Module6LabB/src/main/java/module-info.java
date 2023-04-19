module com.mycompany.module6labb {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.module6labb to javafx.fxml;
    exports com.mycompany.module6labb;
}
