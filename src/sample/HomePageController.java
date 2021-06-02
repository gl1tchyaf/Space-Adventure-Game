package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class HomePageController {
    private Main main;
    @FXML
    private Button ButtonNewGame;
    @FXML
    private Button ButtonHighestScore;
    @FXML
    private Button ButtonIntroduction;
    @FXML
    private Button ButtonDevelopers;
    @FXML
    private Button ButtonExit;

    @FXML
    void NewGameAction(ActionEvent event) {
        try{
            main.NewGame();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    void HighestScoreAction(ActionEvent event) {
        try{
            main.showHiScore();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    void IntroductionAction(ActionEvent event) {
        try{
            main.showIntroduction();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    void DevelopersAction(ActionEvent event) {
        try{
            main.showDevelopers();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    void ExitAction(ActionEvent event) {
        Stage stage = (Stage) ButtonExit.getScene().getWindow();
        stage.close();
    }
    void setMain(Main main) {
        this.main = main;
    }
}
