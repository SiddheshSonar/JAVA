import java.util.Scanner;

public class Date {
  static int year, month, date, hrs, min, sec;
  static String[] mon = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
      "October", "November", "December" };
  static String disp;

  public Date() {
    year = 2000;
    month = 1;
    date = 1;
    hrs = 0;
    min = 0;
    sec = 0;
  }

  static void setDate(int year, int month, int date) {
    disp = mon[month - 1] + " " + date + ", " + year + ", " + hrs + "0:" + min + "0:0" + sec;
  }

  static void setDate(int year, int month, int date, int hrs, int min) {
    disp = mon[month - 1] + " " + date + ", " + year + ", " + (hrs < 10 ? "0" + hrs : hrs) + ":"
        + (min < 10 ? "0" + min : min) + ":0" + sec;
  }

  static void setDate(int year, int month, int date, int hrs, int min, int sec) {
    disp = mon[month - 1] + " " + date + ", " + year + ", " + (hrs < 10 ? "0" + hrs : hrs) + ":"
        + (min < 10 ? "0" + min : min) + ":" + (min < 10 ? "0" + sec : sec);
  }

  static void displayDate() {
    System.out.println("\n" + disp + "\n");
  }

  public static void main(String args[]) {
    int a;
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.println(
          "Enter\n1-Year, Month and Date\n2-Year, Month, Date, Hours and Minutes\n3-Year, Month, Date, Hours, Minutes and Seconds\n4-Exit");
      a = sc.nextInt();
      switch (a) {
        case 1:
          System.out.println("Enter the year -");
          year = sc.nextInt();
          System.out.println("Enter the month -");
          month = sc.nextInt();
          System.out.println("Enter the date -");
          date = sc.nextInt();
          Date.setDate(year, month, date);
          Date.displayDate();
          break;
        case 2:
          System.out.println("Enter the year -");
          year = sc.nextInt();
          System.out.println("Enter the month -");
          month = sc.nextInt();
          System.out.println("Enter the date -");
          date = sc.nextInt();
          System.out.println("Enter the hours -");
          hrs = sc.nextInt();
          System.out.println("Enter the minutes -");
          min = sc.nextInt();
          Date.setDate(year, month, date, hrs, min);
          Date.displayDate();
          break;
        case 3:
          System.out.println("Enter the year -");
          year = sc.nextInt();
          System.out.println("Enter the month -");
          month = sc.nextInt();
          System.out.println("Enter the date -");
          date = sc.nextInt();
          System.out.println("Enter the hours -");
          hrs = sc.nextInt();
          System.out.println("Enter the minutes -");
          min = sc.nextInt();
          System.out.println("Enter the seconds -");
          sec = sc.nextInt();
          Date.setDate(year, month, date, hrs, min, sec);
          Date.displayDate();
          break;
        case 4:
          return;
        default:
          System.out.println("Invalid Operation!");
      }
    }
  }
}
