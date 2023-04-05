package ss6_module2.bai_tap;

public class
Point {
    private float x;
    private float y;

    public Point() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x =x;
        this.y =y;
    }
    public float[] getXY(){
        float[] arrXY = {x,y};
        return arrXY;
    }

    @Override
    public String toString() {
        return "(" + x +", "+ y + ')';
    }
}
class MovablePoint extends Point{
    private float xSpeed;
    private float ySpeed;

    public MovablePoint() {
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] arrSpeed = {xSpeed,ySpeed};
        return arrSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + "speed=" + ", ("+xSpeed +", "+ ySpeed +')';
    }
    public String move(float x, float y){
        x += xSpeed;
        y += ySpeed;
        return x +","+y;
    }
}
