import java.util.Arrays;
import java.util.Scanner;

public class minarr2chieu {

    static int [][] getArr(int size1, int size2){
        int [][]numbers = new int[size1][size2];
        for ( int i = 0 ; i < size1; i++){
            System.out.printf("hàng dọc %d\n", i +1);
            for (int j = 0 ; j < size2 ; j++){
                System.out.printf("nhập hàng ngang %d\n", j +1);
                numbers[i][j] = new Scanner(System.in).nextInt();
            }
        } return numbers;
    }
    public static void main(String[] args) {
        int [][] arr = getArr(2,2);
        System.out.println(Arrays.deepToString(arr));
        int [] min = {arr[0][0],0,0};
        for (int i =0; i< arr.length; i++){
            for (int j =0 ; j < arr[i].length; j++){
                if ( min[0] > arr[i][j]){
                    min[0]= arr[i][j];
                    min[1]= i;
                    min[2]=j;
                }
            }
        }
        System.out.println( Arrays.toString(min));
    };
}
