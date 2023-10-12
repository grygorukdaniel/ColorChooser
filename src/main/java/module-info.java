module dg.colorchooser {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens dg.colorchooser to javafx.fxml;
    exports dg.colorchooser;
}
