package com.company;
import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("정수를 입력하세요: ");
            int num=sc.nextInt();
            sum+=num;
            System.out.printf("지금까지 입력된 정수의 합은 %d 입니다.", sum);
        }
    }
}
