import java.util.*;

public class time {
    static void conversion1(int sec) {
        int hrs, min, temp;
        hrs = sec / 3600;
        sec = sec % 3600;
        min = sec / 60;
        sec = sec % 60;
        System.out.println("Hours : " + hrs + "\nMinutes : " + min + "\nSeconds : " + sec);
    }

    static void conversion2(int hrs, int min, int sec)
    {
        sec = sec + (min*60) + (hrs*3600);
        System.out.println("Seconds : "+sec);
    }
    public static void main(String args[]) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 -  Seconds to Hours 2 - Hours to Seconds");
        a = sc.nextInt();
        if (a == 1) {
            int sec;
            System.out.println("Enter the number of seconds -");
            sec = sc.nextInt();
            time.conversion1(sec);
        }
        else if(a == 2)
        {
        int sec, min, hrs;
        System.out.println("Enter the number of hours -");
        hrs = sc.nextInt();
        System.out.println("Enter the number of minutes -");
        min = sc.nextInt();
        System.out.println("Enter the number of seconds -");
        sec = sc.nextInt();   
        time.conversion2(hrs,min,sec);
        }
        else {
            System.out.println("Invalid operation!");
        }
    }
}