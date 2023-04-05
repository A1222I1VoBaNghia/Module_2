package ss6_module2.bai_tap;

public class Point2D {
    private float x;
    private float y;

    public Point2D() {
        x = 0.0f;
        y = 0.0f;
    }

    public Point2D(float x, float y) {
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
        return "(" +
                x +
                ", " + y +
                ')';
    }
}
class Point3D extends Point2D{
    private float z;

    public Point3D() {
        z = 0.0f;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }


    public void setXYZ(float x, float y,float z) {
        super.setXY(x,y);
        this.z = z;
    }

    public float[] getXYX() {
        super.getX();
        super.getY();
        float[] arrXYX = {getX(),getY(),z};
        return arrXYX;
    }

    @Override
    public String toString() {
        return "{"+super.toString()+", "+
                + z +"}";
    }
}