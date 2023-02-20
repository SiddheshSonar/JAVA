import java.util.*;
import java.lang.Math;

public class bank {
  static float amount, rate;

  public bank(float balance, float interest) {
    amount = balance;
    rate = interest;
  }

  static void deposit(float dep) {
    amount = amount + dep;
  }

  static void withdraw(float wit) {
    if (wit < amount) {
      amount = amount - wit;
    } else {
      System.out.println("Insufficient Amount!");
    }
  }

  static double compint(int year) {
    return (amount * (Math.pow((1 + rate), year)) - amount);
  }

  public static void main(String args[]) {
    int a, year;
    float b, r, dep, wit;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the balance amount - ");
    b = sc.nextFloat();
    System.out.println("Enter the rate of interest - ");
    r = sc.nextFloat();
    bank b1 = new bank(b, r);
    while (true) {
      System.out.println(
          "1-To make deposit\n2-To withdraw\n3-To find compound interest\n4-To know the balance amount\n5-Exit");
      System.out.println("Enter the operation you want to perform -");
      a = sc.nextInt();
      switch (a) {
        case 1:
          System.out.println("Enter the amount to be deposited - ");
          dep = sc.nextFloat();
          bank.deposit(dep);
          System.out.println("Amount Successfully deposited!");
          System.out.println("Remaining Amount - " + amount);
          dep = 0;
          break;
        case 2:
          System.out.println("Enter the amount to be withdrawn - ");
          wit = sc.nextFloat();
          bank.withdraw(wit);
          System.out.println("Remaining Amount - " + amount);
          wit = 0;
          break;
        case 3:
          System.out.println("Enter the no of years -");
          year = sc.nextInt();
          System.out.println("Compound interest is - " + bank.compint(year));
          year = 0;
          break;
        case 4:
          System.out.println("Balance Amount - " + amount);
          break;
        case 5:
          return;
        default:
          System.out.println("Invalid Operation!");
      }
    }
  }
}