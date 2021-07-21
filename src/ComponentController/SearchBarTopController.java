package ComponentController;

import Controller.LoginController;
import Controller.PlayersController;
import javafx.beans.property.BooleanProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.HBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SearchBarTopController implements Initializable {
    private PlayersController playersController;
    public void setPlayersController(PlayersController playersController){
        System.out.println("Players controller indcluded to Search bar!");
        System.out.println(playersController);
        this.playersController=playersController;}
    @FXML
    private HBox searchBarContainer;
    @FXML
    private HBox bottomBarContainer;
    @FXML
    private ToggleButton playerSearchButton;


    @FXML
    void searchNameSelected(ActionEvent event) {
        //removing previous elements
        bottomBarContainer.getChildren().clear();
        //Adding new elements
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/Components/PlayerSearch.fxml"));
            HBox bottomSearch = fxmlLoader.load();
            PlayerSearchController controller = fxmlLoader.getController();
            controller.setPlayersController(this.playersController);
            bottomBarContainer.getChildren().add(bottomSearch);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void searchPositionSelected(ActionEvent event) {
        //removing previous elements
        bottomBarContainer.getChildren().clear();
        //Adding new elements
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/Components/PositionSearch.fxml"));
            HBox bottomSearch = fxmlLoader.load();
            PositionSearchController controller = fxmlLoader.getController();
            controller.setPlayersController(this.playersController);
            bottomBarContainer.getChildren().add(bottomSearch);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    void searchClubSelected(ActionEvent event) {
        //removing previous elements
        bottomBarContainer.getChildren().clear();
        //Adding new elements
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/Components/ClubSearch.fxml"));
            HBox bottomSearch = fxmlLoader.load();
            ClubSearchController controller = fxmlLoader.getController();
            controller.setPlayersController(this.playersController);
            bottomBarContainer.getChildren().add(bottomSearch);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void searchCountrySelected(ActionEvent event) {
        //removing previous elements
        bottomBarContainer.getChildren().clear();
        //Adding new elements
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/Components/CountrySearch.fxml"));
            HBox bottomSearch = fxmlLoader.load();
            CountrySearchController controller = fxmlLoader.getController();
            controller.setPlayersController(this.playersController);
            bottomBarContainer.getChildren().add(bottomSearch);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @FXML
    void searchSalarySelected(ActionEvent event) {
        //removing previous elements
        bottomBarContainer.getChildren().clear();
        //Adding new elements
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/Components/SalarySearch.fxml"));
            HBox bottomSearch = fxmlLoader.load();
            SalarySearchController controller = fxmlLoader.getController();
            controller.setPlayersController(this.playersController);
            bottomBarContainer.getChildren().add(bottomSearch);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

//        try {
//            FXMLLoader fxmlLoader = new FXMLLoader();
//            fxmlLoader.setLocation(getClass().getResource("/Components/PlayerSearch.fxml"));
//            HBox bottomSearch = fxmlLoader.load();
//            PlayerSearchController controller = fxmlLoader.getController();
//            controller.setPlayersController(this.playersController);
//            bottomBarContainer.getChildren().add(bottomSearch);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //ClubController controller=loader.getController();



    }
}
