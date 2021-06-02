package sample;

import javafx.geometry.Bounds;
import javafx.scene.image.ImageView;

public class BulletImg{
    private ImageView blt;
    double vy;
    static boolean b=false;
    static boolean c=false;
    BulletImg(ImageView img, double x, double y , double V){
        blt = img;
        blt.setX(x);
        blt.setY(y);
        this.vy =  -V;
    }
    void updatePosition(double elapsed) {
        this.blt.setY(this.blt.getY() + (vy * elapsed));
    }

    void detectWallCollisions2() {
        if ( this.blt.getY() < -600)
        b=true;

    }

    public Bounds getBoundsInParent() {
        return blt.getBoundsInParent();
    }

    public void setY(int i) {
        blt.setY(i);
    }
    public void setX(int i) {
        blt.setX(i);
    }
}