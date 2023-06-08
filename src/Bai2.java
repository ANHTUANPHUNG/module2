import javax.swing.*;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
//        Scanner radius = new Scanner(System.in);
//        System.out.println("nhập vào bán kính");
//        double diameter = 2*radius.nextDouble();
////        System.out.println("đường kính là :" +diameter);
//        double perimeter = 2*Math.PI*diameter;
////        System.out.println("chu vi là :" +perimeter);
//        double acreage = Math.PI*Math.pow(diameter,2);
////        System.out.println("diện tích là :"+acreage);
//        System.out.println("đường kính là :" +diameter + "\n" + "chu vi là :" +perimeter + "\n" +"diện tích là :"+acreage);

//    Scanner sc = new Scanner(System.in);
//    System.out.println("nhập số cần kiểm tra");
//    int number = sc.nextInt();
//        boolean check= true;
//    if (number<2){
//        check = false;
//    }
//    for (int n= 2 ;n <= Math.sqrt(number); n ++){
//        if (number%n ==0 ){
//            check =false;
//            break;
//        }
//    }
//    if (check){
//        System.out.println("số nguyên tố");
//    } else {
//        System.out.println("ko phải");
//    }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhập vào số tiền gửi");
//        int commit = sc.nextInt();
//        System.out.println("tỉ lệ lãi suất");
//        float percents = sc.nextFloat();
//        System.out.println("số tháng gửi");
//        int month = sc.nextInt();
//        double total = 0;
//        for ( int i =0 ; i<= month ; i++){
//            total +=commit * (percents/100)/12 * month;
//        }System.out.println(total);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhập số a");
//        int a = sc.nextInt();
//        System.out.println("nhập số b");
//        int b = sc.nextInt();
//        int total = 1;
//        for (int i = 1; i <= a && i <= b; i++) {
//            if (a % i == 0 && b % i == 0) {
//                    total=i;
//                }
//        }
//        System.out.println(total);
//        for (int i =0 ; i <3; i++) {
//            for(int j=0; j<7;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <=5 ; i++){
//            for (int j = 1 ; j <= i ; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số lượng số ngto cần tìm");
        int numbers = sc.nextInt();
        int N= 2;
        int count = 0;
        for (count = 0; count < numbers; ){
            boolean isPrime = true;
            for (int i = 2 ; i< Math.sqrt(N); i++){
                if(N % i ==0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                count++;
                System.out.println(N);

            }
            N++;
        }

    }
}
