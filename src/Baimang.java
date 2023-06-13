import java.util.Arrays;
import java.util.Scanner;

public class Baimang {
    public static void main(String[] args) {
//        String[] arr = {"tuan","cuong","dat","tuananh","phuc","duy"};
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap 1 ten");
//        String arr1 = sc.nextLine();
//        for (String s : arr) {
//            if (arr1.equals(s)) {
//                System.out.println(arr1);
//            }
//        }
//        int[] arr = {5,7,768,68,64,53,35,32,34,54,75,8,76,34,23,900};
//        System.out.println(Arrays.toString(arr));
//        int max = arr[0];
//        int index = 0;
//        for (int j = 0 ;  j < arr.length ; j ++) {
//            if (max < arr[j]) {
//                max = arr[j];
//                index = j;
//            }
//        }
//        System.out.println(index);
//        System.out.println(max);
//        int temperature = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Fahrenheit to Celius");
        System.out.println("2.Celius to Fahernheit");
        System.out.println("0. Exit");
        System.out.println("Mời chọn");
        int temperature=sc.nextInt();
        switch (temperature){
            case 0 :
//                int temperature1 = -1;
                Scanner sa = new Scanner(System.in);
                System.out.println("Menu");
                System.out.println("1.Fahrenheit to Celius");
                System.out.println("2.Celius to Fahernheit");
                System.out.println("0. Exit");
                temperature=sa.nextInt();
            case 1 :
                Scanner sr = new Scanner(System.in);
                System.out.println("chuyen fahrenheit sang Celius");
                System.out.println("nhập Fahrenheit");
                double fahrenheit = sr.nextDouble();
                double celius = (5.0 / 9) * (fahrenheit - 32);
                System.out.println(celius);
                break;
            case 2 :
                Scanner sv = new Scanner(System.in);
                System.out.println("chuyen Celius sang Fahrenheit");
                System.out.println("nhap Celius");
                double celius1 = sv.nextDouble();
                double fahrenheit1 = celius1/(5.0/9) +32;
                System.out.println(fahrenheit1);
        }
    }
}
