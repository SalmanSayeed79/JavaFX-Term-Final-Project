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
import java.util.ResourceBundle;
import ComponentController.PlayerCardController;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;

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
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/Components/PlayerCard.fxml"));

        try {
            HBox card=fxmlLoader.load();
            //PlayerCardController playerCardController = fxmlLoader.getController();
            ///playerCardController.setPlayerName("Hello");
            this.playerCardContainer.getChildren().add(card);

        } catch (IOException e) {
            e.printStackTrace();
        }finally{

        }





    }
}
