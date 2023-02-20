import java.util.*;

class Person {
    int age, gender;
    String name;

    Person(int age, int gender, String name) {
        this.age = age;
        this.gender = gender;
        this.name = name;
    }
}

class Doctor extends Person {
    String spec;
    double fees, income;

    Doctor(int age, int gender, String name, String spec, double fees, double income) {
        super(age, gender, name);
        this.spec = spec;
        this.fees = fees;
        this.income = income;
    }
}

class Patient extends Person {
    String doc;
    int days;

    Patient(int age, int gender, String name, String doc, int days) {
        super(age, gender, name);
        this.doc = doc;
        this.days = days;
    }
}

class Billing {
    double amtDue;

    double billGen(int days, Doctor doc) {
        amtDue = days * 2000 + doc.fees * days;
        doc.income += amtDue;
        return amtDue;
    }
}

public class Hospital {
    public static void main(String[] args) {
        Doctor[] d = new Doctor[2];
        d[0] = new Doctor(45, 0, "Joey", "Neurology", 50000, 0);
        d[1] = new Doctor(50, 1, "Phoebe", "Physiotherapy", 40000, 0);
        Patient[] p = new Patient[3];
        p[0] = new Patient(28, 0, "Chandler", "Phoebe", 10);
        p[1] = new Patient(26, 1, "Monica", "Joey", 12);
        p[2] = new Patient(30, 0, "Ross", "Phoebe", 14);
        Billing b = new Billing();
        for (int i = 0; i < p.length; i++) {
            System.out.printf("\nPatient %s is seen by %s", p[i].name, p[i].doc);
            for (int j = 0; j < d.length; j++) {
                if (p[i].doc == d[j].name) {
                    System.out.printf("Total bill due: %.2f\n", b.billGen(p[i].days, d[j]));
                }
            }
        }
        for (int i = 0; i < d.length; i++) {
            System.out.printf("\n%d. Doctor: %s\n\tAge: %d, Gender: %s, Specialization: %s\n\tTotal Income: %.2f\n",
                    i + 1, d[i].name, d[i].age, (d[i].gender == 0 ? "Male" : "Female"), d[i].spec, d[i].income);
        }
    }
}