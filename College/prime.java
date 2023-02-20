class isprime 
{
    public void printprime() 
    {
        int flag = 1;
        for (int i = 2; i <= 100; i++) 
        {
            flag = 1;
            if (i == 2) 
            {
                System.out.println(i + " is a prime number");
                continue;
            }
            for (int j = 2; j < i; j++) 
            {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) 
            {
                System.out.println(i + " is a prime number");
            }
        }
    }
}

class prime 
{
    public static void main(String args[]) 
    {
        isprime p1 = new isprime();
        p1.printprime();
    }
}