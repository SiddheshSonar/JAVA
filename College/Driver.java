import myPackage.*;
import java.util.*;
import java.text.DecimalFormat;

public class Driver {
  public static void main(String[] args) {
    int n;
    double amt, gst, total;
    DecimalFormat df = new DecimalFormat("#.00");
    GST gs = new GST();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the amount - ");
    amt = sc.nextDouble();
    while (true) {
      System.out.println("Enter\n1-CGST\n2-SGST\n3-UTGST\n4-IGST\n5-To Exit");
      n = sc.nextInt();
      switch (n) {
        case 1:
          gst = gs.calculateGST(1, amt);
          total = amt + gst;
          System.out.println("CGST on the given amount = " + df.format(gst) + " Rs");
          System.out.println("Total amount after adding CGST = " + df.format(total) + " Rs");
          break;
        case 2:
          gst = gs.calculateGST(2, amt);
          System.out.println("SGST on the given amount = " + df.format(gst) + " Rs");
          total = amt + gst;
          System.out.println("Total amount after adding SGST = " + df.format(total) + " Rs");
          break;
        case 3:
          gst = gs.calculateGST(3, amt);
          System.out.println("UTGST on the given amount = " + df.format(gst) + " Rs");
          total = amt + gst;
          System.out.println("Total amount after adding UTGST = " + df.format(total) + " Rs");
          break;
        case 4:
          gst = gs.calculateGST(4, amt);
          System.out.println("IGST on the given amount = " + df.format(gst) + " Rs");
          total = amt + gst;
          System.out.println("Total amount after adding IGST = " + df.format(total) + " Rs");
          break;
        case 5:
          return;
        default:
          System.out.println("Invalid Operation!");
      }
    }
  }
}
