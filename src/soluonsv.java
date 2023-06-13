import java.util.Arrays;
import java.util.Scanner;

public class soluonsv {
    public static void main(String[] args) {
        int [] students = new int[4];
        for (int i = 0 ; i < students.length; i ++){
            System.out.printf("nhập điểm %d :" ,i +1);
            students[i]= new Scanner(System.in).nextInt();
        }
        System.out.println(Arrays.toString(students));
        int count = 0 ;
        for (int j =0 ; j < students.length; j++){
            if( students[j] >=5){
                System.out.println(students[j]);
                count++;
            }
        }
        System.out.println(count);
    }
}
