import java.util.Scanner;

abstract class Course {
	String name, uid, year;
	String[] yr = { "FE", "SE", "TE" };

	Course() {
	}

	Course(String name, String uid, String year) {
		this.name = name;
		this.uid = uid;
		this.year = year;
	}

	abstract void studentDetails();
}

class Comp extends Course {
	Comp() {
	}

	Comp(String name, String uid, String year) {
		super(name, uid, year);
	}

	void studentDetails() {
		System.out.printf("Name: %s, UID: %s, Year: %s\n", name, uid, year);
	}

	void sort(Comp[] c) {
		for (int i = 0; i < yr.length; i++) {
			// yr[i]
			for (int j = 0; j < c.length; j++) {
				// c[j]
				for (int k = 0; k < c.length; k++) {
					if (c[k].year == yr[i]) {
						Comp temp = new Comp(c[j].name, c[j].uid, c[j].year);
						c[j] = c[k];
						c[k] = temp;
					}
				}
			}
		}
	}
}

class IT extends Course {
	IT(String name, String uid, String year) {
		super(name, uid, year);
	}

	void studentDetails() {
		System.out.printf("Name: %s, UID: %s, Year: %s\n", name, uid, year);
	}

	void sort(IT[] i) {

	}
}

class Student {

}

class Teest {
	public static void main(String args[]) {
		Scanner sC = new Scanner(System.in);
		Scanner tsC = new Scanner(System.in);
		// System.out.println("Enter the number of Comps students: ");
		// int nC = sC.nextInt();
		// // System.out.println("Enter the number of IT students: ");
		// // int nI = sC.nextInt();
		// Comp[] comp = new Comp[nC];
		// IT[] it = new IT[nI];
		
		//test code
		Comp[] comp = new Comp[6];
		comp[0] = new Comp("n1", "1", "TE");
		comp[1] = new Comp("n2", "2", "SE");
		comp[2] = new Comp("n3", "3", "FE");
		comp[3] = new Comp("n4", "4", "FE");
		comp[4] = new Comp("n5", "5", "SE");
		comp[5] = new Comp("n6", "6", "TE");
		//test code ends


		// it[0] = new IT("IT", "1", "1");
		// it[1] = new IT("IT", "2", "2");
		// it[2] = new IT("IT", "3", "3");


		// for (int i = 0; i < nC; i++) {
		// 	System.out.printf("Student #%d\nName, uid, year: ", i + 1);
		// 	String name = tsC.nextLine();
		// 	System.out.printf("UID: ");
		// 	String uid = tsC.nextLine();
		// 	System.out.printf("Year: ");
		// 	String year = tsC.nextLine();
		// 	comp[i] = new Comp(name, uid, year);
		// }
		
		Comp cc = new Comp();
		cc.sort(comp);
		for (int i = 0; i < comp.length; i++) {
			comp[i].studentDetails();
		}
		// for (int i = 0; i < nI; i++) {
		// it[i].studentDetails();
		// }
	}
}
