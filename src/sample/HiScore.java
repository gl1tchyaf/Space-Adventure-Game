package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;


public class HiScore {
    private Main main;
    @FXML
    private Label HiScore;
    @FXML
    private Label Score;
    @FXML
    private Button BACK;

    public void init(int HS){
        Score.setText(HS+" ");
    }
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
