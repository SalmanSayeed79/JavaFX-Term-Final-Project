package Controller;

import javafx.event.ActionEvent;
import Main.Main;
import Main.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import ComponentController.PlayerCardController;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import Model.Model;
import Model.Player;

public class ClubDetailsController implements Initializable {
    private Main main;
    //private HBox card;
    @FXML
    private FlowPane playerCardContainer;


    public void setMain(Main main){
        this.main=main;
    }

    public void closeClubDetails(ActionEvent actionEvent) {
         main.closeClubDetail();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ArrayList<Player> playersShow=Model.players;
        for(int i=0;i<playersShow.size();i++){
            Player currentPlayer=playersShow.get(i);
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/Components/PlayerCard.fxml"));
            try {
                HBox card=fxmlLoader.load();
                PlayerCardController playerCardController = fxmlLoader.getController();
                playerCardController.setPlayerName(currentPlayer.getName());
                playerCardController.setPlayerAge(currentPlayer.getAge());
                playerCardController.setPlayerNumber(currentPlayer.getNumber());
                playerCardController.setPlayerPosition(currentPlayer.getPosition());
                playerCardController.setPlayerFlag(currentPlayer.getCountry());
                //System.out.println(currentPlayer.getName().replace(" ","%20"));
                playerCardController.setPlayerImage(currentPlayer.getName());
                playerCardController.setPlayerHeight(currentPlayer.getHeight());
                playerCardController.setPlayerSalary(currentPlayer.getSalary());
                playerCardContainer.getChildren().add(card);



            } catch (IOException e) {
                System.out.println("Pasa kala");
                e.printStackTrace();
            }

        }






    }
}
