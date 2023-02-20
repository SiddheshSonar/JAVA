

class info
{
    int id, salary;
    String name;
    public void disp()
    {
        System.out.println("My name is - "+name);
        System.out.println("My id is - "+id);
    }
    public int getsal()
    {
        return salary;
    }
}
public class employe {
    public static void main(String[] args) {
        info sid = new info();
        info dis = new info();
        sid.name = "Siddhesh";
        sid.id = 10;
        sid.salary = 10000;
        dis.name = "Sid";
        dis.id = 7;
        dis.salary = 5000;
        sid.disp();
        int salary = sid.getsal();
        System.out.println("My salary is "+salary);
        dis.disp();
        dis.getsal();
    }
}
