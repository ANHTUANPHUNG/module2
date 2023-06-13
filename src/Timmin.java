import java.util.Scanner;

public class Timmin {

    public static void main(String[] args) {
        int [] numbers = {5,6,8,9,4,3,6,8,0,3,6,9,4,-34,-235};
        int min = numbers[0];
        int index=0;
        for (int i = 1; i < numbers.length ; i++){
            if (min > numbers[i]){
                min = numbers[i];
                index =i;
            }
        }
        System.out.println(min);
        System.out.println(index);
    }

}
