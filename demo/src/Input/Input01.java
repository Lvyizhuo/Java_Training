import java.util.Scanner;   //导入java.util下的Scanner包
public class Input01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个整数（回车确认）：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("你输入的三个整数分别是：");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}