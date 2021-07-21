package ComponentController;

import Controller.PlayersController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ClubSearchController {
    private PlayersController playersController;
    public void setPlayersController(PlayersController playersController){ this.playersController=playersController;}
    @FXML
    private TextField clubName;
    public void searchClub(ActionEvent actionEvent) {
        playersController.searchClub(clubName.getText());
    }
}
