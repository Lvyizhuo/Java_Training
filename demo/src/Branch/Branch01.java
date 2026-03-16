import java.util.Scanner;
public class Branch01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if (age < 18) {
            System.out.println("You are too young");
        }else if (age >= 18) {
            System.out.println("you must 承担责任");

        }
    }
}