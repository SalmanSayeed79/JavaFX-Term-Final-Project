package ComponentController;


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
        try{
            String url="/Images/Players/"+playerName+".png";
            //url="/Images/Players/Jordan Henderson.png";
            Image image = new Image(String.valueOf(getClass().getResource(url)));
            this.playerImage.setImage(image);
        }catch (Exception e){
            System.out.println("No image found");
        }


    }

    public void setPlayerAge(int playerAge) {
        String age=Integer.toString(playerAge);
        this.playerAge.setText(age+"yrs");
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

    public void setPlayerHeight(Double playerHeight) {
        String height=Double.toString(playerHeight);
        this.playerHeight.setText(height+"m");
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
        this.playerSalary.setText("$ "+salary);
    }


}
