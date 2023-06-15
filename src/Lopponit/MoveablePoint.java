package Lopponit;

public class MoveablePoint extends Point{
    private float xSpeed;
    private float ySpeed;
    public MoveablePoint(float x, float y,float xSpeed,float ySpeed) {
        super(x, y);
        this.xSpeed =xSpeed;
        this.ySpeed =ySpeed;
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint() {
        this.xSpeed = 0.0f ;
        this.ySpeed = 0.0f ;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed =xSpeed;
        this.ySpeed =ySpeed;
    }
    public float[] getSpeed(){
        float[] result = new float[2];
        result[0] = xSpeed;
        result[1] = ySpeed;
        return result;
    }

    @Override
    public String toString() {
        return "(" +x +" " + y+"),speed=("+xSpeed+"s"+","+ySpeed+"s)";
    }
    public MoveablePoint move(){
        this.x+=xSpeed;
        this.y+=ySpeed;
        return this;
   }
}
