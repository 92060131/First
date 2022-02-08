package first;

import java.util.Scanner;

public class TaskEight { public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Введите размер массива:");
    int n = scan.nextInt();
    int[] arr = new int[n];
    System.out.print("Введите значения переменных :");
    for (int i = 0; i < arr.length; i++) {
        arr[i] = scan.nextInt();
    }
    System.out.println("Наш массив:");
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
    System.out.print("Введите любое натуральное число:");
    int k = scan.nextInt();
    System.out.println("Массив кратный "+k +" : ");
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]%k==0) {
            System.out.print(arr[i] + " ");
        }
    }
}
}
