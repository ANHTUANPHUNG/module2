public class char1 {
    public static void main(String[] args) {
        String str = "anh tuan dep trai";
        char c = 'a';
        int count =0;
        for( int i = 0; i < str.length(); i++){
            if (str.charAt(i) == c){
                count++;
            }
        }
        System.out.println(count);
    }
}
