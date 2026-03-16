import java.util.Scanner;
public class Chapter02{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入成绩：");
		double score = sc.nextDouble();
		if (score > 0 && score <= 100){
			//..
			switch ((int)(score/60)){
			case 1:
				System.out.println("成绩合格！");
				break;
			case 0:
				System.out.println("成绩不合格！");
				break;
			default:
				System.out.println("输入有误！");			}
		}else {
			System.out.println("成绩有误，请重新输入！");
		}
	}
}