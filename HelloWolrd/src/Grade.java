//점수를 입력받아 성적 평균을 출력하는 프로그램
public class Grade {
    String name;
    int math;
    int science;
    int english;
    public Grade() {
        name = "anonymous";
        math = 60;
        science = 60;
        english = 60;
    }
    public Grade(String n, int m, int s, int e) { //생성자
        name = n;
        math = m;
        science = s;
        english = e;
    }
    public double average() {
        return (math + science + english) / 3.0;
    }
}