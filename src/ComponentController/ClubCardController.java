package ComponentController;

import Main.Main;
import Model.Club;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class ClubCardController {

//    private Main main;
    private Club club=new Club("aa");
//    public void setMain(Main main){this.main=main;}
    public void setClub(Club club){
        this.club=club;}
    @FXML
    private ImageView clubLogo;

    @FXML
    private Label clubName;

    @FXML
    void clubDetailsShow(MouseEvent event) throws IOException {
        Main.showClubDetailScene(this.club);
    }
    public void setClubLogo(String clubName){
        try{
            String url="/Images/"+clubName+".png";
            Image image = new Image(String.valueOf(getClass().getResource(url)));
            this.clubLogo.setImage(image);
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void setClubName(String clubName){
        this.clubName.setText(clubName);
    }
}
