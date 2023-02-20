import java.util.*;
import java.lang.Math;

class mers 
{
    static void mersprime() 
    {
        int m, flag;
        for (int p = 2; p <= 20; p++) 
        {
            flag = 1;
            m = ((int) Math.pow(2, p)) - 1;
            for (int i = 2; i < m; i++) 
            {
                if (m % i == 0) 
                {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) 
            {
                System.out.print("Mersenne prime is = " + m + "    \t\t|\t");
                System.out.println("\tValue of p = " + p);
            }
        }
    }

    public static void main(String args[]) 
    {
        mers.mersprime();
    }
}