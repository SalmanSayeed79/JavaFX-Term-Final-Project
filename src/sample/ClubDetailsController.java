package sample;

import javafx.event.ActionEvent;

public class ClubDetailsController {
    private Main main;

    public void setMain(Main main){
        this.main=main;
    }

    public void closeClubDetails(ActionEvent actionEvent) {
         main.closeClubDetail();
    }
}
