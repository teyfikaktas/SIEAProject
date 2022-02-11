package com.example.crpito;

public class logisticmap {
    static double logisticMap(double a, double x) {

        double retVal = a * x * (1 - x);

        return retVal;
    }

    public static String logalgorithm() {
        double x = Math.random();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            Integer number = 0;
            x = logisticMap(3.9, x);
            if (x < .5) {
                stringBuilder.append("0");
            } else
                stringBuilder.append("1");
        }


        return stringBuilder.toString();
    }
}