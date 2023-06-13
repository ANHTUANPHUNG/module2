package Detele;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class value {
        static int inputIndex (){
            System.out.println("nhap vi tri muon them phan tu");
            int sr = new  Scanner(System.in).nextInt();
            return sr;
        }
        public static void main(String[] args) {
            int[] numbers = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
            int index = inputIndex();
            System.out.println("nhap so phan tu muon them");
            int sc = new Scanner(System.in).nextInt();
            for (int i = numbers.length -1 ; i >index; i--){
                numbers[i]= numbers[i-1];
            }
            numbers[index]= sc;
            System.out.println(Arrays.toString(numbers));

        }
        }

