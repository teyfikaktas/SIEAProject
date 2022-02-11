package com.example.crpito;


import static com.example.crpito.MainActivity.SB;

import android.graphics.Bitmap;
import android.graphics.Color;

import java.util.ArrayList;

public class binerilization {
    public static int WIDTH = 0;
    public static int HEIGHT = 0;

    public static int BinImageLength = 0;

    public static void GetWH() {

    }

    public static StringBuilder ConvertBinary(ArrayList<Integer> arrayList) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append(helpermethotds.FillZeros(arrayList.get(i)));
        }

return sb;
    }

    public static int GetPixelValue(Bitmap bitmap) {
        return bitmap.getHeight() * bitmap.getWidth();
    }

    public static ArrayList<Integer> convertBinaries(Bitmap bit) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < bit.getWidth(); i++) {
            for (int j = 0; j < bit.getHeight(); j++) {
                int pixel = bit.getPixel(i, j);

                int alphablue = Color.alpha(pixel);
                int redValue = Color.red(pixel);
                int greenValue = Color.green(pixel);
                int blueValue = Color.blue(pixel);

                list.add(alphablue);
                list.add(redValue);
                list.add(greenValue);
                list.add(blueValue);
            }


      /*      public static String FillZeros (String number,int goal){
                StringBuilder numberBuilder = new StringBuilder(number);
                while (numberBuilder.length() != goal) {
                    numberBuilder.insert(0, "0");
                }
                number = numberBuilder.toString();
                return number;
            }
        } */
        }

        return list;
    }

}
