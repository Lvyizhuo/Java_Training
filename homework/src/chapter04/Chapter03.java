import java.util.Scanner;
public	class Chapter03{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入月份：");
		int month = sc.nextInt();
		if (month > 0 && month < 13 ){
			//xxxx
			switch (month){
			case 3:
			case 4:
			case 5:
				System.out.println(month + "是春季");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println(month + "是夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(month + "是秋季");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println(month + "是春季");
				break;
			}
		}else {
			System.out.println("输入有误！");
		}
	}
}