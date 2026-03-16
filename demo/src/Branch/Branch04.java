import java.util.Scanner;
public class Branch04{
	public static void  main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符：");
		char a = sc.next().charAt(0);
	       	switch(a) {
			case 'a' :
				System.out.println("今天是星期一！");
				break;
			case 'b' :
				System.out.println("今天是星期二！");
				break;
			default :
				System.out.println("字符不匹配");
				break;
		}
        System.out.println("推出switch,程序继续执行！");
	}
}
