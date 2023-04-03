package ss4_module2.bai_tap;

import java.util.Scanner;

public class Fan {
    public final int slow = 1;
    public final int medium = 2;
    public final int fast = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.speed = this.slow;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public int setSpeed(int speed) {
        return this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public double setRadius(double radius) {
       return this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public String setColor(String color) {
        return this.color = color;
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(3,true,10,"yellow");
        if(fan1.isOn()){
            if(fan1.setSpeed(3)==3){
                System.out.print("Fast ");
            }
            System.out.print(fan1.setRadius(10)+" "+fan1.setColor("yellow")+" fan is on");
        }
        System.out.println();
        Fan fan2 = new Fan(2,false,5,"blue");
        if (!fan2.isOn()){
            System.out.println(fan2.setRadius(5)+" "+fan2.setColor("blue")+" fan is off");

        }
    }
}
