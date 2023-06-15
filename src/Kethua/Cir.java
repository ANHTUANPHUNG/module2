package Kethua;

public class Cir {
    public static void main(String[] args) {
        Circle cir = new Circle(5,"green");

        double area = cir.circleArea(cir.getRadius());
        System.out.println(area);
        Cylinder cyl = new Cylinder(7, "red", 3);
        double thetich = cyl.CylinderArea(cyl.getRadius(), cyl.getHeight() );
        System.out.println(thetich);
    }
}
