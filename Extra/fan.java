import java.util.Scanner;

public class fan {
  public static void main(String[] args) {
    System.out.println("Lets take the input from user  ");
    Scanner sam = new Scanner(System.in);

    System.out.println("Let the 1st number be : ");
    int a = sam.nextInt();

    System.out.println("Let the 2nd number be: ");
    int b = sam.nextInt();

    int sum = a + b;
    System.out.println("The sum of 2 number is :  ");
    System.out.println(sum);
    sam.close();

  }
}