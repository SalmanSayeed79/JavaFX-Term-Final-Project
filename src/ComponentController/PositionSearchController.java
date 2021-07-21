package ComponentController;

import Controller.PlayersController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class PositionSearchController {
    private PlayersController playersController;
    public void setPlayersController(PlayersController playersController){ this.playersController=playersController;}
    @FXML
    private TextField positionName;

    public void searchPosition(ActionEvent actionEvent) {
        playersController.searchPosition(positionName.getText());
    }
}
