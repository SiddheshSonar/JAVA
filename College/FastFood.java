import java.util.*;
import java.text.DecimalFormat;

interface EatItHere {
    public double dispatchOrder(double price);
}

interface TakeAway {
    public double deliverOrder(double price);
}

class Consumer implements EatItHere, TakeAway {
    int num;
    double price;

    Consumer(int onum, double oprice) {
        num = onum;
        price = oprice;
    }

    public double dispatchOrder(double price) {
        if ((0.1 * price) < 500) {
            price = price + (0.1 * price);
            return price;
        } else {
            price = price + 500;
            return price;
        }
    }

    public double deliverOrder(double price) {
        if ((0.05 * price) > 45) {
            price = price + (0.05 * price);
            return price;
        } else {
            price = price + 45;
            return price;
        }
    }
}

public class FastFood {
    public static void main(String[] args) {
        int n, onum;
        double oprice, total;
        DecimalFormat df = new DecimalFormat("#.00");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter\n1-Dine in\n2-Takeaway\n3-Exit");
            n = sc.nextInt();
            if (n == 1) {
                System.out.println("Enter the order number -");
                onum = sc.nextInt();
                System.out.println("Enter the order price - ");
                oprice = sc.nextDouble();
                Consumer c = new Consumer(onum, oprice);
                total = c.dispatchOrder(oprice);
                System.out.println("\nTotal Amount = " + df.format(total) + "\n");
            } else if (n == 2) {
                System.out.println("Enter the order number -");
                onum = sc.nextInt();
                System.out.println("Enter the order price - ");
                oprice = sc.nextDouble();
                Consumer c = new Consumer(onum, oprice);
                total = c.deliverOrder(oprice);
                System.out.println("\nTotal Amount = " + df.format(total) + "\n");
            } else if (n == 3) {
                return;
            } else {
                System.out.println("Invalid Operation!");
            }
        }
    }
}