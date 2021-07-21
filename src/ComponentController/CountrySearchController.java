package ComponentController;

import Controller.PlayersController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CountrySearchController {
    private PlayersController playersController;
    public void setPlayersController(PlayersController playersController){ this.playersController=playersController;}
    @FXML
    private TextField countryName;
    public void searchCountry(ActionEvent actionEvent) {
        playersController.searchCountry(countryName.getText());
    }
}
