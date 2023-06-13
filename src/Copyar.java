import java.util.Arrays;
import java.util.Scanner;

public class Copyar {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("nhập độ dài mảng 1");
        int size = sc.nextInt();
        int [] numbers1 = getNumbers(size);
        System.out.println("nhập độ dài mảng 2");
        int [] numbers2 = getNumbers(size);
        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.toString(numbers2));
        int [] numbers = new int[numbers1.length +numbers2.length];

        for ( int i = 0 ; i < numbers1.length; i++){
            numbers[i] = numbers1[i];

        }
        for (int i = 0; i <numbers2.length; i++){
            numbers[numbers1.length+i]= numbers2[i];
        }
        System.out.println(Arrays.toString(numbers));
    }
    static int[] getNumbers (int size){
        int[]numbers =new int[size];
        for ( int i = 0 ; i < size; i++){
            System.out.printf("nhập số thứ %d\n", i +1);
            numbers[i] = sc.nextInt();
        }
        return numbers;
    }

}
