module pl.marcinchwedczuk.template.gui {
    requires pl.marcinchwedczuk.template.domain;

    requires javafx.controls;
    requires javafx.fxml;

    exports pl.marcinchwedczuk.template.gui;
    exports pl.marcinchwedczuk.template.gui.mainwindow;

    // Allow @FXML injection to private fields.
    opens pl.marcinchwedczuk.template.gui.mainwindow;
}