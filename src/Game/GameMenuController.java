package Game;

import Main.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class GameMenuController {
    private Main main;
    public void setMain(Main main){
        this.main=main;
    }

    @FXML
    void GamePlannerOpen(MouseEvent event) throws IOException{
            main.showPlannerScene();
    }

    @FXML
    void PenaltyShootoutOpen(MouseEvent event) throws IOException {
        main.showPenaltyScene();
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
}
