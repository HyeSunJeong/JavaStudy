// x의 n제곱(x^n)을 계산하는 프로그램을 재귀를 이용하여 작성하시오. 단, 재귀함수 이름은 power 사용.

public class Recursive {
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        // power 재귀 사용, x와 n값을 넣어주고 출력
        System.out.println(power(x, n));
    }

    // power 함수 정의
    public static int power(int x, int n) {
        // n이 0이면 1값을 반환 -> 지수가 0이면, 값은 1이기 때문
        if (n == 0) 
            return 1;
        // x의 n제곱의 원리, 팩토리얼의 원리와도 같음
        else 
            return x * power(x, n-1);
    }
}