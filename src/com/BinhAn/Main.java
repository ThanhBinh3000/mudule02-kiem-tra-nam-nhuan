package com.BinhAn;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập năm cần kiểm tra: ");
       int number = sc.nextInt();
        if (number %100!=0&& number%4==0){
            System.out.println(number + "là năm nhuận");
        }else {
            System.out.println(number + "không là năm nhận ");
        }
    }
}
