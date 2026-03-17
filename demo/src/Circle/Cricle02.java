public class Cricle02{
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		for ( i=1 ; i <= 100 ; i++ ) {
			sum += i;
			if (sum > 20) {
				System.out.println("和>20,和为："+ sum + '\n');
				System.out.println("当前数为"+ i);
				break;
			}
			
		}
	}
}