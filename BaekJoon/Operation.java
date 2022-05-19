// 10869번: 사칙연산
// 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.

// Scanner Class 호출 (Java의 기능 주머니 중 Scanner 기능 하나를 꺼내옴)
import java.util.Scanner; 

class Operation { // 왜 Public을 여기에 쓰면 컴파일 오류지?
    // main 메소드
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner 객체 생성
        System.out.println("사칙연산 프로그램");
        System.out.println("두 자연수를 입력해주세요."); // 자연수 입력 메세지 출력

        int a = scanner.nextInt(); // 자연수를 입력 받아야 하니 정수형 자료형 int 사용
        int b = scanner.nextInt();

        // a와 b의 연산 값을 받을 변수 선언
        int Add, Min, Mul, Div;

        // 사칙연산
        Add = a + b;
        Min = a - b;
        Mul = a * b;
        Div = a / b;
        System.out.println("두 자연수의 사칙연산 값은");
        System.out.println("덧셈: " + Add + " 뺄셈: " + Min + " 곱셈: " + Mul + " 나눗셈: " + Div);

        scanner.close();
    }
}