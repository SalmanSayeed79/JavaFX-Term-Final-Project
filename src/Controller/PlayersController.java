package Controller;

import ComponentController.PlayerListItemController;
import Model.Model;
import Model.Player;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import Main.Main;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class PlayersController implements Initializable {
    private Main main;
    @FXML
    private VBox playerList;

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

        ArrayList<Player> players=Model.players;
        for(int i=0;i<players.size();i++){
            Player currentPlayer=players.get(i);
            try {
                FXMLLoader fxmlLoader=new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/Components/PlayerListItem.fxml"));
                HBox listItem=fxmlLoader.load();


                PlayerListItemController playerListItemController=fxmlLoader.getController();
                playerListItemController.setPlayer(currentPlayer);
                playerListItemController.setPlayerName(currentPlayer.getName());
                playerListItemController.setPlayerImage(currentPlayer.getName());
                playerListItemController.setPlayerPosition(currentPlayer.getPosition());
                playerListItemController.setPlayerNumber(currentPlayer.getNumber());
                playerListItemController.setPlayerFlag(currentPlayer.getCountry());
                playerListItemController.setPlayerClub(currentPlayer.getClub());

                playerList.getChildren().add(listItem);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
