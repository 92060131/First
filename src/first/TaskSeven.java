package first;

import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите нижнюю границу:");
        double a=scanner.nextDouble();
        System.out.print("Введите верхнюю границу:");
        double b=scanner.nextDouble();
        System.out.print("Введите шаг:");
        double h=scanner.nextDouble();
        double y;
        System.out.printf("%10s ","Args:");
        System.out.printf("%15s","F(x):");
        System.out.println();
        for(double x=a;x<=b;x+=h){
            y=Math.pow(Math.sin(x),2)-Math.cos(2*x);
            System.out.printf("%10s   ",x);
            System.out.printf("%15s \n",y);
        }
    }
}
