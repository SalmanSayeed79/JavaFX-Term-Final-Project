package Main;

import ComponentController.PlayerDetailController;
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
import Model.Model;
import Model.Club;
import Model.Player;

import java.io.IOException;

public class Main extends Application {

    private Stage mainStage;
    private Stage loginStage;
    private static Stage clubDetail;
    private static Stage playerDetail;

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
        showLoginStage();
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();
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

    public void showPlayScene() {
    }

    public void showSettingsScene() {
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
        clubDetail.initStyle(StageStyle.UNDECORATED);
        clubDetail.setResizable(false);
        clubDetail.show();

    }
    public static void closeClubDetail(){
        clubDetail.close();
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
