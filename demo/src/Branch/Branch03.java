import java.util.Scanner;
public class Branch03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩：");
        double score = sc.nextDouble();

        if (score > 8.0 ){
            System.out.println("请输入性别：");
            char gender =  sc.next().charAt(0);

            if (gender == '男'){
                System.out.println("你已进入男生组！");
            } else if (gender == '女'){
                System.out.println("你已进入女生组！");
            }else {
                System.out.println("输入有误，请重新输入：");
            }

        }else{
            System.out.println("你被淘汰了！");
        }
    }
}