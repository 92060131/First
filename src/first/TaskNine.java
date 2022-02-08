package first;

import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер 1 массива:");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.print("Введите значения переменных :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.print("Введите размер 2 массива:");
        int m = scan.nextInt();
        int[] brr = new int[m];
        System.out.print("Введите значения переменных :");
        for (int i = 0; i < brr.length; i++) {
            brr[i] = scan.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }
        System.out.println();
        System.out.print("Введите любое натуральное число:");
        int k = scan.nextInt();
        int p=0;
        int []result=new int[arr.length+brr.length];
        for(int i=0;i<k;i++) {
            result[p++]=arr[i];
        }
        for(int i=0;i<brr.length;i++) {
            result[p++]=brr[i];
        }
        for(int i=k;i<arr.length;i++) {
            result[p++]=arr[i];
        }
        for(int j=0;j<result.length;j++) {
            System.out.print(result[j]+" ");
        }
    }
}
