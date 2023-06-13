import org.w3c.dom.ls.LSOutput;

public class Accessmodifier {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getArea());
        System.out.println(circle.getRadius());
        System.out.println(circle.getColor());
        Circle circle2 = new Circle();
        circle2.setRadius(2.6);
        circle2.setColor("green");
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Area: " + circle2.getArea());
        System.out.println(circle2.getColor());
    }
    }


