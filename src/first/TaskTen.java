package first;

import java.util.Scanner;

public class TaskTen {public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Введите n: ");
    int n = scan.nextInt();
    int [][]arr=new int[n][n];
    int p=0;
    for (int i = 1; i<=n; i++) {
        for (int j = 0; j<n; j++)
            if((i%2)!=0){
                p++;
                arr[i-1][j]=p;
            }
            else if((i%2)==0) {
                arr[i-1][j]=p;
                p--;
            }
    }
    System.out.println("Вывод нашего массива: ");
    for (int[] x : arr) {
        for (int y : x) {System.out.print(y + " ");
        }
        System.out.println();
    }
}
}
