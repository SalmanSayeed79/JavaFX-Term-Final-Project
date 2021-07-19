package Controller;

import javafx.event.ActionEvent;
import Main.Main;
import Main.Main;
public class ClubDetailsController {
    private Main main;

    public void setMain(Main main){
        this.main=main;
    }

    public void closeClubDetails(ActionEvent actionEvent) {
         main.closeClubDetail();
    }
}
