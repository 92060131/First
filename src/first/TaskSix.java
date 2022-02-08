package first;

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите значения  3 переменных :");
        int []arr=new int[3];
        for (int i=0;i< arr.length;i++){
            arr[i]=scan.nextInt();
        }
        int indexMax=0;
        int indexMin=0;
        for (int i=1;i< arr.length;i++){
            if(arr[i]>arr[i-1]){
                indexMax=i;
            }
            else indexMin=i;
        }
        System.out.println("Максимальное число="+arr[indexMax]+" Минимальное число="+arr[indexMin]);
    }
}
