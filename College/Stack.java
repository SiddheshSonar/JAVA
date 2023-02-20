import java.util.*;

class stackoverflow extends Exception {
    stackoverflow() {
        System.out.println("\nTHE STACK IS FULL");
    }
}

class stackempty extends Exception {
    stackempty() {
        System.out.println("\nTHE STACK IS EMPTY");
    }
}

class Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("\nEnter the length of stack memory:");
        int n = sc.nextInt();
        int A[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element " + (i + 1));
            A[i] = sc.nextInt();
            count++;
        }
        System.out.print("\nEnter what do you want to do?\nPRESS 1: PUSH\nPRESS 2: POP\nGIVE YOUR INPUT: ");
        int ch = sc.nextInt();
        while (ch == 1 || ch == 2) {
            if (ch == 1) {
                try {
                    if (count == n) {
                        throw new stackoverflow();
                    } else {
                        System.out.println("\nEnter the element: ");
                        A[count] = sc.nextInt();
                        count++;
                    }
                } catch (stackoverflow so) {
                }
            } else if (ch == 2) {
                if (count == 0) {
                    try {
                        throw new stackempty();
                    } catch (stackempty se) {
                    }
                } else {
                    System.out.println("\nThe value popped is: " + A[count - 1]);
                    A[count - 1] = 0;
                    count--;
                }
            }
            System.out.print("\nEnter what do you want to do?\nPRESS 1: PUSH\nPRESS 2: POP\nPRESS 3: EXIT\nGIVE YOUR INPUT: ");
            ch = sc.nextInt();
        }
    }
}