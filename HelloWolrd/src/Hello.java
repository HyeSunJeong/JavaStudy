// 예제 2-1 자바 프로그램의 기본 구조
public class Hello {
    // 메소드 내에서 선언된 지역변수 n과 m! sum 메소드가 끝나면 사라지는 변수들
    public static int sum (int n, int m) {
        return n + m;
    }

    // main() 메소드에서 실행 시작
    public static void main (String[] args) {
        int i = 20;
        int s;
        char a;

        s = sum (i, 10); // sum() 메소드 호출
        a = '?';
        System.out.println(a); // 문자 '?' 화면 출력
        System.out.println("Hello"); // "Hello" 문자열 화면 출력
        System.out.println(s); // 정수 s값 화면 출력
    }
}