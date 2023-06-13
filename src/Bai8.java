import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap 1 so");
        int nums = sc.nextInt();
        int count = 0;
        int n =0;
        while (count < nums){
            boolean isprime = true;

            if( n <2 ){
                isprime = false;
            } else {
                for (int i = 2 ;  i < n ; i ++){
                    if(n %i == 0){
                        isprime = false;
                    }
                }
            }
            if (isprime == true){
                System.out.println(n);
                count++;

            }n++;

        }
    }
}
