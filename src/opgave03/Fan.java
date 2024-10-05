package opgave03;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "Blue";

    Fan(){}

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    public boolean isOn() {
            return on;
    }
    public void setOn(boolean on){
        this.on=on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int newRadius) {
        this.radius = newRadius;
    }

    public String getColor (){
        return color;
    }

    public void setColor(String newcolor){
        this.color=newcolor;
    }


    public String toString() {
        if (isOn() == true) {
            return "The fan's speed is at: " + getSpeed() + ", the color is: " + getColor() + " and the radius is: " + getRadius();
        } else {
            return "The fan's color is: " + getColor() + " the radius is: " + getRadius() + " and the fan is off, at the moment.";
        }
    }
}
