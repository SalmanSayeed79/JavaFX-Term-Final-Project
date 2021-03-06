package Main;

import ComponentController.PlayerDetailController;
import Game.GameMenuController;
import Game.GamePlannerController;
import Game.PenaltyShootoutController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;
import javafx.stage.StageStyle;

//Importing controllers
import Controller.LoginController;
import Controller.PlayersController;
import Controller.HomeController;
import Controller.ClubDetailsController;
import Controller.ClubController;
import Controller.AddPlayerController;
import Model.Model;
import Model.Club;
import Model.Player;


import java.io.IOException;

public class Main extends Application {

    private Stage mainStage;
    private Stage loginStage;
    public Stage gameStage;
    public Stage penaltyStage;
    private static Stage clubDetail;
    private static Stage playerDetail;

    public Stage fileChooserStage;

    public Stage getStage() {
        return mainStage;
    }


    @Override
    public void start(Stage primaryStage) throws Exception{

        Model.main();
        loginStage=primaryStage;
        mainStage=new Stage();
        clubDetail=new Stage();
        playerDetail=new Stage();
        gameStage=new Stage();
        penaltyStage=new Stage();
        //showLoginStage();
        showHomeScene();
        //showSettingsScene();
        //showPenaltyScene();

    }



    public void showLoginStage() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/Scenes/Login.fxml"));
        Parent root = loader.load();
        //ClubController controller=loader.getController();
        LoginController controller = loader.getController();
        controller.setMain(this);

        loginStage.setTitle("Login window");
        loginStage.setScene(new Scene(root, 1280, 720));
        loginStage.show();
    }
    public void showHomeScene() throws IOException {
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("/Scenes/HomeNew.fxml"));
        Parent root = loader.load();

        //GamePlannerController controller=loader.getController();
        HomeController controller = loader.getController();
        controller.setMain(this);

        mainStage.setScene(new Scene(root,1920,1080));
        mainStage.setTitle("FUTBOL 2021");
        mainStage.show();
    }
    public void showClubScene() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/Scenes/Club.fxml"));
        Parent root = loader.load();

        ClubController controller = loader.getController();
        controller.setMain(this);

        mainStage.setScene(new Scene(root,1920,1080));
        mainStage.show();
    }
    public void showPlayersScene() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/Scenes/Players.fxml"));
        Parent root = loader.load();

        PlayersController controller = loader.getController();
        controller.setMain(this);

        mainStage.setScene(new Scene(root,1920,1080));
        mainStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    public void showTransferScene() {
    }

    public void showPlayScene() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/Game/GameMenu.fxml"));
        Parent root = loader.load();

       GameMenuController controller = loader.getController();
        controller.setMain(this);
        mainStage.setScene(new Scene(root,1920,1080));
        mainStage.setTitle("Game Planner");
        mainStage.show();

    }
    public void showPlannerScene() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/Game/GamePlanner.fxml"));
        Parent root = loader.load();

        GamePlannerController controller = loader.getController();

        gameStage.setScene(new Scene(root,1920,1080));
        gameStage.setTitle("Game Planner");
        gameStage.show();

    }
    public void showPenaltyScene() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/Game/PenaltyShootout.fxml"));
        Parent root = loader.load();

        PenaltyShootoutController controller = loader.getController();

        penaltyStage.setScene(new Scene(root,1920,1080));
        penaltyStage.setTitle("Penalty Shootout");
        penaltyStage.show();

    }

    public void showSettingsScene() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/Scenes/AddPlayer.fxml"));
        Parent root = loader.load();

        AddPlayerController controller = loader.getController();
        controller.setMain(this);

        mainStage.setScene(new Scene(root,1920,1080));
        mainStage.setTitle("FUTBOL 2021");
        mainStage.show();
    }
    public static void showClubDetailScene(Club club) throws IOException {
        Club temp=club;
        clubDetail=new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("/Scenes/ClubDetails.fxml"));
        Parent root = loader.load();

        ClubDetailsController controller = loader.getController();
        //controller.setMain(this);
        controller.setClub(temp);

        clubDetail.setScene(new Scene(root,1280,720));
        clubDetail.setTitle(club.getName());
        clubDetail.initStyle(StageStyle.DECORATED);
        clubDetail.setResizable(false);
        clubDetail.show();

    }

    public static void showPlayerDetailScene(Player player) throws IOException {
        playerDetail=new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("/Components/PlayerDetail.fxml"));
        Parent root = loader.load();

        PlayerDetailController controller = loader.getController();
        controller.setPlayerName(player.getName());
        controller.setPlayerAge(player.getAge());
        controller.setPlayerNumber(player.getNumber());
        controller.setPlayerPosition(player.getPosition());
        controller.setPlayerCountry(player.getCountry());
        controller.setPlayerHeight(player.getHeight());
        controller.setPlayerAge(player.getAge());
        controller.setPlayerSalary(player.getSalary());
        controller.setPlayerFlag(player.getCountry());
        controller.setPlayerClub(player.getClub());
        controller.setPlayerClubName(player.getClub());
        controller.setPlayerImage(player.getName());

        playerDetail.setScene(new Scene(root,1280,720));
        playerDetail.setTitle(player.getName());
        playerDetail.initStyle(StageStyle.DECORATED);
        playerDetail.setResizable(false);
        playerDetail.show();
    }
}
