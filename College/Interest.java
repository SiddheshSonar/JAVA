import java.util.*;
import java.lang.Math;
import java.text.DecimalFormat;

interface SavingAccount {
    public double getSimpleInterest(double p, double n, double r);
}

interface CurrentAccount {
    public double getCompoundInterest(double p, double n, double r);
}

class Customer implements SavingAccount, CurrentAccount {
    int atype;
    double prin, ny, rate;

    Customer(int type, double p, double n, double r) {
        atype = type;
        prin = p;
        n = ny;
        rate = r;
    }

    public double getSimpleInterest(double p, double n, double r) {
        double sint = (p * n * r) / 100;
        return sint;
    }

    public double getCompoundInterest(double p, double n, double r) {
        double a = p * Math.pow((1 + r / 100), n);
        double cint = a - p;
        return cint;
    }
}

public class Interest {
    public static void main(String args[]) {
        int a;
        double p, n, r, simp, comp;
        DecimalFormat df = new DecimalFormat("#.00");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter\n1-Savings Account\n2-Current Account\n3-Exit");
            a = sc.nextInt();
            if (a == 1) {
                System.out.println("\nWelcome to your Savings Account!\n");
                System.out.println("Enter the amount you want to calculate interest on - ");
                p = sc.nextDouble();
                System.out.println("Enter the time period - ");
                n = sc.nextDouble();
                System.out.println("Enter the rate of interest - ");
                r = sc.nextDouble();
                Customer c1 = new Customer(1, p, n, r);
                simp = c1.getSimpleInterest(p, n, r);
                System.out.println("\nSimple Interest = " + df.format(simp));
            } else if (a == 2) {
                System.out.println("\nWelcome to your Current Account!\n");
                System.out.println("Enter the amount you want to calculate interest on - ");
                p = sc.nextDouble();
                System.out.println("Enter the time period - ");
                n = sc.nextDouble();
                System.out.println("Enter the rate of interest - ");
                r = sc.nextDouble();
                Customer c2 = new Customer(2, p, n, r);
                comp = c2.getCompoundInterest(p, n, r);
                System.out.println("\nCompound Interest = " + df.format(comp));
            } else if (a == 3) {
                System.out.println("Thankyou!");
                return;
            } else {
                System.out.println("Invalid Operation!");
            }
        }
    }
}