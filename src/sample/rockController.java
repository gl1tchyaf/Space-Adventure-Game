package sample;

import javafx.geometry.Bounds;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.awt.font.TextHitInfo;

public class rockController extends ImageView{
    private GameController ROCK;
    private ImageView rock;
    double x,y;
    double vx , vy;
    BulletImg blt;
    rockController(ImageView img, double x, double y , double V){
//        super(img);
        rock = img;
        rock.setX(x);
        rock.setY(y);
//        this.x = rock.getX();
//        this.y = rock.getY();
        double angle = 2 * Math.PI * Math.random();
        this.vx = Math.sin(angle) * V;
        this.vy = Math.cos(angle) * V;
    }

    void updatePosition(double elapsed) {
        this.rock.setX(this.rock.getX() + (vx * elapsed));
        this.rock.setY(this.rock.getY() + (vy * elapsed));
//        System.out.println(rock.getBoundsInParent());
    }

    void detectWallCollisions() {

        if (this.rock.getX() > 193 || this.rock.getX() < -165) vx = -vx;
        if (this.rock.getY() > 600 || this.rock.getY() < -41)  vy = -vy;

    //    System.out.println(rock.getX() + " " + rock.getY());
    }
    public Bounds getBound() {
        return rock.getBoundsInParent();
    }
    public void setY(int i) {
        rock.setX(i);
        rock.setY(-41);
    }


//    void  ditact (){
//        if (this.rock.getX() + 5 && this.rock.getX() - 5){
//
//        }
//    }
//    void print(){
//        System.out.println(rock.getX() + " " + rock.getY());
//    }
//    ImageView[] iv = new ImageView[10];
//        for(int i = 0;i<10 ;i++){
//        iv[i]= planeImageController.BigRock;
//        //double m = Math.random.nextInt(max - min + 1) + min
//        double m = ran.nextInt(200 - 100 + 1) + 100;
//        double n = ran.nextInt(300 - 150 + 1) + 150;
//        iv[i].setX(m);
//        iv[i].setY(n);
//        System.out.println(i + "no: x = "+ m +" y = "+n);
//
//    }
}