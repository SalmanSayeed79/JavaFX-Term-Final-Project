package ComponentController;

import Controller.PlayersController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class SalarySearchController {
    private PlayersController playersController;
    public void setPlayersController(PlayersController playersController){ this.playersController=playersController;}
    @FXML
    private TextField lowerNumber;
    @FXML
    private TextField upperNumber;
    public void searchSalary(ActionEvent actionEvent) {
        Double lower= Double.parseDouble(lowerNumber.getText());
        Double upper= Double.parseDouble(upperNumber.getText());
        playersController.searchSalary(lower,upper);
    }
}
