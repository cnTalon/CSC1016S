// Assignment 6
// Exercise 3
// 17 September 2022

import java.lang.Math;

public class Vector {
    private double x;
    private double y;


    public Vector(double nextDouble, double nextDouble2) {
        this.x = nextDouble;
        this.y = nextDouble2;
    }

    public Vector(int nextInt, int nextInt2) {
        this.x = nextInt;
        this.y = nextInt2;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getMagnitude() {
        return Math.sqrt((x*x) + (y*y));
    }

    public Vector add(Vector vTwo) {
        double X = x + vTwo.getX();
        double Y = y + vTwo.getY();
        return new Vector(X, Y);
    }

    public Vector multiply(double multiplier) {
        this.x = x*multiplier;
        this.y = y*multiplier;
        return new Vector(x,y);
    }

    public double dotProduct(Vector vTwo) {
        double X = x * vTwo.getX();
        double Y = y * vTwo.getY();
        double DotProd = X + Y;
        return DotProd;
    }

    public String toString() {
        String formatX = String.format("%.2f", x);
        String formatY = String.format("%.2f", y);
        String vector = "v = (" + formatX + ", " + formatY + ")";
        return vector;
    }
}
