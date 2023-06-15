package Lopponit;

public class Main {
    public static void main(String[] args) {
        MoveablePoint point = new MoveablePoint(5,7);
        System.out.println(point.toString());
        MoveablePoint newPoint = point.move().move().move();
        System.out.println(newPoint.toString());
    }
}
