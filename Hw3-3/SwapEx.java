public class SwapEx {
    public static void main(String[] args) {
        int x = 4;
        int y = 8;
        swap(x, y);
        System.out.println(x + y);
    }

    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        return ;
    }
}

