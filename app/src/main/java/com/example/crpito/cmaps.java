package com.example.crpito;

public class cmaps {
    static double logisticMap(double x, double a) {

        return a * x * (1 - x);
    }

    public static double TentMap(double xn, double a) {

        if (xn < 0.5) {
            return a * xn;
        } else {
            return a * (1 - xn);
        }

    }

    public static double SineMap(double xn, double a) {
        return a * Math.sin(Math.PI * xn);
    }

    public static double CircleMap(double xn, double a, double b) {
        double first = -((b / (2 * Math.PI)) * Math.asin(360 * xn));
        return xn + a + ((first % 1));

    }
}
