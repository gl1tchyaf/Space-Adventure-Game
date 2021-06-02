package sample;

import javafx.animation.AnimationTimer;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.application.*;

import java.nio.channels.SocketChannel;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Bounds;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import java.io.*;
import java.lang.*;
import java.util.*;


public class Main extends Application {
    Stage stage;
    int SCORE = 0;
    static int highscore=0;
    static int som;

    long lastFrame = 0;
    long frameCount = 0;
    Random rand = new Random();
    static final int CNT = 10;

    static double y=670,x=200;
    static boolean c=true;
    static boolean ck=true;
    static double xAxis;

    rockController[] rock1 = new rockController[CNT];
    rockController[] rock2 = new rockController[CNT];
    rockController[] rock3 = new rockController[CNT];
    rockController[] rock4 = new rockController[CNT];
    rockController[] rock5 = new rockController[CNT];
    rockController[] rock6 = new rockController[CNT];
    rockController[] rock7 = new rockController[CNT];


    BulletImg[] bults = new BulletImg[CNT];



    private void updateGameState(long now) {
        double elapsedSec = (now - lastFrame) / 10000000000.0;
        lastFrame = now;
        if (frameCount > 0) {
            for (rockController r : rock1) {
                r.detectWallCollisions();
                r.updatePosition(elapsedSec);
            }
            for (rockController r : rock2) {
                r.detectWallCollisions();
                r.updatePosition(elapsedSec);
            }
            for (rockController r : rock3) {
                r.detectWallCollisions();
                r.updatePosition(elapsedSec);
            }
            for (rockController r : rock4) {
                r.detectWallCollisions();
                r.updatePosition(elapsedSec);
            }
            for (rockController r : rock5) {
                r.detectWallCollisions();
                r.updatePosition(elapsedSec);
            }
            for (rockController r : rock6) {
                r.detectWallCollisions();
                r.updatePosition(elapsedSec);
            }
            for (rockController r : rock7) {
                r.detectWallCollisions();
                r.updatePosition(elapsedSec);
            }

            for (BulletImg r : bults) {
                r.detectWallCollisions2();
                r.updatePosition(elapsedSec);
                //System.out.println("Bullet"+ r.getBoundsInParent());
            }
            for(BulletImg bl: bults){
                for(rockController rr: rock1)
                {
                    if(bl.getBoundsInParent().intersects(rr.getBound())){
                        SCORE++;
                            BulletImg.c=true;
                        if(BulletImg.c==true){
                            bl.setY(0);
                            bl.setX(-300);
                            rr.setY( rand.nextInt(100 + 100 + 1) - 100 );
                            BulletImg.c=false;
                        }
                    }
                    break;
                }
                break;
            }
            for(BulletImg bl: bults){
                for(rockController rr: rock2)
                {
                    if(bl.getBoundsInParent().intersects(rr.getBound())){
                        SCORE++;
                        BulletImg.c=true;
                        if(BulletImg.c==true){
                            bl.setY(0);
                            bl.setX(-300);
                            rr.setY( rand.nextInt(100 + 100 + 1) - 100 );
                            BulletImg.c=false;
                        }
                    }
                    break;
                }
                break;
            }

            for(BulletImg bl: bults){
                for(rockController rr: rock3)
                {
                    if(bl.getBoundsInParent().intersects(rr.getBound())){
                        SCORE++;
                        BulletImg.c=true;
                        if(BulletImg.c==true){
                            bl.setY(0);
                            bl.setX(-300);
                            rr.setY( rand.nextInt(100 + 100 + 1) - 100 );
                            BulletImg.c=false;
                        }
                    }
                    break;
                }
                break;
            }
            for(BulletImg bl: bults){
                for(rockController rr: rock4)
                {
                    if(bl.getBoundsInParent().intersects(rr.getBound())){
                        SCORE++;
                        BulletImg.c=true;
                        if(BulletImg.c==true){
                            bl.setY(0);
                            bl.setX(-300);
                            rr.setY( rand.nextInt(100 + 100 + 1) - 100 );
                            BulletImg.c=false;
                        }
                    }
                    break;
                }
                break;
            }
            for(BulletImg bl: bults){
                for(rockController rr: rock5)
                {
                    if(bl.getBoundsInParent().intersects(rr.getBound())){
                        SCORE++;
                        BulletImg.c=true;
                        if(BulletImg.c==true){
                            bl.setY(0);
                            bl.setX(-300);
                            rr.setY( rand.nextInt(100 + 100 + 1) - 100 );
                            BulletImg.c=false;
                        }
                    }
                    break;
                }
                break;
            }
            for(BulletImg bl: bults){
                for(rockController rr: rock6)
                {
                    if(bl.getBoundsInParent().intersects(rr.getBound())){
                        SCORE++;
                        BulletImg.c=true;
                        if(BulletImg.c==true){
                            bl.setY(0);
                            bl.setX(-300);
                            rr.setY( rand.nextInt(100 + 100 + 1) - 100 );
                            BulletImg.c=false;
                        }
                    }
                    break;
                }
                break;
            }

            for(BulletImg bl: bults){
                for(rockController rr: rock7)
                {
                    if(bl.getBoundsInParent().intersects(rr.getBound())){
                        SCORE++;
                        BulletImg.c=true;
                        if(BulletImg.c==true){
                            bl.setY(0);
                            bl.setX(-300);
                            rr.setY( rand.nextInt(100 + 100 + 1) - 100 );
                            BulletImg.c=false;
                        }
                    }
                    break;
                }
                break;
            }

        }


        frameCount++;

    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        stage = primaryStage;
        showHomePage();
    }
    public void showHomePage() throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("HomePage.fxml"));
        Parent root = loader.load();

        // Loading the controller
        HomePageController controller = loader.getController();
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Space Adventure");
        stage.setScene(new Scene(root, 400, 600));
        stage.show();
        stage.resizableProperty().setValue(false);
    }

    public void NewGame()  throws IOException {
        FXMLLoader ldr = new FXMLLoader();
        ldr.setLocation(getClass().getResource("GamePlace.fxml"));
        Parent root = ldr.load();

        GameController gameController = ldr.getController();
        gameController.PlaneImgLoad();

        gameController.RockImgLoad1();
        gameController.RockImgLoad2();
        gameController.RockImgLoad3();
        gameController.RockImgLoad4();
        gameController.RockImgLoad5();
        gameController.RockImgLoad6();
        gameController.RockImgLoad7();

        gameController.BulletImgLoad();
        gameController.setMain(this);

        stage.setTitle("Space Adventure");
        stage.setScene(new Scene(root, 470, 600));

        new AnimationTimer() {
            @Override
            public void handle(long now) {
                for(rockController rr: rock1) {
                    if(gameController.PlaneImg.getBoundsInParent().intersects(rr.getBound())){
                        try {
                            showGameOver();
                        } catch (IOException e) {}
                    }
                }
                for(rockController rr: rock2) {
                    if(gameController.PlaneImg.getBoundsInParent().intersects(rr.getBound())){
                        try {
                            showGameOver();
                        } catch (IOException e) {}
                    }
                }
                for(rockController rr: rock3) {
                    if(gameController.PlaneImg.getBoundsInParent().intersects(rr.getBound())){
                        try {
                            showGameOver();
                        } catch (IOException e) {}
                    }
                }
                for(rockController rr: rock4) {
                    if(gameController.PlaneImg.getBoundsInParent().intersects(rr.getBound())){
                        try {
                            showGameOver();
                        } catch (IOException e) {}
                    }
                }
                for(rockController rr: rock5) {
                    if(gameController.PlaneImg.getBoundsInParent().intersects(rr.getBound())){
                        try {
                            showGameOver();
                        } catch (IOException e) {}
                    }
                }
                for(rockController rr: rock6) {
                    if(gameController.PlaneImg.getBoundsInParent().intersects(rr.getBound())){
                        try {
                            showGameOver();
                        } catch (IOException e) {}
                    }
                }
                for(rockController rr: rock7) {
                    if(gameController.PlaneImg.getBoundsInParent().intersects(rr.getBound())){
                        try {
                            showGameOver();
                        } catch (IOException e) {}
                    }
                }
                try{
                    updateGameState(now);
                }
                catch(Exception e){ }
            }

        }.start();
        if(highscore<SCORE){
            highscore = SCORE;
        }
        System.out.println(highscore);
        SCORE=0;

        // controller
        stage.getScene().setOnKeyTyped(event -> {
             if (event.getCharacter().equals("a") || event.getCharacter().equals("A")) {
                if(gameController.PlaneImg.getX() < -175){
                    xAxis=-176;
                    gameController.PlaneImg.setX(xAxis);
                    gameController.Bullet.setX(xAxis);
                }
                else{
                    xAxis=gameController.PlaneImg.getX() - 8;
                    gameController.PlaneImg.setX(xAxis);
                    gameController.Bullet.setX(xAxis);
                }
            } else if (event.getCharacter().equals("d") || event.getCharacter().equals("D")) {

                if(gameController.PlaneImg.getX() > 175){
                    xAxis=176;
                    gameController.PlaneImg.setX(xAxis);
                    gameController.Bullet.setX(xAxis);
                }
                else{
                    xAxis=gameController.PlaneImg.getX() + 8;
                    gameController.PlaneImg.setX(xAxis);
                    gameController.Bullet.setX(xAxis);
                }
            } else{}
             if (event.getCharacter().equals("p") || event.getCharacter().equals("P")) {
                if (BulletImg.b == true) {
                    gameController.Bullet.setY(0);
                    gameController.Bullet.setX(xAxis);
                    gameController.ScoreLbl(SCORE);
                }
                BulletImg.b = false;
            }
             else{}
        });

        // rocks

        for (int i = 0 ; i < CNT ; i++){
            rock1[i] = new rockController(  gameController.BigRock1,rand.nextInt(100 + 100 + 1) - 100, 0, 250);
        }
        for (int i = 0 ; i < CNT ; i++){
            rock2[i] = new rockController(  gameController.BigRock2,rand.nextInt(100 + 100 + 1) - 100, 0, 250);
        }
        for (int i = 0 ; i < CNT ; i++){
            rock3[i] = new rockController(  gameController.BigRock3,rand.nextInt(100 + 100 + 1) - 100, 0, 250);
        }
        for (int i = 0 ; i < CNT ; i++){
            rock4[i] = new rockController(  gameController.BigRock4,rand.nextInt(100 + 100 + 1) - 100, 0, 250);
        }
        for (int i = 0 ; i < CNT ; i++){
            rock5[i] = new rockController(  gameController.BigRock5,rand.nextInt(100 + 100 + 1) - 100, 0, 250);
        }
        for (int i = 0 ; i < CNT ; i++){
            rock6[i] = new rockController(  gameController.BigRock6,rand.nextInt(100 + 100 + 1) - 100, 0, 250);
        }
        for (int i = 0 ; i < CNT ; i++){
            rock7[i] = new rockController(  gameController.BigRock7,rand.nextInt(100 + 100 + 1) - 100, 0, 250);
        }



        // bullet
        for (int i = 0 ; i < CNT ; i++){
            bults[i] = new BulletImg(  gameController.Bullet,-300, 600, 1500);
        }

        // collision
        for (int i = 0 ; i < CNT ; i++){
            if( bults[i].equals(rock1[i]) || bults[i].equals(rock2[i]) || bults[i].equals(rock3[i]) ||
                    bults[i].equals(rock4[i]) || bults[i].equals(rock5[i]) || bults[i].equals(rock6[i]) ||
                    bults[i].equals(rock7[i]) ){
                System.out.println("YES");
//                try {
//
//                }catch (Exception e){}
            }
        }

        stage.show();
        stage.resizableProperty().setValue(false);



    }


    public void showIntroduction() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Intro.fxml"));
        Parent root = loader.load();

        // Loading the controller
        IntroCon controller = loader.getController();
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Space Adventure");
        stage.setScene(new Scene(root, 400, 600));
        stage.show();
        stage.resizableProperty().setValue(false);
    }
    public void showDevelopers() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Dev.fxml"));
        Parent root = loader.load();

        // Loading the controller
        Dev controller = loader.getController();
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Space Adventure");
        stage.setScene(new Scene(root, 400, 600));
        stage.show();
        stage.resizableProperty().setValue(false);
    }
    public void showGameOver() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("GameOver.fxml"));
        Parent root = loader.load();

        // Loading the controller
        GameOverController controller = loader.getController();
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Space Adventure");
        stage.setScene(new Scene(root, 400, 600));
        stage.show();
        stage.resizableProperty().setValue(false);
        controller.ScrLbl(SCORE);
    }

    public static void main(String[] args) {
        launch(args);
        int z;
        readfile e = new readfile();
        e.openFile();
        e.readFile();
        e.closeFile();
        //z= readfile.a;

         som=readfile.a;
        //System.out.println("a "+ som);
        if(readfile.a<highscore) {
            CreateFile c = new CreateFile();
            c.openFile();
            c.addRecords();
            c.closeFile();
        }

    }
    public void showHiScore() throws IOException {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("HiScore.fxml"));
        Parent root = loader.load();

        // Loading the controller
        HiScore controller = loader.getController();
        controller.setMain(this);

        // Set the primary stage
        stage.setTitle("Space Adventure");
        stage.setScene(new Scene(root, 400, 600));
        stage.show();
        stage.resizableProperty().setValue(false);
        controller.init(highscore);
        //System.out.println("xd " +som);
    }
}
class CreateFile{
    private Formatter x;
    public void openFile(){
        try{
            x= new Formatter("HighScore.txt");
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
    public void addRecords() {
            x.format("%d", Main.highscore);

    }

    public void closeFile(){
        x.close();
    }
}
class readfile{
    static int a;
    public static int z;
    //int z;
    private Scanner x;

    public void openFile(){
        try{
            x=new Scanner(new File("HighScore.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }
    }
    public void readFile(){
        a= x.nextInt();
        z=a;

    }
    public void closeFile(){
        x.close();

    }
}
