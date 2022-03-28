//학생 5명의 이름과 점수를 입력받아 배열에 저장한 후 각 학생의 학점을 판단하는 프로그램
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.println("학생 5명의 이름과 점수를 입력하시오.");
        Scanner sc = new Scanner(System.in);
        String[] name = new String[5];
        int[] score = new int [5];

        for(int i = 0; i < name.length; i++) {
            name[i] = sc.next();
            score[i] = sc.nextInt();
        }
        sc.close();
        
        for(int i = 0; i < name.length; i++) {
            if (score[i] >= 90) {
                System.out.println(name[i] + " A");
            }
            else if (score[i] >= 80) {
                System.out.println(name[i] + " B");
            }
            else if (score[i] >= 70) {
                System.out.println(name[i] + " C");
            }
            else if (score[i] >= 60) {
                System.out.println(name[i] + " D");
            }
            else {
                System.out.println(name[i] + " F");
            }
        }
    }
}