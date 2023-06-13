public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant(){
        double delta =(b*b) -(4*a*c);
        return delta;
    }
    public double getRoot1(){
        double delta = getDiscriminant();
        return (-b+Math.sqrt(delta))/(2*a);
    }
    public  double getRoot2(){
        double delta = getDiscriminant();
        return (-b-Math.sqrt(delta))/(2*a);
    }
    public double getRoot3(){
        double delta = getDiscriminant();
        return (-b/2*a);
    }
}
