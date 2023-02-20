import java.util.Scanner;

public class line {
   static double m, c;

   static void point(double m, double c) {
      if (c >= 0) {
         System.out.println("y = " + m + "x + " + c);
      } else {
         System.out.println("y = " + m + "x " + c);
      }
      System.out.println();
   }

   static void point(double m, double x1, double y1) {
      c = y1 - m * x1;
      if (c >= 0) {
         System.out.println("y = " + m + "x + " + c);
      } else {
         System.out.println("y = " + m + "x " + c);
      }
      System.out.println();
   }

   static void point(double x1, double y1, double x2, double y2) {
      m = (y2 - y1) / (x2 - x1);
      c = y1 - m * x1;
      if (c >= 0) {
         System.out.println("y = " + m + "x + " + c);
      } else {
         System.out.println("y = " + m + "x " + c);
      }
      System.out.println();
   }

   public static void main(String args[]) {
      int a;
      double x1, x2, y1, y2;
      Scanner sc = new Scanner(System.in);
      while (true) {
         System.out.println("Enter\n1-Slope-y-intercept Form\n2-Slope Point Form\n3-Two Point Form\n4-Exit");
         a = sc.nextInt();
         switch (a) {
            case 1:
               System.out.println("Enter the slope - ");
               m = sc.nextDouble();
               System.out.println("Enter the y intercept - ");
               c = sc.nextDouble();
               System.out.println("\nSlope intercept form of the line is - ");
               line.point(m, c);
               break;
            case 2:
               System.out.println("Enter the slope - ");
               m = sc.nextDouble();
               System.out.println("Enter the x co-ordinate of the point - ");
               x1 = sc.nextDouble();
               System.out.println("Enter the y co-ordinate of the point - ");
               y1 = sc.nextDouble();
               System.out.println("\nSlope point form of the line is - ");
               line.point(m, x1, y1);
               break;
            case 3:
               System.out.println("Enter the x co-ordinate of the first point - ");
               x1 = sc.nextDouble();
               System.out.println("Enter the y co-ordinate of the first point - ");
               y1 = sc.nextDouble();
               System.out.println("Enter the x co-ordinate of the second point - ");
               x2 = sc.nextDouble();
               System.out.println("Enter the y co-ordinate of the second point - ");
               y2 = sc.nextDouble();
               System.out.println("\nTwo point form of the line is - ");
               line.point(x1, y1, x2, y2);
               break;
            case 4:
               return;
            default:
               System.out.println("Invalid Operation!");
         }
      }
   }
}