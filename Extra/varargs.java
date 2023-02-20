public class varargs {
    static int sum(int... arr) {
        int s = 0;
        for (int a : arr) {
            s = s + a;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println("Sum = " + sum(2, 3));
        System.out.println("Sum = " + sum(2, 3, 4));
        System.out.println("Sum = " + sum(2, 3, 4, 5));
        System.out.println("Sum = " + sum(2, 3, 4, 5, 6));
    }
}
