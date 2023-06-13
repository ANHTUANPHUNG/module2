import java.util.Arrays;

public class Arr2chieu {
    public static void main(String[] args) {
        int [][] arrs = {
                {2,4,6,5},
                {3,4,6,9},
        };
        int [] max = {arrs[0][0],0,0};
        for ( int i =0 ; i < arrs.length; i++){
            for (int j = 0 ;  j< arrs[i].length; j++){
                if ( max[0] < arrs[i][j]){
                    max[0] = arrs[i][j];
                    max[1] = i ;
                    max[2] = j ;
                }
            }
        }
        System.out.println(Arrays.toString(max));
    }
}
