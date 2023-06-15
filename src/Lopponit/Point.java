package Lopponit;

public class Point {

    protected float x;
    protected float y;

    public Point() {
        this.x =0.0f;
        this.y =0.0f;
    }
    public Point(float x, float y){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY(){
        float [] result = new float[2];
        result[0]=x;
        result[1]=y;
        return result;
    }
    public void setXY(float X, float Y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "("+x+" "+y+" "+")";
    }


}
