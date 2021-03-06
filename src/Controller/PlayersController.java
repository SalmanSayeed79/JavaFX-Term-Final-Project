package Controller;

import ComponentController.PlayerListItemController;
import ComponentController.SearchBarTopController;
import Model.Model;
import Model.Player;
import Model.SearchManager;
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
import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class PlayersController implements Initializable {
    private Main main;

    @FXML
    private  VBox playerList;

    @FXML
    private VBox searchContainer;

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
    public void searchPlayers(String playerName){
        playerList.getChildren().clear();
        Player currentPlayer= SearchManager.searchName(Model.players,playerName);
        if(currentPlayer==null){
            System.out.println("no match");
        }
        else {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(PlayersController.class.getResource("/Components/PlayerListItem.fxml"));
                HBox listItem = fxmlLoader.load();
                PlayerListItemController playerListItemController = fxmlLoader.getController();
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

    public void searchPosition(String position){
        playerList.getChildren().clear();
        ArrayList<Player> currentPlayers= SearchManager.searchPosition(Model.players,position);
        if(currentPlayers.size()==0){
            System.out.println(position);
            System.out.println("no match");
        }
        else {
            for(int i=0;i<currentPlayers.size();i++) {
                Player currentPlayer=currentPlayers.get(i);
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(PlayersController.class.getResource("/Components/PlayerListItem.fxml"));
                    HBox listItem = fxmlLoader.load();
                    PlayerListItemController playerListItemController = fxmlLoader.getController();
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
    public void searchCountry(String country){
        playerList.getChildren().clear();
        ArrayList<Player> currentPlayers= SearchManager.searchCountry(Model.players,country);
        if(currentPlayers.size()==0){
            System.out.println("no match");
        }
        else {
            for(int i=0;i<currentPlayers.size();i++) {
                Player currentPlayer=currentPlayers.get(i);
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(PlayersController.class.getResource("/Components/PlayerListItem.fxml"));
                    HBox listItem = fxmlLoader.load();
                    PlayerListItemController playerListItemController = fxmlLoader.getController();
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
    public void searchClub(String club){
        playerList.getChildren().clear();
        ArrayList<Player> currentPlayers= SearchManager.searchClub(Model.players,club);
        if(currentPlayers.size()==0){
            System.out.println("no match");
        }
        else {
            for(int i=0;i<currentPlayers.size();i++) {
                Player currentPlayer=currentPlayers.get(i);
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(PlayersController.class.getResource("/Components/PlayerListItem.fxml"));
                    HBox listItem = fxmlLoader.load();
                    PlayerListItemController playerListItemController = fxmlLoader.getController();
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
    public void searchSalary(Double lower, Double upper){
        playerList.getChildren().clear();
        ArrayList<Player> currentPlayers= SearchManager.searchSalary(Model.players,lower,upper);
        if(currentPlayers.size()==0){
            System.out.println("no match");
        }
        else {
            for(int i=0;i<currentPlayers.size();i++) {
                Player currentPlayer=currentPlayers.get(i);
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(PlayersController.class.getResource("/Components/PlayerListItem.fxml"));
                    HBox listItem = fxmlLoader.load();
                    PlayerListItemController playerListItemController = fxmlLoader.getController();
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


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //Loading the searchBar
        try {
            FXMLLoader fxmlLoader=new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/Components/SearchBarTop.fxml"));
            VBox searchBar=fxmlLoader.load();
            SearchBarTopController controller=fxmlLoader.getController();
            controller.setPlayersController(this);
            searchContainer.getChildren().add(searchBar);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Loading the players panel
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
