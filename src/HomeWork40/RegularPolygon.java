package HomeWork40;

class RegularPolygon extends Shape {
    private int numSides;
    private double sideLength;

    public RegularPolygon(int numSides, double sideLength) {
        this.numSides = numSides;
        this.sideLength = sideLength;
    }

    @Override
    public double getPerimeter() {
        return numSides * sideLength;
    }
}