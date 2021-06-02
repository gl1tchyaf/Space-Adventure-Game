package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;


public class Dev {
    private Main main;
    @FXML
    private Label XD;
    @FXML
    private Label Hurr;
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