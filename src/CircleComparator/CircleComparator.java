package CircleComparator;

import Kethua.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, "indigo" );

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }


    @Override
    public int compare(Circle o1, Circle o2) {
        if( o1.getRadius() == o2.getRadius()){
            return 0;
        } else if ( o1.getRadius() > o2.getRadius()){
            return 1;
        } else return -1;
    }
}
