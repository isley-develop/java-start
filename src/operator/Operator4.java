package operator;

public class Operator4 {
    public static void main(String[] args) {
        // 연산자 우선순위가 발생하는 경우 그냥 괄호로 명확히 표시하자
        int sum3 = 2 * 2 + 3 * 3;
        int sum4 = (2 * 2) + (3 * 3);
        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);
    }
}
