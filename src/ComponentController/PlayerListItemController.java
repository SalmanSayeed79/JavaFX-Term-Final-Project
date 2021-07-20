package ComponentController;

import Main.Main;
import Model.Player;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class PlayerListItemController {
    private Player player;
    @FXML
    private ImageView playerImage;

    @FXML
    private Label playerNumber;

    @FXML
    private Label playerName;

    @FXML
    private Label playerPosition;

    @FXML
    private ImageView playerFlag;

    @FXML
    private ImageView playerClub;

    public void setPlayer(Player player){this.player=player;}

    public void setPlayerImage(String playerName){
        try{
            String url="/Images/Players/"+playerName+".png";
            //url="/Images/Players/Jordan Henderson.png";
            Image image = new Image(String.valueOf(getClass().getResource(url)));
            this.playerImage.setImage(image);
        }catch (Exception e){
            System.out.println("No image found");
        }


    }
    public void setPlayerName(String playerName) {
        this.playerName.setText(playerName);
    }
    public void setPlayerFlag(String country) {
        try{
            String url="/Images/Flags/"+country+".png";
            //url="/Images/Flags/Spain.png";
            System.out.println(url);
            Image image = new Image(String.valueOf(getClass().getResource(url)));
            this.playerFlag.setImage(image);
        }catch (Exception e){
            System.out.println("No image found");
        }

    }
    public void setPlayerClub(String club) {
        try{
            String url="/Images/"+club+".png";
            //url="/Images/Flags/Spain.png";
            System.out.println(url);
            Image image = new Image(String.valueOf(getClass().getResource(url)));
            this.playerClub.setImage(image);
        }catch (Exception e){
            System.out.println("No image found");
        }

    }

    public void setPlayerNumber(int playerNumber) {
        String number=Integer.toString(playerNumber);
        this.playerNumber.setText(number);
    }
    public void setPlayerPosition(String playerPosition) {
        this.playerPosition.setText(playerPosition);
    }


    public void handlePlayerClick() throws IOException {
        Main.showPlayerDetailScene(this.player);
    }

}
