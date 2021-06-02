package sample;

import javafx.event.ActionEvent;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;


public class GameController {
    private Main main;
//    private PlaneFinal PI;
    @FXML
    private Button BACK;
    @FXML
    public ImageView PlaneImg;
    @FXML
    public ImageView BigRock1;
    @FXML
    public ImageView BigRock2;
    @FXML
    public ImageView BigRock3;
    @FXML
    public ImageView BigRock4;
    @FXML
    public ImageView BigRock5;
    @FXML
    public ImageView BigRock6;
    @FXML
    public ImageView BigRock7;
    @FXML
    public ImageView Bullet;
    @FXML
    public Label ScoreLbl;

    public void ScoreLbl(int Score){
        ScoreLbl.setText(Score+"");
    }

    @FXML
    void backAction(ActionEvent event){
        try {
            main.showHomePage();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    // plane
    public void PlaneImgLoad() {
        Image img = new Image(Main.class.getResourceAsStream("spaceshipFinal.png"));
        PlaneImg.setImage(img);
    }

    // rock
    public void RockImgLoad1() {
        Image img = new Image(Main.class.getResourceAsStream("rockBig.png"));
        BigRock1.setImage(img);
    }
    public void RockImgLoad2() {
        Image img = new Image(Main.class.getResourceAsStream("rockBig.png"));
        BigRock2.setImage(img);
    }
    public void RockImgLoad3() {
        Image img = new Image(Main.class.getResourceAsStream("rockBig.png"));
        BigRock3.setImage(img);
    }
    public void RockImgLoad4() {
        Image img = new Image(Main.class.getResourceAsStream("rockMedium.png"));
        BigRock4.setImage(img);
    }
    public void RockImgLoad5() {
        Image img = new Image(Main.class.getResourceAsStream("rockMedium.png"));
        BigRock5.setImage(img);
    }
    public void RockImgLoad6() {
        Image img = new Image(Main.class.getResourceAsStream("rockSmall.png"));
        BigRock6.setImage(img);
    }
    public void RockImgLoad7() {
        Image img = new Image(Main.class.getResourceAsStream("rockSmall.png"));
        BigRock7.setImage(img);
    }

    // bullet
    public void BulletImgLoad() {
        Image img = new Image(Main.class.getResourceAsStream("fire_red.png"));
        Bullet.setImage(img);
    }

    void setMain(Main main) {
        this.main = main;
    }
}
