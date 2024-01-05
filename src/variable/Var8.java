package variable;

public class Var8 {
    public static void main(String[] args) {
        // 정수
        byte b = 127; // -128 ~ +127 사이의 값만 저장 가능
        short s = 32767; // -32768 ~ 32767 사이 값만 저장 가능
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647 (약 21억) 사이
        System.out.println("byte, short보다는 int(20억 미만), long(20억 이상)을 사용한다.");

        long z = 2147483647L;

        long l = 9223372036854775807L; // 맨 뒤에 L 대문자 넣어줘야 함 (소문자는 헷갈릴 수 있어서 권장 x)
        // -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 사이 값

        //실수
        float f = 10.0f; // 맨 뒤에 f 붙여줘야 함
        double d = 10.0; // double이 float보다 더 넓은 범위
        System.out.println("float보다는 double를 사용한다.");
        
    }
}
