import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner event = new Scanner(System.in);
        System.out.println("nhập vào điểm trung bình");
        double menium_scores = event.nextDouble();
        if (menium_scores < 10 && menium_scores >=8){
            System.out.println("bạn giỏi");
        } else if (menium_scores >= 6.5) {
            System.out.println("bạn khá");
        } else if (menium_scores >=5) {
            System.out.println("bạn trung bình");
        } else if (menium_scores >= 3.5) {
            System.out.println("bạn yếu");
        } else {
            System.out.println("bạn kém");
        }
    }
}
