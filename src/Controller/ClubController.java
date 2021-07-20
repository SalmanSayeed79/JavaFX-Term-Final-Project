package Controller;

import ComponentController.ClubCardController;
import Model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import Main.Main;

import Main.Main;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import Model.Club;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ClubController implements Initializable {
    private Main main;
    @FXML
    private FlowPane clubCardContainer;

    public void setMain(Main main){
        this.main=main;
    }


    public void sideBarButtonHover(MouseDragEvent mouseDragEvent) {
    }

    public void sideBarButtonHoverOut(MouseEvent mouseEvent) {
    }
    @FXML
    public void homeButtonClicked(ActionEvent actionEvent) throws IOException {
        main.showHomeScene();
    }
    @FXML
    public void clubButtonClicked(ActionEvent actionEvent) throws IOException {
        main.showClubScene();
    }
    @FXML
    public void playersButtonClicked(ActionEvent actionEvent) throws IOException {
        main.showPlayersScene();
    }
    @FXML
    public void transferButtonClicked(ActionEvent actionEvent) throws IOException {
        main.showTransferScene();
    }
    @FXML
    public void playButtonClicked(ActionEvent actionEvent) throws IOException {
        main.showPlayScene();
    }
    @FXML
    public void settingsButtonClicked(ActionEvent actionEvent) throws IOException {
        main.showSettingsScene();
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        ArrayList<Club> currentClubs=Model.clubs;
        for(int i=0;i<currentClubs.size();i++) {

            try {
                Club currentClub=currentClubs.get(i);
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/Components/ClubCard.fxml"));

                StackPane card=fxmlLoader.load();

                ClubCardController clubCardController=fxmlLoader.getController();
                clubCardController.setClub(currentClub);
                clubCardController.setClubName(currentClub.getName());
                clubCardController.setClubLogo(currentClub.getName());
                clubCardContainer.getChildren().add(card);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
