public class ColorPoint extends Point {
    String color;
    public ColorPoint() {
        super();
        color = "W";
        System.out.println("colorpoint 객체생성");
    }
    public ColorPoint (int x, int  y, String color) {
        super(x, y);
        this.color = color;
        System.out.println("colorpoint 객체생성");
    }
    public void showColor () {
        super.show();
        System.out.println(color);
    }
}