public class Total {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3,4,7},
                {2,3,4,5,6},
                {4,5,6,7,8},
                {3,4,5,6,7},
                {5,6,7,8,9}
        };

        for ( int i = 0 ;  i < arr.length; i++){
            int total = 0 ;
            for ( int j = 0 ; j < arr[i].length; j ++){
                total += arr[i][j];

            }
            System.out.println(total);
        }

    }
}
