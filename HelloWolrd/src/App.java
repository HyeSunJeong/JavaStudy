//정수 567을 백의자리, 십의자리, 일의자리로 분리하는 프로그램
public class App {
    public static void main(String[] args) {
        int a = 567;
        System.out.println("정수 567의 백의자리는 : " +a/100);
        System.out.println("정수 567의 십의자리는 : " +(a%100)/10);
        System.out.println("정수 567의 일의자리는 : " +(a%100)%10);
    }
}
