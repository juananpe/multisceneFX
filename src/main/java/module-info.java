module eus.ehu.multiscenefx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens eus.ehu.multiscenefx to javafx.fxml;
    exports eus.ehu.multiscenefx;
    exports eus.ehu.multiscenefx.controllers;
    opens eus.ehu.multiscenefx.controllers to javafx.fxml;
}
