package structural.adapter;

public class Client {
    public static void main(String[] args) {
        // Round fits round, no surprise.
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        if (roundHole.fits(roundPeg)) {
            System.out.println("Round pin with radius 5 fits into round hole with radius 5");
        }

        SquarePeg smallSquarePeg = new SquarePeg(2);
        SquarePeg largeSquarePeg = new SquarePeg(20);
        // roundHole.fits(smallSquarePeg); // Won't compile.

        // Adapter solves the problem.
        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);
        if (roundHole.fits(smallSquarePegAdapter)) {
            System.out.println("Square peg with width 2 fits into round hole with radius 5");
        }
        if (!roundHole.fits(largeSquarePegAdapter)) {
            System.out.println("Square peg with width 20 does not fit into round hole with radius 5");
        }
    }
}
