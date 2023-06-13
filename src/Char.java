import java.util.Arrays;
import java.util.Scanner;

public class Char {
    public static void main(String[] args) {
        int[] sc = {3, 4, 9, 3, 6,0};
        int s = 2;
        int j = 8;
        for (int i = sc.length -1; i > s; i--){
            sc[i]= sc[i-1];
        }
        sc[s]= j;
        System.out.println(Arrays.toString(sc));
//        int[] s1 = new int[sc.length+1];
//        for (int i =0 ;i <s1.length;i++){
//            if (i <s){
//                s1[i]=sc[i];
//            } else if(i == s){
//                s1[i]=j;
//            } else {
//                s1[i]=sc[i-1];
//            }
//        }
//        System.out.println(Arrays.toString(s1));
//        for (int i=0 ; i < sc.length ; i++){
//            if( s == sc[i]){
//                sc[i] = sc[i+1];
//                for ( int j = 1 ; j < sc.length-1 ; j++){
//                    sc[j]= sc[j+1];
//
//                }
//                sc[sc.length-1]=0;
//            }
//        }
//        System.out.println(Arrays.toString(sc));
    }
}

