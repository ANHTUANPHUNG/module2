import static java.awt.Color.blue;

public class fan2 {
    static final int SLOW =1;
    static final int MEDIUM =2;
    static final int FAST =3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public fan2() {
        this.speed =SLOW;
        this.on = false;
        this.radius = 5 ;
        this.color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if(on){
            return speed + "  " + color + "  " +radius +  "  " + "fan is on";
        } else {
            return color + "  "  + radius + "  " + "fan is off";
        }
    }
}
