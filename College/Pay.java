import java.util.*;

abstract class Payment {
    double amount = 25000;

    abstract double paymentDetails(int nc, int na);
}

class Westside {
    int ac = 10;
    int cl = 10;
    double cost = 5000;
}

class CashPayment extends Payment {
    double paymentDetails(int nc, int na) {
        double amt;
        amt = (nc + na) * 5000;
        if (amount > amt) {
            amount = amount - amt;
            return amt;
        } else {
            return 0;
        }
    }
}

class CreditCardPayment extends Payment {
    String name, date, num;

    CreditCardPayment(String name, String date, String num) {
        this.name = name;
        this.date = date;
        this.num = num;
    }

    double paymentDetails(int nc, int na) {
        double amt;
        amt = (nc + na) * 5000;
        if (amount > amt) {
            amount = amount - amt;
            return amt;
        } else {
            return 0;
        }
    }
}

class Person {
    String person_name, p_phone_no;
}

public class Pay {
    public static void main(String[] args) {
        int n, m, cnum = 0, anum = 0;
        double total;
        String name, date, num;
        Scanner sc = new Scanner(System.in);
        Scanner txt = new Scanner(System.in);
        Westside w = new Westside();
        CashPayment cp = new CashPayment();
        Person p = new Person();
        System.out.println("Enter Your Name - ");
        p.person_name = txt.nextLine();
        System.out.println("Your Phone Number - ");
        p.p_phone_no = txt.nextLine();
        while (true) {
            System.out.println("\nEnter\n1-Clothes\n2-Accessories\n3-Payment\n4-Exit\n");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println(w.cl + " clothes left!");
                    System.out.println("Enter the no of clothes you want -");
                    cnum = sc.nextInt();
                    if (cnum <= w.cl) {
                        w.cl = w.cl - cnum;
                    } else {
                        System.out.println("Sorry we dont have that much in stock!");
                    }
                    break;
                case 2:
                    System.out.println(w.ac + " accessories left!");
                    System.out.println("Enter the no of accessories you want -");
                    anum = sc.nextInt();
                    if (anum <= w.ac) {
                        w.ac = w.ac - anum;
                    } else {
                        System.out.println("Sorry we dont have that much in stock!");
                    }
                    break;
                case 3:
                    System.out.println("Enter\n1-Cash\n2-Card");
                    m = sc.nextInt();
                    if (m == 1) {
                        total = cp.paymentDetails(cnum, anum);
                        System.out.println("Payment - " + total);
                    } else if (m == 2) {
                        System.out.println("Enter name: ");
                        name = txt.nextLine();
                        System.out.println("Enter expiry date: ");
                        date = txt.nextLine();
                        System.out.println("Enter credit card number: ");
                        num = txt.nextLine();
                        CreditCardPayment cc = new CreditCardPayment(name, date, num);
                        total = cc.paymentDetails(cnum, anum);
                        if (total != 0) {
                            System.out.println();
                            System.out.println("Payment - " + total);
                            System.out.println();
                            System.out.printf("Invoice:-\nName: %s \nCard no: %s\nExpiry: %s\n", cc.name, cc.num,
                                    cc.date);
                        } else {
                            System.out.println("Not enough money!");
                        }
                    } else {
                        return;
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid Operation!");
            }
        }
    }
}