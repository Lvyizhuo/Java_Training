import java.util.Scanner;
public class Input02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your name(enter comfirm):");
        String name = sc.nextLine();
        System.out.println("Please input your age(enter comfirm):");
        int age = sc.nextInt();
        System.out.println("Please input your height(enter comfirm):");
        double height = sc.nextDouble();
        System.out.println("your name is " + name + ", your age is " + age + ", your height is " + height);

    }
}