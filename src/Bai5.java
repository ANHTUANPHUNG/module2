import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        int choice = -1 ;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");

        choice = input.nextInt();
        switch (choice){
            case 0 :
                 choice = -1 ;

                System.out.println("Menu");
                System.out.println("1. Draw the triangle");
                System.out.println("2. Draw the square");
                System.out.println("3. Draw the rectangle");
                System.out.println("0. Exit");
                choice = input.nextInt();
                break;
            case 1 :
                Scanner sc = new Scanner(System.in);
                System.out.println("Draw the triangle");
                System.out.println("nhập chiều dài");
                float height = sc.nextFloat();
                System.out.println("nhập chiều rộng");
                float weight = sc.nextFloat();
                for (int i = 1; i <= weight ; i++){
                    for (int j= 1; j <= height ; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                choice = -1;
                Scanner sr = new Scanner(System.in);
                System.out.println("Draw the square");
                System.out.println("1.top-left");
                System.out.println("2.top-right");
                System.out.println("3.botton-left");
                System.out.println("4.botton-right");
                System.out.println("0.exit");
                choice = input.nextInt();
                switch (choice){
                    case 0 : choice = -1 ;

                        System.out.println("Menu");
                        System.out.println("1. Draw the triangle");
                        System.out.println("2. Draw the square");
                        System.out.println("3. Draw the rectangle");
                        System.out.println("0. Exit");

                        choice = input.nextInt();
                        break;
                    case 1:
                        System.out.println("top-left");
                        System.out.println("nhập cạnh ");
                        int canh1 = sr.nextInt();
                        for( int i = 0 ; i < canh1 ; i++ ){
                            for (int j = 0 ; j < canh1 -i ; j++){
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        break;
                    case 2 :
                        System.out.println("top-right");
                        System.out.println("nhập cạnh");
                        int canh2 = sr.nextInt();
                        for (int i = 0 ; i < canh2; i++){
                            for (int n = 0 ; n < i ; n++){
                                System.out.print(" ");
                            }
                            for (int j = 0 ; j < canh2 -i ; j++){
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        break;
                    case 3:
                        System.out.println("botton-left");
                        System.out.println("nhập cạnh");
                        int canh3 = sr.nextInt();
                        for(int i = 0; i <canh3;i++){
                            for (int j = 0 ; j <=i ; j ++){
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        break;
                    case 4:
                        System.out.println("botton-right");
                        System.out.println("nhập cạnh");
                        int canh4 = sr.nextInt();
                        for (int i =0 ; i <canh4;i++){
                            for (int j = 0 ; j <canh4 -i;j++){
                                System.out.print(" ");
                            }
                            for (int n = 0 ; n <= i ; n++){
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        break;
                }
            case 3:
                Scanner sd = new Scanner(System.in);
                System.out.println("Draw the rectangle");
                System.out.println("nhập cạnh");
                int canh1 = sd.nextInt();
                for (int i = 0 ; i < canh1; i++){
                    for (int n = 0 ; n < i ; n++){
                        System.out.print(" ");
                    }
                    for (int j = 0 ; j < canh1 -i ; j++){
                        System.out.print(" *");
                    }
                    System.out.println();
                }
                break;
        }
    }
}
