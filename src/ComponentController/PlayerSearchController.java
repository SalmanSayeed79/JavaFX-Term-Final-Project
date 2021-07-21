package ComponentController;


import Controller.PlayersController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class PlayerSearchController {
    private PlayersController playersController;
    public void setPlayersController(PlayersController playersController){ this.playersController=playersController;}
    @FXML
    private HBox searchBarContainer;
    @FXML
    private TextField playerName;

    public void searchPlayer(ActionEvent actionEvent) {
        playersController.searchPlayers(playerName.getText());
    }
}
