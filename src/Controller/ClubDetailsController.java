package Controller;

import javafx.event.ActionEvent;
import Main.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import java.io.IOException;
import java.util.ArrayList;

import ComponentController.PlayerCardController;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import Model.Player;
import Model.Club;

public class ClubDetailsController{
//    private Main main;
    private Club club =new Club("Default");
    @FXML
    private ImageView clubIcon;
    @FXML
    private ImageView clubHome;
    @FXML
    private ImageView clubAway;
    @FXML
    private Label clubName;
    @FXML
    private Label clubTotalSalary;
    @FXML
    private Label clubGoalkeepers;
    @FXML
    private Label clubDefenders;
    @FXML
    private Label clubMidfielders;
    @FXML
    private Label clubAttackers;
    @FXML
    private FlowPane playerCardContainer;


//    public void setMain(Main main){
//        this.main=main;
//    }
    public void setClub(Club club){
        System.out.println("Data passed!");
        System.out.println(club);
        this.club=club;
        //System.out.println(this.club);

        //==================================================
        //Adding the Sidebar elements
        //==================================================
        setClubName(club.getName());
        setClubIcon(club.getName());
        setClubHome(club.getName());
        setClubAway(club.getName());
        setClubTotalSalary(club.getTotalSalary());
        setClubGoalkeepers(club.getGoalkeepers());
        setClubDefenders(club.getDefenders());
        setClubMidfielders(club.getMidfielders());
        setClubAttackers(club.getAttackers());



        //==================================================
        //Adding the players
        //==================================================
        ArrayList<Player> playersShow=this.club.getClubPlayers();
        for(int i=0;i<playersShow.size();i++){
            Player currentPlayer=playersShow.get(i);
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/Components/PlayerCard.fxml"));
            try {
                HBox card=fxmlLoader.load();
                PlayerCardController playerCardController = fxmlLoader.getController();
                playerCardController.setPlayerName(currentPlayer.getName());
                playerCardController.setPlayerAge(currentPlayer.getAge());
                playerCardController.setPlayerNumber(currentPlayer.getNumber());
                playerCardController.setPlayerPosition(currentPlayer.getPosition());
                playerCardController.setPlayerFlag(currentPlayer.getCountry());
                //System.out.println(currentPlayer.getName().replace(" ","%20"));
                playerCardController.setPlayerImage(currentPlayer.getName());
                playerCardController.setPlayerHeight(currentPlayer.getHeight());
                playerCardController.setPlayerSalary(currentPlayer.getSalary());
                playerCardContainer.getChildren().add(card);



            } catch (IOException e) {
                System.out.println("Pasa kala");
                e.printStackTrace();
            }

        }

    }
    public void setClubIcon(String clubName){
        try{
            String url="/Images/"+clubName+".png";
            //url="/Images/Players/Jordan Henderson.png";
            Image image = new Image(String.valueOf(getClass().getResource(url)));
            this.clubIcon.setImage(image);
        }catch (Exception e){
            System.out.println("Image error");
        }
    }
    public void setClubHome(String clubName){
        try{
            //System.out.println(clubName);
            clubName=clubName.replace(' ','_');
            String url="/Images/Jersey/"+clubName+".png";
            //String url= "/Images/Chelsea.png";
            //url="/Images/Players/Jordan Henderson.png";
            Image image = new Image(String.valueOf(getClass().getResource(url)));
            this.clubHome.setImage(image);
        }catch (Exception e){
            System.out.println("/Images/Jersey/"+clubName+".png");
            System.out.println("No home jersey found");
        }
    }
    public void setClubAway(String clubName){
        try{
            clubName=clubName.replace(' ','_');
            String url="/Images/Jersey/"+clubName+"_Away.png";
            //url="/Images/Players/Jordan Henderson.png";
            Image image = new Image(String.valueOf(getClass().getResource(url)));
            this.clubAway.setImage(image);
        }catch (Exception e){
            System.out.println("/Images/Jersey"+clubName+"_Away.png");
            System.out.println("No away jersey found");
        }
    }
    public void setClubName(String string){
        clubName.setText(string);
    }
    public void setClubDefenders(int number){
        String string=Integer.toString(number);
        clubDefenders.setText("Defenders    : "+string);
    }
    public void setClubGoalkeepers(int number){
        String string=Integer.toString(number);
        clubGoalkeepers.setText("Goalkeepers : "+string);
    }

    public void setClubMidfielders(int number){
        String string=Integer.toString(number);
        clubMidfielders.setText("Midfielders  : "+string);
    }

    public void setClubAttackers(int number){
        String string=Integer.toString(number);
        clubAttackers.setText("Attackers     : "+string);
    }
    public void setClubTotalSalary(Double number){
        String string=Double.toString(number);
        clubTotalSalary.setText("   TOTAL SALARY : $"+string);
    }






}
