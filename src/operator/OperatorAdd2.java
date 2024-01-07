package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        // 전위 증감 연산자를 사용해보자
        int a = 1;
        int b = 0;
        b = ++a;
        System.out.println("a = " + a + "b = " + b);
        b = ++a;
        System.out.println("a = " + a + "b = " + b);
        b = b + a;
        System.out.println(b);
    }
}
