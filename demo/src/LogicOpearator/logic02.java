public class logic02 {
    public static void main(String[] args) {
        int x = 10;
        // 短路与：左边(x>20)为false，右边(x--)不执行
        boolean res1 = (x > 20) && (x-- > 5);
        System.out.println("res1: " + res1 + ", x: " + x); // 结果：res1: false, x: 10

        int y = 10;
        // 不短路与：左边(y>20)为false，右边(y--)仍执行
        boolean res2 = (y > 20) & (y-- > 5);
        System.out.println("res2: " + res2 + ", y: " + y); // 结果：res2: false, y: 9
    }
}