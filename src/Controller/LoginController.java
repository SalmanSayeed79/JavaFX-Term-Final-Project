package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import Main.Main;
import javafx.scene.control.Button;

import java.io.IOException;

public class LoginController {
    private Main main;


    public void setMain(Main main){
        this.main=main;
    }
    //@FXML
    //private Button login_submit;

    @FXML
    public void loginSubmitAction(ActionEvent action) throws IOException {
            main.showHomeScene();
    }
}
