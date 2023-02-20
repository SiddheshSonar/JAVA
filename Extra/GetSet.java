import java.util.*;

class Cylinder {
    private int radius;
    private int height;
    
    void setradius(int radius) {
        this.radius = radius;
    }

    int getradius() {
        return radius;
    }

    void setheight(int height) {
        this.height = height;
    }

    int getheight() {
        return height;
    }
}

public class GetSet {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder();
        cy.setradius(10);
        System.out.println(cy.getradius());
        cy.setheight(12);
        System.out.println(cy.getheight());
    }
}
