import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        float a, b, c, d, e, per;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks obtained in English - ");
        a = sc.nextFloat();
        System.out.println("Enter the marks obtained in Hindi - ");
        b = sc.nextFloat();
        System.out.println("Enter the marks obtained in Marathi - ");
        c = sc.nextFloat();
        System.out.println("Enter the marks obtained in Maths - ");
        d = sc.nextFloat();
        System.out.println("Enter the marks obtained in Science - ");
        e = sc.nextFloat();
        per = ((a+b+c+d+e)*100)/500;
        System.out.println("Percentage = "+per+"%");
    }
}