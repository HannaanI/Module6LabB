module com.mycompany.enhancedtipcalculatorapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.enhancedtipcalculatorapp to javafx.fxml;
    exports com.mycompany.enhancedtipcalculatorapp;
}
