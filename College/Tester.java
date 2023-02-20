import java.util.*;
class Employee{
         public String name;
         public int age,id;
         Employee(String ename,int id,int age){
                 name = ename;
                 this.id = id;
                 this.age = age;
         }
}
class SalariedEmployee extends Employee{
         private double empSalary;
         static double max=0;
         SalariedEmployee(String ename,int id,int age,double Salary){
                super(ename,id,age);
                this.setSalary(Salary);
         }
         void setSalary(double Salary){
                Scanner sc = new Scanner(System.in);
                System.out.print("\nPress 1: Permanent Employee\nPress 2: On Contract: ");
                int c = sc.nextInt();
                if(c==1) 
                    empSalary = Salary + 2000;
                else
                    empSalary = Salary;
         }                
         void Highest(){
                 if(max<empSalary)
                     max = empSalary;
         }
         void display(){
                if(max==empSalary)
                    System.out.println("\nEmployee Name: "+name+"\nEmployee ID: "+id+"\nEmployee Age: "+age);
         }
}
class Tester{
         public static void main(String args[]){
              Scanner sc = new Scanner(System.in);
              Scanner tsc = new Scanner(System.in);  
              System.out.print("\nEnter the number of employee's details you want to give: ");
              int n = sc.nextInt();
              SalariedEmployee S[] = new SalariedEmployee[n];
              for(int i=0;i<n;i++){
                   System.out.println("\nEnter Employee Details: ");
                   System.out.print("Enter Employee Name: ");    
                   String str = tsc.nextLine();
                   System.out.print("Enter Employee Id: ");
                   int num = sc.nextInt();
                   System.out.print("Enter Employee Age: ");
                   int age = sc.nextInt();
                   System.out.print("Enter Employee Salary: ");
                   double salary = sc.nextDouble();
                   S[i] = new SalariedEmployee(str,num,age,salary);
              }
              for(int i=0;i<n;i++){
                   S[i].Highest();
              }
              for(int i=0;i<n;i++){
                   S[i].display();
              }
         }
}