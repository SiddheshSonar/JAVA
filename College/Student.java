import java.util.*;System.out.println("");

abstract class Course {
    abstract void studentDetails();
}

class Comps extends Course {
    void studentDetails() {
    }
}

class IT extends Course {
    void studentDetails() {
    }
}

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner ln = new Scanner(System.in);
        System.out.println("Enter the number of courses - ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name of the course - ");
            String cname = ln.nextLine();
            System.out.println("Enter 0 - Comps course and 1 - IT course - ");
            int cnum = sc.nextInt();
        }
    }
}
