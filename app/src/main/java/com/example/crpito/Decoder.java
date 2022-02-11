package com.example.crpito;

import android.graphics.Bitmap;
import android.graphics.Color;

import java.sql.Ref;
import java.util.ArrayList;
import java.util.Collection;

public class Decoder {
    public static ArrayList<Integer>    ArraySplit(ArrayList<Integer> arrayList){
        int f = 0;
        int size = arrayList.size();
        ArrayList<Integer> list= new ArrayList<>();
        int n =0;

        while(size>=64) {
            for (int i = 0; i < 64; i++) {
                   list.add(arrayList.get(ReferanceArrays.ZigzagTransform[i]+n));
                    f++;
            }
             n=n+64;
            size-=64;
        }
        if(size>0){
            for (int i = list.size()-1; i <arrayList.size() ; i++) {

                list.add(arrayList.get(i));
            }
        }
        return list;
    }
    public static ArrayList<Integer> ARrraySplit(ArrayList<Integer> arrayList){
        int f = 0;
        int size = arrayList.size();
        ArrayList<Integer> list= new ArrayList<>();
        int n =0;

        while(size>=64) {
            for (int i = 0; i < 64; i++) {
                list.add(arrayList.get(ReferanceArrays.RZigzagTransform[i]+n));
                f++;
            }
            n=n+64;
            size-=64;
        }
        if(size>0){
            for (int i = list.size()-1; i <arrayList.size() ; i++) {

                list.add(arrayList.get(i));
            }
        }
        return list;
    }

    public static ArrayList<Integer> ZArraySplit(ArrayList<Integer> arrayList){
        int f = 0;
        int size = arrayList.size();
        ArrayList<Integer> list= new ArrayList<>();
        int n =0;

        while(size>=64) {
            for (int i = 0; i < 64; i++) {
                list.add(arrayList.get(ReferanceArrays.Spriral[i]+n));
                f++;
            }
            n=n+64;
            size-=64;
        }
        if(size>0){
            for (int i = list.size()-1; i <arrayList.size() ; i++) {

                list.add(arrayList.get(i));
            }
        }
        return list;
    }
    public static ArrayList<Integer> ZDiagonel(ArrayList<Integer> arrayList){
        int f = 0;
        int size = arrayList.size();
        ArrayList<Integer> list= new ArrayList<>();
        int n =0;

        while(size>=64) {
            for (int i = 0; i < 64; i++) {
                list.add(arrayList.get(ReferanceArrays.RDiagonal[i]+n));
                f++;
            }
            n=n+64;
            size-=64;
        }
        if(size>0){
            for (int i = list.size()-1; i <arrayList.size() ; i++) {

                list.add(arrayList.get(i));
            }
        }
        return list;
    }
    public static ArrayList<Integer> RDiagonel(ArrayList<Integer> arrayList){
        int f = 0;
        int size = arrayList.size();
        ArrayList<Integer> list= new ArrayList<>();
        int n =0;

        while(size>=64) {
            for (int i = 0; i < 64; i++) {
                list.add(arrayList.get(ReferanceArrays.DRDiagonal[i]+n));
                f++;
            }
            n=n+64;
            size-=64;
        }
        if(size>0){
            for (int i = list.size()-1; i <arrayList.size() ; i++) {

                list.add(arrayList.get(i));
            }
        }
        return list;
    }
    public static ArrayList<Integer> LDiagonel(ArrayList<Integer> arrayList){
        int f = 0;
        int size = arrayList.size();
        ArrayList<Integer> list= new ArrayList<>();
        int n =0;

        while(size>=64) {
            for (int i = 0; i < 64; i++) {
                list.add(arrayList.get(ReferanceArrays.DLDiagonal[i]+n));
                f++;
            }
            n=n+64;
            size-=64;
        }
        if(size>0){
            for (int i = list.size()-1; i <arrayList.size() ; i++) {

                list.add(arrayList.get(i));
            }
        }
        return list;
    }
    public static ArrayList<Integer> ZLDiagonel(ArrayList<Integer> arrayList){
        int f = 0;
        int size = arrayList.size();
        ArrayList<Integer> list= new ArrayList<>();
        int n =0;

        while(size>=64) {
            for (int i = 0; i < 64; i++) {
                list.add(arrayList.get(ReferanceArrays.LeftDiagC[i]+n));
                f++;
            }
            n=n+64;
            size-=64;
        }
        if(size>0){
            for (int i = list.size()-1; i <arrayList.size() ; i++) {

                list.add(arrayList.get(i));
            }
        }
        return list;
    }
    public static ArrayList<Integer> DArraySplit(ArrayList<Integer> arrayList){
        int f = 0;
        int size = arrayList.size();
        ArrayList<Integer> list= new ArrayList<>();
        int n =0;

        while(size>=64) {
            for (int i = 0; i < 64; i++) {
                list.add(arrayList.get(ReferanceArrays.RSpriral[i]+n));
                f++;
            }
            n=n+64;
            size-=64;
        }
        if(size>0){
            for (int i = list.size()-1; i <arrayList.size() ; i++) {

                list.add(arrayList.get(i));
            }
        }
        return list;
    }

    /* DONE */


    public static ArrayList<Integer> Try(StringBuilder s) {
        ArrayList<Integer> newDizi = new ArrayList<>();

        for (int i = 0; i < s.length(); i = i + 8) {
            String value = s.substring(i, i + 8);
            int decimal = Integer.parseInt(value, 2);
            newDizi.add(decimal);
        }


        return newDizi;
    }

    public static Bitmap ImageCreateBitmap(ArrayList<Integer> arrayList, Bitmap bit) {
        int n = 0;
        for (int i = 0; i < bit.getWidth(); i++) {
            for (int j = 0; j < bit.getHeight(); j++) {
                if (n < arrayList.size() -4) {
                    int Aplha = arrayList.get(n);
                    int redValue = arrayList.get(n + 1);
                    int greenValue = arrayList.get(n + 2);
                    int blueValue = arrayList.get(n + 3);
                    bit.setPixel(i, j, Color.argb(Aplha, redValue, greenValue, blueValue));
                    n = n + 4;

                }
            }


        }
        return bit;
    }
}
