import java.util.Arrays;
import java.util.Scanner;

public class Deletevalue {
    public static void main(String[] args) {
        int[] numbers = {10,4,6,8,9,4,3,0,0,0};
        System.out.println("nhap vi tri muon xoa");

        int sr = new Scanner(System.in).nextInt();

        for ( int i = sr ; i <numbers.length-1; i++){
            numbers[i]= numbers[i+1];
        }
        System.out.println(Arrays.toString(numbers));
    }
}

