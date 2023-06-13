public class bai7 {
    public static void main(String[] args) {
        System.out.println(isPrime(6));
        int[] magic = {5,6,8,9,0,25,14,13,15,7};
        for (int j : magic) {
            if (isPrime(j)) {
                System.out.println(j);
            }
        }
    }
    public static boolean isPrime(int num){
        if (num <2){
            return false;
        }
        for ( int i = 2 ; i <num ; i++){
            if (num % i ==0){
                return false;
            }
        }return true;
    }
}
