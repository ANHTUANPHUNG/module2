import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
//        System.out.println("nhập tổng x và y");
//        float Total = new Scanner(System.in).nextFloat();
//        System.out.println("nhập hiệu x và y");
//        float Sub = new Scanner(System.in).nextFloat();
//        float x = (Total + Sub)/2f;
//        float y = (Total - x);
//        System.out.println("giá trị" + x + "\n" + "giá trị" + y);
//        System.out.println("nhập tháng");
//        int month = new Scanner(System.in).nextInt();
//        switch (month){
//            case 1,3,5,7,8,10,12:
//                System.out.println("tháng 31 ngày");
//                break;
//            case 4,6,9,11:
//                System.out.println("tháng 30 ngày");
//                break;
//            default:
//                System.out.println("tháng 28 ngày");
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập từ 1 đến 4 để lựa chọn");
        int sr = sc.nextInt();
        switch (sr){
            case 1:
                System.out.println("tìm theo tên");
                break;
            case 2:
                System.out.println("tìm theo tác giả");
                break;
            case 3:
                System.out.println("tìm theo xuất bản");
                break;
            case 4:
                System.out.println("tìm theo tiêu đề");
                break;
            default:
                System.out.println("nhập lại");
                break;
        }
    }
}
