import java.util.Scanner;
public class Chapter01{
	public	static void main (String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个小学字符：");
		char small = sc.next().charAt(0);
		switch (small){
		case 'a':
			System.out.println("小写字母" + small + "被转化为" + (char)(small-32));
			break;
		case 'b':
			System.out.println("小写字母" + small + "被转化为" + (char)(small-32));
			break;
		case 'c':
			System.out.println("小写字母" + small + "被转化为" + (char)(small-32));
			break;
		case 'd':
			System.out.println("小写字母" + small + "被转化为" + (char)(small-32));
			break;
		case 'e':
			System.out.println("小写字母" + small + "被转化为" + (char)(small-32));
			break;
		default :
			System.out.println("other");
		}
	}
}