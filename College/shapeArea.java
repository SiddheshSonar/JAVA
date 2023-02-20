import java.util.*;
import java.lang.Math;

abstract class Shape {
    double area;

    abstract double RectangleArea(double length, double breadth);

    abstract double SquareArea(double side);

    abstract double CircleArea(double radius);
}

class Area extends Shape {

    double RectangleArea(double length, double breadth) {
        area = length * breadth;
        return area;
    }

    double SquareArea(double side) {
        area = side * side;
        return area;
    }

    double CircleArea(double radius) {
        area = Math.PI * radius * radius;
        return area;
    }
}

public class shapeArea {
    public static void main(String[] args) {
        int n;
        double l, b, s, r, ar;
        Scanner sc = new Scanner(System.in);
        Area a = new Area();
        while (true) {
            System.out.println("Enter \n1 - Rectangle Area\n2 - Square Area\n3 - Circle Area\n4 - Exit");
            n = sc.nextInt();
            if (n == 1) {
                System.out.println("Enter the length of the rectangle - ");
                l = sc.nextDouble();
                System.out.println("Enter the breadth of the rectangle - ");
                b = sc.nextDouble();
                ar = a.RectangleArea(l, b);
                System.out.println("Area = " + ar);
            } else if (n == 2) {
                System.out.println("Enter the side of the square - ");
                s = sc.nextDouble();
                ar = a.SquareArea(s);
                System.out.println("Area = " + ar);
            } else if (n == 3) {
                System.out.println("Enter the radius of the circle - ");
                r = sc.nextDouble();
                ar = a.CircleArea(r);
                System.out.println("Area = " + ar);
            } else if (n == 4) {
                return;
            } else {
                System.out.println("Invalid Operation!");
            }
        }
    }
}
