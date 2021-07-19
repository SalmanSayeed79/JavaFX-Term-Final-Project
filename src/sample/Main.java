package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Main extends Application {

    private Stage mainStage;
    private Stage loginStage;
    private Stage clubDetail;
    private Stage playerDetail;

    public Stage getStage() {
        return mainStage;
    }



    @Override
    public void start(Stage primaryStage) throws Exception{

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
        loader.setLocation(getClass().getResource("login.fxml"));
        Parent root = loader.load();

        LoginController controller = loader.getController();
        controller.setMain(this);

        loginStage.setTitle("Hello World");
        loginStage.setScene(new Scene(root, 1280, 720));
        loginStage.show();
    }
    public void showHomeScene() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("HomeNew.fxml"));
        Parent root = loader.load();

        HomeController controller = loader.getController();
        controller.setMain(this);

        mainStage.setScene(new Scene(root,1920,1080));
        mainStage.show();
    }
    public void showClubScene() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Club.fxml"));
        Parent root = loader.load();

        ClubController controller = loader.getController();
        controller.setMain(this);

        mainStage.setScene(new Scene(root,1920,1080));
        mainStage.show();
    }
    public void showPlayersScene() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Players.fxml"));
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
    public void showClubDetailScene() throws IOException {
        clubDetail=new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ClubDetails.fxml"));
        Parent root = loader.load();

        ClubDetailsController controller = loader.getController();
        controller.setMain(this);

        clubDetail.setScene(new Scene(root,1280,720));
        clubDetail.initStyle(StageStyle.UNDECORATED);
        clubDetail.show();

    }
    public void closeClubDetail(){
        clubDetail.close();
    }
    public void showPlayerDetailScene() throws IOException {
        playerDetail=new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("PlayerDetail.fxml"));
        Parent root = loader.load();

        PlayerDetailController controller = loader.getController();
        controller.setMain(this);

        playerDetail.setScene(new Scene(root,1280,720));
        playerDetail.initStyle(StageStyle.DECORATED);
        playerDetail.show();
    }
}
