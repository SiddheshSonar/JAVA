import java.util.*;
import java.lang.Math;

class decide {
    double rand;

    decide() {
        rand = 0;
    }
}

public class esegame {
    public static void main(String[] args) {
        double[] p = new double[2];
        p[0] = 0;
        p[1] = 0;
        decide[] d = new decide[10];
        String name1, name2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the first player - ");
        name1 = sc.nextLine();
        System.out.println("Enter the name of the second player - ");
        name2 = sc.nextLine();
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                double r = 1000 * Math.random();
                p[i] = p[i] + r;
            }
        }
        if (p[0] > p[1]) {
            System.out.println("Amount with " + name1 + " - " + p[0]);
            System.out.println("Amount with " + name2 + " - " + p[1]);
            System.out.println();
            System.out.println("Winner - " + name1 + " GOD");
            System.out.println();
        } else if (p[0] < p[1]) {
            System.out.println("Amount with " + name1 + " - " + p[0]);
            System.out.println("Amount with " + name2 + " - " + p[1]);
            System.out.println();
            System.out.println("Winner - " + name2 + " GOD");
            System.out.println();
        } else {
            System.out.println("Amount with " + name1 + " - " + p[0]);
            System.out.println("Amount with " + name2 + " - " + p[1]);
            System.out.println();
            System.out.println("TIE!");
            System.out.println();
        }
    }
}
