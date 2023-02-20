import java.util.Scanner;

public class name {
    public static void main(String args[])
    {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name - ");
        str = sc.nextLine();
        System.out.println("Hello "+str+" have a good day!");
    }
}
