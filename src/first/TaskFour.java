package first;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите x: ");
        int x=scanner.nextInt();
        System.out.print("Введите y: ");
        int y=scanner.nextInt();
        if(x>=-2&&x<=2&&y>=0&&y<=4||x>=-4&&x<=4&&y<=0&&y>=-3){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
