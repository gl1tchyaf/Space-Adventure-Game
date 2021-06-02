package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;


public class GameOverController {
    private GameController SCORE;
    private Main main;
    @FXML
    private Label Scr;
    @FXML
    private Button BACK;

    public void ScrLbl(int Score){
        Scr.setText(Score+"");
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
