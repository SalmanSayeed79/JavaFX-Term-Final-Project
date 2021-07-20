package ComponentController;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import Model.Player;
public class PlayerDetailController {

    @FXML
    private ImageView playerImage;

    @FXML
    private Label playerNumber;

    @FXML
    private Label playerName;

    @FXML
    private Label playerPosition;

    @FXML
    private Label playerHeight;

    @FXML
    private Label playerAge;

    @FXML
    private Label playerSalary;

    @FXML
    private Label playerCountry;

    @FXML
    private ImageView playerFlag;

    @FXML
    private Label playerClubName;

    @FXML
    private ImageView playerClub;



    public void setPlayerImage(String playerName){
        try{
            String url="/Images/Players/WithBg/"+playerName+".png";
            //url="/Images/Players/Jordan Henderson.png";
            Image image = new Image(String.valueOf(getClass().getResource(url)));
            this.playerImage.setImage(image);
        }catch (Exception e){
            System.out.println("/Images/Players/"+playerName+".png");
            System.out.println("No image found");
        }


    }

    public void setPlayerAge(int playerAge) {
        String age=Integer.toString(playerAge);
        this.playerAge.setText("Age    : "+age+"yrs");
    }
    public void setPlayerName(String playerName) {
        this.playerName.setText(playerName);
    }
    public void setPlayerCountry(String country){
        this.playerCountry.setText(country);
    }

    public void setPlayerFlag(String country) {
        try{
            String url="/Images/Flags/"+country+".png";
            //url="/Images/Flags/Spain.png";

            Image image = new Image(String.valueOf(getClass().getResource(url)));
            this.playerFlag.setImage(image);
        }catch (Exception e){
            System.out.println("/Images/Flags/"+country+".png");
            System.out.println("No image found");
        }

    }
    public void setPlayerClub(String club) {
        try{
            String url="/Images/"+club+".png";
            Image image = new Image(String.valueOf(getClass().getResource(url)));
            this.playerClub.setImage(image);
        }catch (Exception e){
            System.out.println("/Images/"+club+".png");
            System.out.println("No image found");
        }

    }
    public void setPlayerClubName(String name){
        this.playerClubName.setText(name);
    }

    public void setPlayerHeight(Double playerHeight) {
        String height=Double.toString(playerHeight);
        this.playerHeight.setText("Height    : "+ height+"m");
    }

    public void setPlayerNumber(int playerNumber) {
        String number=Integer.toString(playerNumber);
        this.playerNumber.setText(number);
    }

    public void setPlayerPosition(String playerPosition) {
        this.playerPosition.setText(playerPosition);
    }

    public void setPlayerSalary(Double playerSalary) {
        String salary=Double.toString(playerSalary);
        this.playerSalary.setText("Salary    : "+"$ "+salary);
    }
}
