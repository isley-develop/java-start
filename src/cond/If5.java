package cond;

public class If5 {
    public static void main(String[] args) {
        int price = 9000;
        int age = 7;
        int discount = 0;

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("1만원 이상 구매, 1000원 할인");
        }
        else System.out.println("할인 대상이 아닙니다.");

        if (age <= 10) {
            discount = discount + 1000;
            System.out.println("10살 이하 어린이 1000원 할인");
        }
        else System.out.println("할인 대상이 아닙니다.");

        System.out.println("총 할인 금액: " + discount + "원");
    }
}
