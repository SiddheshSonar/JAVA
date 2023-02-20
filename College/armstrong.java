import java.util.*;
import java.lang.Math;

class arm 
{
    static void printarm() 
    {
        int p, q, r, s, digit, sum, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number of the range - ");
        p = sc.nextInt();
        System.out.println("Enter the second number of the range - ");
        q = sc.nextInt();
        for (int i = p; i <= q; i++) {
            digit = 0;
            sum = 0;
            r = i;
            while (i > 0) {
                i = i / 10;
                digit++;
            }
            i = r;
            while (r > 0) {
                s = r % 10;
                r = r / 10;
                sum = sum + ((int) Math.pow(s, digit));
            }
            if (sum == i) {
                count++;
                System.out.println(i + " is an Armstrong number in the given range");
            }
        }
        System.out.println("Total no of Armstrong numbers in the given range = " + count);
    }
}

class armstrong 
{
    public static void main(String args[]) 
    {
        arm a = new arm();
        a.printarm();
    }
}