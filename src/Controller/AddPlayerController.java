package Controller;

import Main.Main;
import Model.Model;
import Model.Player;
import Model.FileManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AddPlayerController {
    private Main main;
    public void setMain(Main main){
        this.main=main;
    }


    @FXML
    private TextField playerName;

    @FXML
    private TextField playerAge;

    @FXML
    private TextField playerHeight;

    @FXML
    private TextField playerCountry;

    @FXML
    private TextField playerClub;

    @FXML
    private TextField playerNumber;

    @FXML
    private TextField playerPosition;

    @FXML
    private TextField playerSalary;

    @FXML
    private ImageView playerPreview;
    @FXML
    private ImageView clubPreview;
    @FXML
    private ImageView flagPreview;

    @FXML
    void sideBarButtonHover(MouseEvent event) {

    }

    @FXML
    void sideBarButtonHoverOut(MouseEvent event) {

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

    @FXML
    void addPlayer(ActionEvent event) {
        if((playerName.getText().isEmpty() || (playerClub.getText().isEmpty()) || (playerCountry.getText().isEmpty()) || (this.playerHeight.getText().isEmpty()) || (this.playerAge.getText().isEmpty()) || (this.playerPosition.getText().isEmpty()) || (this.playerNumber.getText().isEmpty()) || (playerSalary.getText().isEmpty()))){
            Alert successful=new Alert(Alert.AlertType.ERROR);
            successful.setContentText("Enter values properly");
            successful.showAndWait();
        }

        else{
            String name=this.playerName.getText();
            String country= this.playerCountry.getText();
            int age=Integer.parseInt(this.playerAge.getText());
            double height=Double.parseDouble(this.playerHeight.getText());
            String club=this.playerClub.getText();
            String pos=this.playerPosition.getText();
            int number=Integer.parseInt(this.playerNumber.getText());
            double salary=Double.parseDouble(this.playerSalary.getText());

            //String name, String country,int age ,double height, String club, String pos,int number , double salary
            Player newPlayer=new Player(name,country,age,height,club,pos,number,salary);
            Model.players.add(newPlayer);
            FileManager.writeFile(Model.players);
            FileManager.readFile(Model.players);
            Model.sortPlayersToClubs(Model.players);
            Alert successful=new Alert(Alert.AlertType.INFORMATION);
            successful.setContentText("Player Added Successfully");
            successful.showAndWait();
        }


    }

    @FXML
    void addPlayerImage(ActionEvent event) {
        String folderPath="src/Images/Players";
        String folderPath2="src/Images/Players/WithBg";
        FileChooser fileChooser=new FileChooser();
        fileChooser.setTitle("Choose Player Image");
        //Adding filter for png files only
        fileChooser.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("PNG", "*.png")
        );
        File source = fileChooser.showOpenDialog(main.fileChooserStage);
        System.out.println(source.getName());
        //Getting the absolute path
        Path imageFolderPath= Paths.get(folderPath);
        imageFolderPath=imageFolderPath.toAbsolutePath();

        Path imageFolderPath2= Paths.get(folderPath2);
        imageFolderPath2=imageFolderPath2.toAbsolutePath();

        //Finding destination file
        File destination=new File("tempNameWillGetRemoved");
        File destination2=new File("tempNameWillGetRemoved2");
        if(playerName.getText().isEmpty()){
            Alert successful=new Alert(Alert.AlertType.ERROR);
            successful.setContentText("Please enter the player name first");
            successful.showAndWait();

        }

        else{
            String clubName=playerName.getText();
            destination=new File(imageFolderPath+"/"+clubName+".png");
            destination2=new File(imageFolderPath2+"/"+clubName+".png");

        }


        try {
            if(destination.exists() || playerName.getText().isEmpty()){
                Alert successful=new Alert(Alert.AlertType.ERROR);
                successful.setContentText("Empty player name OR file Already exists!");
                successful.showAndWait();
            }
            else{
                Files.copy(source.toPath(),destination.toPath());
                Files.copy(source.toPath(),destination2.toPath());
                System.out.println("File copied");
                Alert successful=new Alert(Alert.AlertType.CONFIRMATION);
                successful.setContentText("Player Image Added!");
                successful.showAndWait();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @FXML
    void addClubImage(ActionEvent event) {
        String folderPath="src/Images";
        FileChooser fileChooser=new FileChooser();
        fileChooser.setTitle("Choose Club Image");
        //Adding filter for png files only
        fileChooser.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("PNG", "*.png")
        );
        File source = fileChooser.showOpenDialog(main.fileChooserStage);
        System.out.println(source.getName());
        //Getting the absolute path
        Path imageFolderPath= Paths.get(folderPath);
        imageFolderPath=imageFolderPath.toAbsolutePath();
        System.out.println(imageFolderPath.toAbsolutePath());

        //Finding destination file
        File destination=new File("tempNameWillGetRemoved");
        if(playerClub.getText().isEmpty()){
            Alert successful=new Alert(Alert.AlertType.ERROR);
            successful.setContentText("Please enter the club name first");
            successful.showAndWait();

        }

        else{
            String clubName=playerClub.getText();
            destination=new File(imageFolderPath+"/"+clubName+".png");

        }


        try {
            if(destination.exists() || playerClub.getText().isEmpty()){
                Alert successful=new Alert(Alert.AlertType.ERROR);
                successful.setContentText("Empty club name OR file Already exists!");
                successful.showAndWait();
            }
            else{
                Files.copy(source.toPath(),destination.toPath());
                System.out.println("File copied");
                Alert successful=new Alert(Alert.AlertType.CONFIRMATION);
                successful.setContentText("Club Image Added!");
                successful.showAndWait();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @FXML
    public void addFlagImage(ActionEvent actionEvent) {
        String folderPath="src/Images/Flags";
        FileChooser fileChooser=new FileChooser();
        fileChooser.setTitle("Choose Flag Image");
        //Adding filter for png files only
        fileChooser.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("PNG", "*.png")
        );
        File source = fileChooser.showOpenDialog(main.fileChooserStage);
        System.out.println(source.getName());
        //Getting the absolute path
        Path imageFolderPath= Paths.get(folderPath);
        imageFolderPath=imageFolderPath.toAbsolutePath();
        System.out.println(imageFolderPath.toAbsolutePath());

        //Finding destination file
        File destination=new File("tempNameWillGetRemoved");

        try {
            if(destination.exists() || playerCountry.getText().isEmpty()){
                Alert successful=new Alert(Alert.AlertType.ERROR);
                successful.setContentText("Empty country name OR file Already exists!");
                successful.showAndWait();
            }
            else{
                String clubName=playerCountry.getText();
                destination=new File(imageFolderPath+"/"+clubName+".png");
                Files.copy(source.toPath(),destination.toPath());
                System.out.println("File copied");
                Alert successful=new Alert(Alert.AlertType.CONFIRMATION);
                successful.setContentText("Flag Image Added!");
                successful.showAndWait();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
