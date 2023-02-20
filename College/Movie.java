import java.util.Scanner;

class Info {
	String name, type, him, her;
	double bud;

	public Info(String name, String type, String him, String her, double bud) {
		this.name = name;
		this.type = type;
		this.him = him;
		this.her = her;
		this.bud = bud;
	}

	public void display() {
		System.out.println();
		System.out.println("Movie name - " + name);
		System.out.println("Budget - " + bud);
	}
}

public class Movie {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Scanner txt = new Scanner(System.in);
		System.out.printf("Enter the number of movies: ");
		int n = sc.nextInt();
		Info mov[] = new Info[n];
		String name, type, him, her, temp2;
		double bud, temp1;
		for (int i = 0; i < n; i++) {
			System.out.println("Movie " + (i + 1) + "\nName: ");
			name = txt.nextLine();
			System.out.println("Type: ");
			type = txt.nextLine();
			System.out.println("Hero: ");
			him = txt.nextLine();
			System.out.println("Heroine: ");
			her = txt.nextLine();
			System.out.println("Budget: ");
			bud = sc.nextInt();
			System.out.println();
			mov[i] = new Info(name, type, him, her, bud);
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (mov[i].bud > mov[j].bud) {
					temp1 = mov[i].bud;
					mov[i].bud = mov[j].bud;
					mov[j].bud = temp1;
					temp2 = mov[i].name;
					mov[i].name = mov[j].name;
					mov[j].name = temp2;
					temp2 = mov[i].type;
					mov[i].type = mov[j].type;
					mov[j].type = temp2;
					temp2 = mov[i].him;
					mov[i].him = mov[j].him;
					mov[j].him = temp2;
					temp2 = mov[i].her;
					mov[i].her = mov[j].her;
					mov[j].her = temp2;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			mov[i].display();
		}
	}
}
