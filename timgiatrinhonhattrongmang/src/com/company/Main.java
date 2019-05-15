package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner =new Scanner(System.in);
        do {
            System.out.println("Nhap size cho mang ");
            size=scanner.nextInt();
            if (size>10)
                System.out.println("size khong duoc vuot qua 10");
        } while (size>10);
        arr =new int[size];
        for (int i=0 ;i<arr.length;i++){
            System.out.println("nhap gia tri vao mang vi tri"+(i+1));
            arr[i]=scanner.nextInt();
        }
        for (int j=0 ;j<arr.length;j++){
            System.out.print(arr[j]+"\t");
        }
        int min=arr[0];
        for (int k=1;k<arr.length;k++){
            if (arr[k]<min){
                min=arr[k];
            }
        }
        System.out.println("Gia tri nho nhat trong mang"+min);
    }
}
