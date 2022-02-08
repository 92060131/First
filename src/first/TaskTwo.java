package first;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите значения переменных a,b,c :");
        double a=scan.nextDouble();
        double b=scan.nextDouble();
        double c=scan.nextDouble();
        double z=(b+Math.sqrt(b*b+4*a*c))/2*a-a*a*a*c+Math.pow(b,-2);
        System.out.println("Результат вычисления: "+ z);
    }
}
