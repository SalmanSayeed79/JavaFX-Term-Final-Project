package Game;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class PenaltyShootoutController implements Initializable {
    private int homeShots;
    private int homeScore;
    private int awayShots;
    private int awayScore;
    private boolean homeShotOngoing;
    private boolean shotTaken;

    @FXML
    private Label HomeScore;

    @FXML
    private StackPane ShootPane;

    @FXML
    private ImageView Keeper;

    @FXML
    private ImageView Ball;

    @FXML
    private Label AwayScore;
    @FXML
    private Label Title;
    @FXML
    private Label Subtitle;

    @FXML
    private Button leftButton;

    @FXML
    private Button straightButton;

    @FXML
    private Button rightButton;

    @FXML
    private Button ReadyButton;



    public void homeShotHandle(int ballDirection){
        if(homeShots<5){
            //Randomizing keeper dive
            Random rand=new Random();
            int max=3;
            int min=1;
            int keeperDive= rand.nextInt((max-min)+1)+min;
            switch (keeperDive){
                case 1:
                    leftKeeper();
                    break;
                case 2:
                    straightKeeper();
                    break;
                case 3:
                    rightKeeper();
                    break;
            }

            switch (ballDirection){
                case 1:
                    Image left=new Image(String.valueOf(getClass().getResource("/Images/Penalty/BallLeft.png")));
                    Ball.setImage(left);
                    break;
                case 2:
                    Image straight=new Image(String.valueOf(getClass().getResource("/Images/Penalty/BallStraight.png")));
                    Ball.setImage(straight);
                    break;
                case 3:
                    Image right=new Image(String.valueOf(getClass().getResource("/Images/Penalty/BallRight.png")));
                    Ball.setImage(right);
                    break;
            }

            if(keeperDive==ballDirection){
                this.homeShots++;
                HomeScore.setText(Integer.toString(homeScore)+"("+Integer.toString(homeShots)+")");
                shotTaken=true;
                homeShotOngoing=false;
                ReadyButton.setVisible(true);
                Title.setText("Shot saved");
                Subtitle.setVisible(false);
            }
            else{
                this.homeShots++;
                homeScore++;
                HomeScore.setText(Integer.toString(homeScore)+"("+Integer.toString(homeShots)+")");
                shotTaken=true;
                homeShotOngoing=false;
                ReadyButton.setVisible(true);
                Title.setText("Home scored");
                Subtitle.setVisible(false);
            }
        }

    }


    public void awayShotHandle(int keeperDive){
        if(awayShots<5){
            //Randomizing keeper dive
            Random rand=new Random();
            int max=3;
            int min=1;
            int ballDirection= rand.nextInt((max-min)+1)+min;
            switch (keeperDive){
                case 1:
                    leftKeeper();
                    break;
                case 2:
                    straightKeeper();
                    break;
                case 3:
                    rightKeeper();
                    break;
            }

            switch (ballDirection){
                case 1:
                    Image left=new Image(String.valueOf(getClass().getResource("/Images/Penalty/BallLeft.png")));
                    Ball.setImage(left);
                    break;
                case 2:
                    Image straight=new Image(String.valueOf(getClass().getResource("/Images/Penalty/BallStraight.png")));
                    Ball.setImage(straight);
                    break;
                case 3:
                    Image right=new Image(String.valueOf(getClass().getResource("/Images/Penalty/BallRight.png")));
                    Ball.setImage(right);
                    break;
            }

            if(keeperDive==ballDirection){
                this.awayShots++;
                AwayScore.setText(Integer.toString(awayScore)+"("+Integer.toString(awayShots)+")");
                shotTaken=true;
                homeShotOngoing=true;
                ReadyButton.setVisible(true);
                Title.setText("Shot saved");
                Subtitle.setVisible(false);
            }
            else{
                this.awayShots++;
                awayScore++;
                AwayScore.setText(Integer.toString(awayScore)+"("+Integer.toString(awayShots)+")");
                shotTaken=true;
                homeShotOngoing=true;
                ReadyButton.setVisible(true);
                Title.setText("Away scored");
                Subtitle.setVisible(false);
            }
        }

    }



    @FXML
    void leftHandle(ActionEvent event) {
        if(!shotTaken){
            if(homeShotOngoing){
                int ballDirection=1;
                homeShotHandle(ballDirection);
            }else{
                int keeperDive=1;
                awayShotHandle(keeperDive);
            }
        }

    }
    @FXML
    void straightHandle(ActionEvent event) {
        if(!shotTaken){
            if(homeShotOngoing){
                int ballDirection=2;
                homeShotHandle(ballDirection);
            }else{
                int keeperDive=2;
                awayShotHandle(keeperDive);
            }
        }


    }
    @FXML
    void rightHandle(ActionEvent event) {
        if(!shotTaken){
            if(homeShotOngoing){
                int ballDirection=3;
                homeShotHandle(ballDirection);
            }else{
                int keeperDive=3;
                awayShotHandle(keeperDive);
            }
        }

    }
    @FXML
    void straightKeeper() {
        Image straight=new Image(String.valueOf(getClass().getResource("/Images/Penalty/KeeperStraight.png")));
        Keeper.setImage(straight);
    }
    @FXML
    void leftKeeper() {
        Image left=new Image(String.valueOf(getClass().getResource("/Images/Penalty/KeeperLeft.png")));
        Keeper.setImage(left);
    }

    @FXML
    void rightKeeper() {
        Image right=new Image(String.valueOf(getClass().getResource("/Images/Penalty/KeeperRight.png")));
        Keeper.setImage(right);
    }
    @FXML
    public void reset() {
        if(homeShots<5 || awayShots<5){
            shotTaken=false;
            if(homeShotOngoing){
                Title.setText("Home Team Shot");
                Subtitle.setVisible(true);
                Subtitle.setText("Player takes the shot");
                ReadyButton.setVisible(false);
            }
            else {
                Title.setText("Away Team Shot");
                Subtitle.setVisible(true);
                Subtitle.setText("Player saves the shot");
                ReadyButton.setVisible(false);
            }
            Image straight=new Image(String.valueOf(getClass().getResource("/Images/Penalty/BallPrev.png")));
            Ball.setImage(straight);
            Image right=new Image(String.valueOf(getClass().getResource("/Images/Penalty/KeeperPrev.png")));
            Keeper.setImage(right);
        }

        else{
            if(homeScore>awayScore){
                homeWon();
            }
            else if(homeScore<awayScore){
                awayWon();
            }
            else{
                draw();
            }
        }

    }


    public void homeWon(){
        Title.setText("Home Team WON!!!!!!!");
        Subtitle.setVisible(false);
        ReadyButton.setVisible(false);

    }
    public void awayWon() {
        Title.setText("Away Team WON!!!!!!!");
        Subtitle.setVisible(false);
        ReadyButton.setVisible(false);

    }
    public void draw() {
        Title.setText("Match Drawn");
        Subtitle.setVisible(false);
        ReadyButton.setVisible(false);

    }

        @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        homeShotOngoing=true;
        shotTaken=false;
        homeShots=0;
        awayShots=0;
        ReadyButton.setVisible(false);
        Title.setText("Home Team Shot");
        Subtitle.setText("Player takes the shot");

    }
}
