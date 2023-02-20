import java.util.*;
import java.lang.Math;
import java.text.DecimalFormat;

class employee {
    double salary;
    double bonus;
    DecimalFormat df = new DecimalFormat("0.00");

    public void getsalary(double salary) {
        salary = 10000.00;
    }

    public void getbonus(double bonus) {
        bonus = 0;
    }

}

class intern extends employee {
    public void getsalary(double sal) {
        sal = sal * 3 / 4;
        System.out.println("Salary is " + df.format(sal));
        salary = sal;
    }

    public void getbonus(double bon) {
        salary = salary + bon;
        System.out.println("Total salary (with bonus added) is " + df.format(salary));
    }

}

class clerk extends employee {
    public void getsalary(double sal) {
        sal = sal * 1 / 2;
        System.out.println("Salary is " + df.format(sal));
        salary = sal;
    }

    public void getbonus(double bon) {
        salary = salary + bon;
        System.out.println("Total salary (with bonus added) is " + df.format(salary));
    }
}

class manager extends employee {
    public void getsalary(double sal) {
        sal = sal * 2;
        System.out.println("Salary is " + df.format(sal));
        salary = sal;
    }

    public void getbonus(double bon) {
        salary = salary + bon;
        System.out.println("Total salary (with bonus added) is " + df.format(salary));
    }
}

class company {
    public static void main(String args[]) {
        double a, b;
        int c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary of employee -");
        a = sc.nextDouble();

        System.out.println("Enter bonus of employee -");
        b = sc.nextDouble();

        System.out.println("Select 1 for Intern \nSelect 2 for Clerk \nSelect 3 for Manager -");
        c = sc.nextInt();

        if (c == 1) {
            intern s1 = new intern();
            s1.getsalary(a);
            s1.getbonus(b);

        }

        else if (c == 2) {
            clerk s2 = new clerk();
            s2.getsalary(a);
            s2.getbonus(b);
        }

        else {
            manager s3 = new manager();
            s3.getsalary(a);
            s3.getbonus(b);
        }

    }
}