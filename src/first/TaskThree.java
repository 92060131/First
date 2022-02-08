package first;

import java.util.Scanner;
public class TaskThree {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Катет a :");
        double a=scan.nextDouble();
        System.out.print("Катет b :");
        double b=scan.nextDouble();
        double s=(a*b)/2;
        double p=a+b+Math.sqrt(a*a+b*b);
        System.out.println("Периметр="+p+" Площадь="+s);
    }
}
