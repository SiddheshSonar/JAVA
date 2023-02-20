package myPack;

public class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name - " + name);
        System.out.println("Age - " + age);
    }
}

class Student extends Person {
    int rollNo;
    String branch;

    Student(String name, int age, int rollNo, String branch) {
        super(name, age);
        this.rollNo = rollNo;
        this.branch = branch;
    }

    public void display() {
        System.out.println("Student");
        super.display();
        System.out.println("Roll No - " + rollNo);
        System.out.println("Branch - " + branch);
    }
}

class Employee extends Person {
    int ecNo;
    String doj;

    Employee(String name, int age, int ecNo, String doj) {
        super(name, age);
        this.ecNo = ecNo;
        this.doj = doj;
    }

    public void display() {
        System.out.println("Employee");
        super.display();
        System.out.println("EC no - " + ecNo);
        System.out.println("Date of joining - " + doj);
    }
}

class Staff extends Employee {
    int dds;

    Staff(String name, int age, int ecNo, String doj, int dds) {
        super(name, age, ecNo, doj);
        this.dds = dds;
    }

    public void display() {
        super.display();
        System.out.println("Type - Staff");
        if (dds == 1) {
            System.out.println("Designation Data - Technical Staff");
        } else if (dds == 2) {
            System.out.println("Designation Data - Clerical Staff");
        } else {
            System.out.println("Wrong Input!");
        }
    }
}

class Faculty extends Employee {
    int ddf;

    Faculty(String name, int age, int ecNo, String doj, int ddf) {
        super(name, age, ecNo, doj);
        this.ddf = ddf;
    }

    public void display() {
        super.display();
        System.out.println("Type - Faculty");
        if (ddf == 1) {
            System.out.println("Designation Data - Assistant Professor");
        } else if (ddf == 2) {
            System.out.println("Designation Data - Associate Professor");
        } else if (ddf == 3) {
            System.out.println("Designation Data - Professor");
        } else {
            System.out.println("Wrong Input!");
        }
    }
}