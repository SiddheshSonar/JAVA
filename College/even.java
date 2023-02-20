import java.util.*;

class num 
{
  public void evenodd() 
  {
    int a, b, count1 = 0, count2 = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number of the range - ");
    a = sc.nextInt();
    System.out.println("Enter the second number of the range - ");
    b = sc.nextInt();
    System.out.println("Even Numbers in the range are - ");
    for (int i = a; i <= b; i++) {
      if (i % 2 == 0) 
      {
        System.out.println(i + " ");
        count1++;
      }
    }
    System.out.println("Odd Numbers in the range are - ");
    for (int i = a; i <= b; i++) {
      if (i % 2 != 0) 
      {
        System.out.println(i + " ");
        count2++;
      }
    }
    System.out.println("Total number of Even Numbers in the range are - " + count1);
    System.out.println("Total number of Odd Numbers in the range are - " + count2);
  }
}

public class even 
{
  public static void main(String args[]) 
  {
    num n = new num();
    n.evenodd();
  }
}