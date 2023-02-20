import java.util.*;
import java.lang.Math;

public class fraction {
   static int num, den;

   public fraction(int a, int b) {
      num = a;
      den = b;
   }

   static void hcf(int a, int b) {
      int x, y, r;
      if (a < b) {
         x = b;
         y = a;
      } else {
         x = a;
         y = b;
      }
      r = x % y;
      while (r != 0) {
         x = y;
         y = r;
         r = x % y;

      }
      num = a / y;
      den = b / y;
   }

   static void add(int a[]) {
      fraction.hcf((a[0] * a[3] + a[1] * a[2]), (a[1] * a[3]));
      System.out.println("\nSum = " + num + "/" + den);
   }

   static void sub(int a[]) {
      fraction.hcf((a[0] * a[3] - a[1] * a[2]), (a[1] * a[3]));
      System.out.println("\nDifference = " + num + "/" + den);
   }

   static void mult(int a[]) {
      fraction.hcf(a[0] * a[2], a[1] * a[3]);
      System.out.println("\nProduct = " + num + "/" + den);
   }

   static void div(int a[]) {
      fraction.hcf(a[0] * a[3], a[1] * a[2]);
      System.out.println("\nDivision = " + num + "/" + den);
   }

   static void multitable(int a, int b, int c, int d) {
      fraction.hcf(a * c, b * d);
   }

   static void table(int t) {
      num = 1;
      den = t;
      for (int i = 1; i < t; i++) {
         fraction.hcf(i, t);
         System.out.print("\t" + num + "/" + den);
      }
      System.out.println();
      for (int i = 1; i < t; i++) {
         fraction.hcf(i, t);
         System.out.print("\n" + num + "/" + den);
         int num1 = num, den1 = den;
         for (int j = 1; j < t; j++) {
            fraction.multitable(num1, den1, j, t);
            System.out.print("\t" + num + "/" + den);
         }
         System.out.println();
      }
   }

   public static void main(String args[]) {
      int a[] = new int[4];
      int n, t;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the fractions one by one numerator first then denominator - ");
      for (int i = 0; i < 4; i++) {
         a[i] = sc.nextInt();
      }
      while (true) {
         System.out.println("\nEnter the operation you want to perform -");
         System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division\n5-Table\n6-Exit");
         n = sc.nextInt();

         switch (n) {
            case 1:
               fraction.add(a);
               break;
            case 2:
               fraction.sub(a);
               break;
            case 3:
               fraction.mult(a);
               break;
            case 4:
               fraction.div(a);
               break;
            case 5:
               System.out.println("Enter the denominator for the table - ");
               t = sc.nextInt();
               fraction.table(t);
               break;
            case 6:
               return;
            default:
               System.out.println("Invalid Operation!");
               break;
         }
      }
   }
}