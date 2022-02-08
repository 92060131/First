package first;

import java.util.Scanner;

public class TaskOne {
    public static void main(String []args){
    String a="Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр?";
    Scanner scan=new Scanner(System.in);
    System.out.println(a);
    System.out.println(" да/нет ?");
    String b=scan.next();
    boolean c=b.equals("да") ? true:false;
    System.out.println(c);
}
}
