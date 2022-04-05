import java.util.Scanner;

//점수를 입력받아 성적 평균을 출력하는 프로그램
public class sil2Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Grade[] gd = new Grade[5];
        for(int i=0; i<gd.length; i++) {
            System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
            String name = scan.next();
            int math = scan.nextInt();
            int science = scan.nextInt();
            int english = scan.nextInt();
            gd[i] = new Grade(name, math, science, english);
            System.out.println(gd[i].name = "평균은" + gd[i].average());
        }
        scan.close();
    }
}