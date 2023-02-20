import java.util.Scanner;
import java.text.DecimalFormat;

class Book {
    String bookname;
    double ratavg;

    public Book(String nameb, double avgr) {
        bookname = nameb;
        ratavg = avgr;
    }

    public void display() {
        System.out.println("Name of the book - " + bookname);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Average Rating - " + df.format(ratavg));
    }
}

public class Rating {
    public static void main(String[] args) {
        int num, rat;
        double avg, sum = 0;
        String bname;
        Scanner sc = new Scanner(System.in);
        Scanner txt = new Scanner(System.in);
        System.out.println("Enter the number of books :");
        num = sc.nextInt();
        Book b[] = new Book[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Enter the name of the book :");
            bname = txt.nextLine();
            System.out.println("Enter the no of ratings of the book :");
            rat = sc.nextInt();
            for (int j = 0; j < rat; j++) {
                System.out.println("Enter Rating " + (j + 1) + " -");
                sum = sum + sc.nextDouble();
            }
            avg = sum / num;
            b[i] = new Book(bname, avg);
        }
        int max = 0;
        for (int i = 0; i < num; i++) {
            b[i].display();
            if (b[max].ratavg < b[i].ratavg) {
                max = i;
            }
        }
        System.out.println();
        System.out.println("The most popular book - " + b[max].bookname);
    }
}