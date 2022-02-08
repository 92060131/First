package first;
import java.util.Scanner;
public class TaskFive {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите значения переменных a,b,c :");
        int []arr=new int[3];
        for (int i=0;i< arr.length;i++){
            arr[i]=scan.nextInt();
        }
        for (int i=0;i< arr.length;i++){
            if(arr[i]>0){
                System.out.println(arr[i]*arr[i]);
            }
            else {
                System.out.println(arr[i]*arr[i]*arr[i]*arr[i]);
            }
        }
    }
}
