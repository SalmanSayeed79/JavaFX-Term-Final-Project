package ComponentController;

import Controller.ClubDetailsController;
import Main.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class PlayerCardController {
    private Main main;
    @FXML
    private ImageView playerImage;

    @FXML
    private Label playerName;

    @FXML
    private Label playerPosition;

    @FXML
    private Label playerNumber;

    @FXML
    private ImageView playerFlag;

    @FXML
    private Label playerHeight;

    @FXML
    private Label playerAge;

    @FXML
    private Label playerSalary;
    public void setMain(Main main){
        this.main=main;
    }
    public void setPlayerImage(String playerName){
        playerImage.setImage(new Image("Images/Players/Allison.png") );
    }

    public void setPlayerAge(String playerAge) {
        this.playerAge.setText(playerAge);
    }
    public void setPlayerName(String playerName) {
        this.playerName.setText(playerName);
    }
}
