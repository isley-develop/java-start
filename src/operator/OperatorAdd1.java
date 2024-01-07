package operator;

public class OperatorAdd1 {
    public static void main(String[] args) {
        int a = 0;

        a = a + 1;
        System.out.println("a = " + a);
        a = a + 1;
        System.out.println("a = " + a);
        // 순차적으로 진행

        ++a;
        System.out.println("a = " + a);
        ++a;
        System.out.println("a = " + a);
        // ++(변수명) 증감연산자를 이용해 값의 1씩 증가/감소를 지시

    }
}
