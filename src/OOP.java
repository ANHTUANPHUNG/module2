import java.util.Scanner;

public class OOP {
    public static void main(String[] args) {
        QuadraticEquation nghiem = new QuadraticEquation(1,3,2);
        System.out.println(nghiem.getA());
        System.out.println(nghiem.getB());
        System.out.println(nghiem.getC());
        double delta = nghiem.getDiscriminant();
        if(delta <0){
            System.out.println("pt vô nghiệm");
        } else if (delta ==0 ){
            double r1 = nghiem.getRoot3();
            double r2 = nghiem.getRoot3();
            System.out.println("pt có nghiệm kép" + r1);
        } else {
            double r1 = nghiem.getRoot1();
            double r2 = nghiem.getRoot2();
            System.out.println(r1);
            System.out.println(r2);
        }
    }
}
