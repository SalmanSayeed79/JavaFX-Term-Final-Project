package Game;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.image.WritableImage;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
class PlayerDisc{
    public Double x;
    public Double y;
    public int radius=50;
    public void draw(GraphicsContext context, MouseEvent event){
        this.x=event.getX()-25;
        this.y=event.getY()-25;
        context.fillOval(x,y,radius,radius);
    }
}
public class GamePlannerController implements Initializable {
    @FXML
    private Canvas DrawBoard;
    private GraphicsContext context;
    private int playerCount;
    private ArrayList<PlayerDisc> playerDiscs=new ArrayList<PlayerDisc>();
    private boolean eraserSelected;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.playerCount=0;
        eraserSelected=false;
        ArrayList<PlayerDisc> playerDiscs=new ArrayList<PlayerDisc>();
        context=DrawBoard.getGraphicsContext2D();

       drawFieldOverlay();

//        DrawBoard.setOnMouseDragged(new EventHandler<MouseEvent>(){
//            @Override
//            public void handle(MouseEvent mouseEvent) {
//                if(eraserSelected==true){
//                    context.setFill(Color.web("45930B"));
//                    context.fillOval(mouseEvent.getX()-25,mouseEvent.getY()-25,50,50);
//                }
//
//            }
//        });



    }

    public void drawFieldOverlay(){
        //Emptying playerCount
        this.playerCount=0;
        //Drawing the field
        context.setFill(Color.web("45930B"));
        context.fillRect(0,0,1920,980);
        context.setFill(Color.WHITE);
        context.fillRect(30,30,5,920);
        context.fillRect(30,30,1860,5);
        context.fillRect(1890,30,5,920);
        context.fillRect(30,950,1865,5);
        context.fillRect(958.5,30,5,920);
        context.fillRect(30,200,240,5);
        context.fillRect(30,980-200,240,5);
        context.fillRect(270,200,5,585);
        context.fillRect(1920-270,200,240,5);
        context.fillRect(1920-270,980-200,240,5);
        context.fillRect(1920-270,200,5,585);
        context.setStroke(Color.WHITE);
        context.setLineWidth(5);
        context.strokeOval(960-150,490-150,300,300);
    }

    @FXML
    void AddPlayer(MouseEvent event) {
        if(this.playerCount<11){
            PlayerDisc temp=new PlayerDisc();
            temp.draw(context,event);
            playerDiscs.add(temp);
            playerCount++;

        }
        else{
            Alert error=new Alert(Alert.AlertType.ERROR);
            error.setTitle("Player filled");
            error.setContentText("You have already added 11 players to the drawing board");
            error.showAndWait();
        }

    }

    @FXML
    void setAttacker(ActionEvent event) {
        eraserSelected=false;
        context.setFill(Color.web("F56802"));
    }

    @FXML
    void setDefender(ActionEvent event) {
        eraserSelected=false;
        context.setFill(Color.web("FF4848"));

    }

    @FXML
    void setKeeper(ActionEvent event) {
        eraserSelected=false;
        context.setFill(Color.web("FFF848"));
    }

    @FXML
    void setMidfielder(ActionEvent event) {
        eraserSelected=false;
        context.setFill(Color.web("459BFF"));
    }
    @FXML
    void eraserHover(ActionEvent event){
        eraserSelected=true;
        context.setFill(Color.web("45930B"));
    }


}
