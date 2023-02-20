import java.util.*;
import java.lang.Math;
import java.text.DecimalFormat;

interface Volume {
    public double getVolume(double radius, double height);
}

interface SurfaceArea {
    public double getSurfaceArea(double radius, double height);
}

class Cylinder implements Volume, SurfaceArea {
    public double getVolume(double radius, double height) {
        double volume = Math.PI * radius * radius * height;
        return volume;
    }

    public double getSurfaceArea(double radius, double height) {
        double area = 2 * Math.PI * radius * (radius + height);
        return area;
    }
}

public class Dimension {
    public static void main(String args[]) {
        int n;
        double rad, ht, ar, vol;
        DecimalFormat df = new DecimalFormat("#.00");
        Cylinder cy = new Cylinder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of cylinder - ");
        rad = sc.nextDouble();
        System.out.println("Enter the height of cylinder - ");
        ht = sc.nextDouble();
        while (true) {
            System.out.println("Enter\n1-Volume\n2-Surface Area\n3-Exit");
            n = sc.nextInt();
            if (n == 1) {
                vol = cy.getVolume(rad, ht);
                System.out.println("\nVolume of the Cylinder = " + df.format(vol));
                System.out.println();
            } else if (n == 2) {
                ar = cy.getSurfaceArea(rad, ht);
                System.out.println("\nSurface Area of the Cylinder = " + df.format(ar));
                System.out.println();
            } else if (n == 3) {
                return;
            } else {
                System.out.println("Invalid Operation!");
            }
        }
    }
}
