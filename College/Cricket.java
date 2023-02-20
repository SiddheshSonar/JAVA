import java.util.*;

class Cricketer {
    String name;
    int run, count, notout;
    double avg;

    Cricketer() {
    }

    Cricketer(String name, int inn, int run, int n) {
        this.name = name;
        count = inn;
        this.run = run;
        notout = n;
        get_avg();
    }

    void get_avg() {
        try {
            avg = run / count;
        } catch (ArithmeticException ae) {
            System.out.print("\nINNING COUNT = 0\nARITHMETHIC EXCEPTION");
            avg = 0;
        }
    }
}

class Cricket {
    public static void main(String[] args) {
        Cricketer temp = new Cricketer();
        String name;
        int run, inn, n;
        Scanner sc = new Scanner(System.in);
        Scanner tsc = new Scanner(System.in);
        Cricketer C[] = new Cricketer[11];
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details of player number " + (i + 1));
            System.out.print("\nName: ");
            name = tsc.nextLine();
            System.out.print("\nINNINGS PLAYED: ");
            inn = sc.nextInt();
            System.out.print("\nTotal Runs scored: ");
            run = sc.nextInt();
            System.out.print("\nNOTOUT: ");
            n = sc.nextInt();
            C[i] = new Cricketer(name, inn, run, n);
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (C[j].avg < C[j + 1].avg) {
                    temp = C[j + 1];
                    C[j + 1] = C[j];
                    C[j] = temp;
                }
            }
        }
        System.out.print("\nSR NO.\tNAME\tAVERAGE");
        for (int i = 0; i < 3; i++) {
            System.out.print("\n" + (i + 1) + "\t" + C[i].name + "\t" + C[i].avg);
        }
        System.out.print("\nFrom the list above enter the label number of ur favourite player to know his details: ");
        int ch = sc.nextInt();
        try {
            System.out.println("\nNAME: " + C[ch-1].name + "\nINNING COUNT: " + C[ch-1].count + "\nNOTOUT: " + C[ch-1].notout
                    + "\nAVERAGE: " + C[ch-1].avg);
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("\n!!!INVALID INPUT!!!");
        }
    }
}