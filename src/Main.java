import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your name: ");
//        String name = sc.nextLine();
//        System.out.println("Hello: " + name);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhập a");
//        float a = sc.nextFloat();
//        System.out.println("nhập b");
//        float b= sc.nextFloat();
//        if (a == 0 && b ==0){
//            System.out.println("pt vô số nghiệm");
//        } else if ( a== 0 && b !=0) {
//            System.out.println("pt vô nghiệm");
//        } else if (a !=0){
//            System.out.println("pt có nghiệm x ="+(-b/a));
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhập năm muốn xác định");
//        float year = sc.nextFloat();
//        if (year %4 ==0 && year %100 !=0){
//            System.out.println("năm nhuận");
//        } else if (year %100 ==0 && year %400 !=0) {
//            System.out.println("kp");
//        } else if ( year%100==0 && year %400 ==0) {
//            System.out.println("phải");
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập cân nặng");
        float weight = sc.nextFloat();
        System.out.println("nhập chiều cao");
        float height = sc.nextFloat();
        float bmi = weight/(height*height);
        if (bmi >= 30){
            System.out.println("obese");
        }else if (bmi >= 25){
            System.out.println("overweight");
        }else if (bmi >= 18.5){
            System.out.println("normal");
        }else if (bmi >= 0){
            System.out.println("underweight");
        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhập tiền việt");
//        float VND = (sc).nextFloat();
//        float USDS = VND/23000;
//        System.out.println("số tiền đô là :" +USDS);
//        System.out.println("nhập USB");
//        float USD = sc.nextFloat();
//        float VNDS = USD*23000;
//        System.out.println("số tiền việt là :" +VNDS);


    }
}