import java.util.Scanner;
import java.lang.Math.*;
import java.text.DecimalFormat;

public class GradeStatistics {
    static double avg, med, std;
    static int max, min;

    static void calculate(int n, int arr[]) {
        // sorting
        int temp, sum = 0;
        double temp1 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // for avg
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        avg = (double) sum / n;
        // since array is sorted
        min = arr[0];
        max = arr[n - 1];
        // median
        if (n % 2 == 0) {
            med = (arr[(n / 2) - 1] + arr[n / 2]) / 2;
        } else {
            med = arr[n / 2];
        }
        // std deviation
        for (int i = 0; i < n; i++) {
            temp1 = temp1 + Math.pow((arr[i] - avg), 2);
        }
        std = Math.sqrt(temp1 / n);
    }

    static void display() {
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("The Average is " + df.format(avg));
        System.out.println("The Minimum is " + min);
        System.out.println("The Maximum is " + max);
        System.out.println("The Median is " + med);
        System.out.println("The std. deviation is " + df.format(std));
    }

    public static void main(String[] args) {
        int m;
        int[] stud = new int[20];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students : ");
        m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + " : ");
            stud[i] = sc.nextInt();
        }
        GradeStatistics.calculate(m, stud);
        GradeStatistics.display();
    }
}