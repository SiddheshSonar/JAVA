import java.util.Scanner;
import java.lang.Math.*;

public class test {
  static double result, base;
  static int power, logBase, argument;

  public test() {
    result = 2;
    base = 2;
    power = 2;
    logBase = 2;
    argument = 2;
  }

  static double calculate(double base, int power) {
    result = Math.pow(base, power);
    test.display();
    return 0;
  }

  static double calculate(int logBase, int argument) {
    result = Math.log(argument) / Math.log(logBase);
    test.display();
    return 0;
  }

  static void display() {
    System.out.println("\nAnswer = " + result);
  }

  public static void main(String args[]) {
    test.calculate(2.0, 4);
    test.calculate(2, 4);
  }
}