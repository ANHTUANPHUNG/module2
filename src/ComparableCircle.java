import Kethua.Circle;

import java.util.Arrays;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
    public static void main(String[] args) {
        ComparableCircle[] compa =new ComparableCircle[5];
        compa[0]= new ComparableCircle(5.6);
        compa[1]= new ComparableCircle(1.6);
        compa[2]= new ComparableCircle(3.6);
        compa[3]= new ComparableCircle(7.6);
        compa[4]= new ComparableCircle(9.6);
        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : compa) {
            System.out.println(circle);
        }

        Arrays.sort(compa);

        System.out.println("After-sorted:");
        for (ComparableCircle circle : compa) {
            System.out.println(circle);
        }
    }
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color) {
        super(radius, color);
    }
    @Override
    public int compareTo(ComparableCircle o){
        if( getRadius() == o.getRadius()){
            return 0;
        } else if ( getRadius() > o.getRadius()){
            return 1;
        }else return -1;
    }
}
