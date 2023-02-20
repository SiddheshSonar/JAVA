import java.util.Scanner;
import java.lang.Math.*;

class Bank {
  double amount;

  double comp(double pr, double dy, double rt) {
    return pr * Math.pow((1 + rt), dy / 365);
  }

  double get_rate_of_interest(double pr, double dy) {
    amount = comp(pr, dy, 2.0);
    return amount;
  }
}

class SBI_Bank extends Bank {
  double get_rate_of_interest(double pr, double dy) {
    if (dy < 7) {
      amount = comp(pr, dy, 2.0);
    } else if (dy >= 7 && dy <= 14) {
      amount = comp(pr, dy, 3.00);
    } else if (dy >= 15 && dy <= 30) {
      amount = comp(pr, dy, 3.00);
    } else if (dy >= 31 && dy <= 45) {
      amount = comp(pr, dy, 3.00);
    } else if (dy >= 46 && dy <= 90) {
      amount = comp(pr, dy, 4.05);
    } else if (dy >= 91 && dy <= 120) {
      amount = comp(pr, dy, 4.10);
    } else {
      amount = comp(pr, dy, 4.10);
    }
    return amount;
  }
}

class ICICI_Bank extends Bank {
  double get_rate_of_interest(double pr, double dy) {
    if (dy < 7) {
      amount = comp(pr, dy, 2.0);
    } else if (dy >= 7 && dy <= 14) {
      amount = comp(pr, dy, 3.10);
    } else if (dy >= 15 && dy <= 30) {
      amount = comp(pr, dy, 3.20);
    } else if (dy >= 31 && dy <= 45) {
      amount = comp(pr, dy, 3.50);
    } else if (dy >= 46 && dy <= 90) {
      amount = comp(pr, dy, 4.50);
    } else if (dy >= 91 && dy <= 120) {
      amount = comp(pr, dy, 4.70);
    } else {
      amount = comp(pr, dy, 4.90);
    }
    return amount;
  }
}

class AXIS_Bank extends Bank {
  double get_rate_of_interest(double pr, double dy) {
    if (dy < 7) {
      amount = comp(pr, dy, 2.0);
    } else if (dy >= 7 && dy <= 14) {
      amount = comp(pr, dy, 3.15);
    } else if (dy >= 15 && dy <= 30) {
      amount = comp(pr, dy, 3.15);
    } else if (dy >= 31 && dy <= 45) {
      amount = comp(pr, dy, 3.45);
    } else if (dy >= 46 && dy <= 90) {
      amount = comp(pr, dy, 4.05);
    } else if (dy >= 91 && dy <= 120) {
      amount = comp(pr, dy, 4.70);
    } else {
      amount = comp(pr, dy, 5.00);
    }
    return amount;
  }
}

public class calender {
  public static void main(String args[]) {
    double prin, time, total;
    int n;
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.println("Enter\n1 - SBI Bank\n2 - ICICI Bank\n3 - AXIS Bank\n4 - Exit");
      n = sc.nextInt();
      if (n == 1) {
        SBI_Bank sb = new SBI_Bank();
        System.out.println("Enter the Principle amount - ");
        prin = sc.nextDouble();
        System.out.println("Enter the Time period - ");
        time = sc.nextDouble();
        total = sb.get_rate_of_interest(prin, time);
        System.out.println("Total amount after " + time + " days is " + total);
      } else if (n == 2) {
        ICICI_Bank ic = new ICICI_Bank();
        System.out.println("Enter the Principle amount - ");
        prin = sc.nextDouble();
        System.out.println("Enter the Time period - ");
        time = sc.nextDouble();
        total = ic.get_rate_of_interest(prin, time);
        System.out.println("Total amount after " + time + " days is " + total);
      } else if (n == 3) {
        AXIS_Bank ab = new AXIS_Bank();
        System.out.println("Enter the Principle amount - ");
        prin = sc.nextDouble();
        System.out.println("Enter the Time period - ");
        time = sc.nextDouble();
        total = ab.get_rate_of_interest(prin, time);
        System.out.println("Total amount after " + time + " days is " + total);
      } else if (n == 4) {
        return;
      } else {
        System.out.println("Invalid Operation!");
      }
    }
  }
}