module PartTwo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens Main;
    opens Controller;
    opens ComponentController;
    opens Game;
}