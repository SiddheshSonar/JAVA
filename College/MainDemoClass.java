import myPack.*;
import java.util.*;

public class MainDemoClass {
    public static void main(String[] args) {
        int n, age, rn, ec, ds, df;
        String name, branch, doj;
        Scanner sc = new Scanner(System.in);
        Scanner tx = new Scanner(System.in);
        while (true) {
            System.out.println("Enter\n1-Student\n2-Staff\n3-Faculty\n4-Exit");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter the name of the student -");
                    name = tx.nextLine();
                    System.out.println("Enter the age of the student -");
                    age = sc.nextInt();
                    System.out.println("Enter the roll no of the student -");
                    rn = sc.nextInt();
                    System.out.println("Enter the branch of the student -");
                    branch = tx.nextLine();
                    Student st = new Student(name, age, rn, branch);
                    System.out.println();
                    st.display();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Enter the name of the Staff member -");
                    name = tx.nextLine();
                    System.out.println("Enter the age of the Staff member -");
                    age = sc.nextInt();
                    System.out.println("Enter the ec no - ");
                    ec = sc.nextInt();
                    System.out.println("Enter the date of joining -");
                    doj = tx.nextLine();
                    System.out.println("Enter\n1-Technical Staff\n2-Clerical Staff");
                    ds = sc.nextInt();
                    //Staff s = new Staff(name, age, ec, doj, ds);
                    System.out.println();
                    //1
                    s.display();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Enter the name of the Staff member -");
                    name = tx.nextLine();
                    System.out.println("Enter the age of the Staff member -");
                    age = sc.nextInt();
                    System.out.println("Enter the ec no - ");
                    ec = sc.nextInt();
                    System.out.println("Enter the date of joining -");
                    doj = tx.nextLine();
                    System.out.println("Enter\n1-Assistant Professor\n2-Associate Professor\n3-Professor");
                    df = sc.nextInt();
                    //Faculty f = new Faculty(name, age, ec, doj, df);
                    System.out.println();
                    //f.display();
                    System.out.println();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid Operation!");
            }
        }
    }
}