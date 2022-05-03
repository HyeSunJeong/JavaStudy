public class Point {
    protected int x;
    int y;

    public Point() {
        x=0;
        y=0;
        System.out.println("colorpoint 객체생성");
    }

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("colorpoint 객체생성");
    }

    public void show() {
        System.out.println("("+x+", "+y+")");
    }
}