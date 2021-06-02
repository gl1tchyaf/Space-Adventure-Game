package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;


public class IntroCon {
    private Main main;
    @FXML
    private Button BACK;

    @FXML
    void backAction(ActionEvent event){
        try {
            main.showHomePage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    void setMain(Main main) {
        this.main = main;
    }


}
