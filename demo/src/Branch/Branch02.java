import java.util.Scanner;
public class Branch02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter score:");
        int n = sc.nextInt();
        if (n > 100){
            System.out.println("输入有误，请重新输入：");
        }else if (n >= 90 && n <= 100){
            System.out.println("信用极好");

        }else if (n >= 80 && n < 90){
            System.out.println("信用良好");
        }else if (n >= 70 && n < 80){
            System.out.println("信用一般");
        }else if (n >= 60 && n < 70){
            System.out.println("信用差");
        }else {
            System.out.println("不及格");
        }
    }
}
