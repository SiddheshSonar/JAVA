class trial {
    int a = 1;
    static int b = 2;
}
public class add3 
{
    public static void main(String args[])
    {
        int num1=1, num2=2, num3=3;
        System.out.println("The sum of the three numbers is - ");
        System.out.println(num1+num2+num3);
        trial t = new trial();
        System.out.println(t.a);
        t.b++;
        System.out.println(t.b); 
    }
}
