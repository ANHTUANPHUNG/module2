package Point;


public class Point3D extends Point2D{
    public static void main(String[]args){
        Point3D point = new Point3D(5,8,34);
        System.out.println(point);
    }
    private float z;
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z =z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public float[] geXYZ()
    {
        float[] result = new float[3];
        result[0]=x;
        result[1]=y;
        result[2]=z;
        return result;
    }

    @Override
    public String toString() {
        return "("+x +" "+y + "  " +z+")";
    }
}
