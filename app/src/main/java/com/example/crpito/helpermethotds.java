package com.example.crpito;

public class helpermethotds {
    static int getMod(String str, int n, int k) {

        // pwrTwo[i] will store ((2^i) % k)
        int pwrTwo[] = new int[n];
        pwrTwo[0] = 1 % k;
        for (int i = 1; i < n; i++) {
            pwrTwo[i] = pwrTwo[i - 1] * (2 % k);
            pwrTwo[i] %= k;
        }

        // To store the result
        int res = 0;
        int i = 0, j = n - 1;
        while (i < n) {

            // If current bit is 1
            if (str.charAt(j) == '1') {

                // Add the current power of 2
                res += (pwrTwo[i]);
                res %= k;
            }
            i++;
            j--;
        }

        return res;
    }

    static StringBuilder LogCalc(int size, double xn, double a) {
        double value = cmaps.logisticMap(xn, a);
StringBuilder ValueStr = new StringBuilder();
        for (int i = 0; i < size; i++) {

            if (value > 0.5) {

                ValueStr.append(0);
            } else {
                ValueStr.append(1);
            }
            value = cmaps.logisticMap(value,a );
        }
        return ValueStr;
    }

    static StringBuilder CircleCalc(int size, double xn, double a, double b) {
        double value = cmaps.CircleMap(xn, a, b);
        StringBuilder sv = new StringBuilder();

        for (int i = 0; i < size; i++) {
            if (value > 0.5) {
                sv.append(1);
            } else {
                sv.append(0);
            }
            value = cmaps.CircleMap(value, a, b);
        }
        return sv;
    }

    static StringBuilder SineCalc(int size , double xn, double a) {
        double value = cmaps.SineMap(xn, a);
        StringBuilder sv = new StringBuilder();

        for (int i = 0; i <size; i++) {
            if (value > 0.5) {
                sv.append(1);
            } else {
                sv.append(0);
            }
            value = cmaps.SineMap(value, a);
        }
        return sv;
    }

    static StringBuilder TentMap(int mao, double xn, double a) {
        double value = cmaps.TentMap(xn, a);
        StringBuilder sv = new StringBuilder();
        for (int i = 0; i < mao; i++) {
            if (value > 0.5) {
                sv.append("0");
            } else {
                sv.append("1");
            }
            value = cmaps.TentMap(value, a);
        }
    return sv;

    }


    static String FillZeros(int a) {
        String A = Integer.toBinaryString(a);
        StringBuilder sb = new StringBuilder(A);
        while (sb.length() < 8) {
            sb.insert(0, "0");

        }
        return sb.toString();
    }

    static StringBuilder XOREncoder(StringBuilder sb, StringBuilder sb2) {
        StringBuilder korora = new StringBuilder();

        int n =0;

        while (n <=sb.length()-1) {
            if (sb.charAt(n) == '0' && sb2.charAt(n) == '0') {

                korora.append(0);
            }  if (sb.charAt(n) == '0' && sb2.charAt(n) == '1') {

                korora.append(1);

            }  if (sb.charAt(n) == '1' && sb2.charAt(n) == '0') {
                korora.append(1);

            }  if (sb.charAt(n) == '1' && sb2.charAt(n) == '1') {
                korora.append(0);

            }
n++;
        }
        return korora;
    }

    static StringBuilder XNOREncoder(StringBuilder sb, StringBuilder sb2) {
        StringBuilder korora = new StringBuilder();

        int n = 0;

        while (n < sb.length()) {
            if (sb.charAt(n) == '0' && sb2.charAt(n) == '0') {

                korora.append(1);
            } else if (sb.charAt(n) == '0' && sb2.charAt(n) == '1') {
                korora.append(0);
            } else if (sb.charAt(n) == '1' && sb2.charAt(n) == '0') {
                korora.append(0);
            } else if (sb.charAt(n) == '1' && sb2.charAt(n) == '1') {
                korora.append(1);
            }
            n++;
        }
        return korora;
    }
}

