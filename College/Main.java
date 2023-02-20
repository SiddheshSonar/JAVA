import java.util.Scanner;

abstract class Course {
    abstract void studentDetail();
    int UID;
    String year;
    String name;
}

class Comp extends Course {
    Comp(int x, String y, String z) {
        UID = x;
        year = y;
        name = z;
    }

    void studentDetail() {
        System.out.println("Name - " + name + "UID-" + UID + " Year-" + year);
    }
}

class It extends Course {
    It(int x, String y, String z) {
        UID = x;
        year = y;
        name = z;
    }

    void studentDetail() {
        System.out.println("Name - " + name + "UID-" + UID + " Year-" + year);
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String id, year;
        int i;
        System.out.println("For Computer Course Enter UID , Year and Name");
        i = sc.nextInt();
        year = sc.next();
        id = sc.next();
        Comp c = new Comp(i, year, id);
        c.studentDetail();
        System.out.println("For IT Course Enter UID , Year and Name");
        i = sc.nextInt();
        year = sc.next();
        id = sc.next();
        It c1 = new It(i, year, id);
        c.studentDetail();
    }
}