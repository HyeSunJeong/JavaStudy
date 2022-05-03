package A2;

public class Rect implements Shape {

    public Rect() {

    }

    @Override
    public void D1() {
        System.out.println("Rect D1");
    }

    @Override
    public void D2(int x) {
        System.out.println("Rect D2 - " + x);
    }

}
