package structural.adapter;

public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public boolean fits(RoundPeg roundPeg) {
        return this.radius >= roundPeg.getRadius();
    }

    public double getRadius() {
        return radius;
    }
}
