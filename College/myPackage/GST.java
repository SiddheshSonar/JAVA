package myPackage;

public class GST {
    int type;
    double amount, rate;

    public double calculateGST(int type, double amount) {
        if (type == 1) {
            return 0.05 * amount;
        } else if (type == 2) {
            return 0.1 * amount;
        } else if (type == 3) {
            return 0.12 * amount;
        } else if (type == 4) {
            return 0.15 * amount;
        } else {
            return 0;
        }
    }
}
