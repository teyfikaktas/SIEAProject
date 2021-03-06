package com.example.crpito;

public class ReferanceArrays {
    public static final int[] ZigzagTransform = {
            0, 1, 5, 6, 14, 15, 27, 28, 2, 4, 7, 13, 16, 26, 29, 42, 3, 8, 12, 17, 25, 30, 41, 43, 9, 11, 18, 24, 31, 40, 44, 53, 10,
            19, 23, 32, 39, 45, 52, 54, 20, 22, 33, 38, 46, 51, 55, 60, 21, 34, 37, 47, 50, 56, 59, 61, 35, 36, 48, 49, 57, 58, 62, 63

    };
    public static final int[] RZigzagTransform = {

            0,1,8,16,9,2,3,10,17,24,32,25,18,11,4,5,12,19,26,33,40,48,41,34,27,20,13,6,7,29,21,28,35,42,49,56,57,50,43,36,29,22,15,23,30,37,44,51,58,59,52,45,38,31,39,46,53,60,61,54,47,55,62,63
    };
    public static final int[] Spriral = {
            0, 1, 2, 3, 4, 5, 6, 7, 27, 28, 29, 30, 31, 32, 33, 8, 26, 47, 48, 49, 50, 51, 34, 9, 25, 46, 59, 60, 61, 52, 35, 10, 24, 45, 58, 63, 62, 53, 36, 11, 23, 44, 57, 56, 55, 54, 37, 12, 22, 43, 42, 41, 40, 39, 38, 13, 21, 20, 19, 18, 17, 16, 15, 14

    };
    public static final int[] RSpriral = {
            0, 1, 2, 3, 4, 5, 6, 7, 15, 23, 31, 35, 47, 55, 63, 62, 61, 60, 59, 58, 57, 56, 48, 40, 32, 24, 16, 8, 9, 10, 11, 12, 13, 14, 22, 30, 38, 46, 54, 53, 52, 51, 50, 49, 41, 33, 25, 17, 18, 19, 20, 21, 29, 37, 45, 44, 43, 42, 34, 26, 27, 28, 35, 35
    };
    public static final int[] RDiagonal = {
    0,1,8,2,9,16,3,10,17,24,4,11,18,25,32,5,12,19,26,33,40,6,13,20,27,34,41,48,7,14,21,28,35,42,49,56,15,22,29,36,43,50,57,23,30,37,44,51,58,31,38,45,52,59,39,46,53,60,47,54,61,55,62,63

    };
    public static final int[] DRDiagonal = {
            0,1,3,6,10,15,21,28,2,4,7,11,16,22,29,36,5,8,12,17,23,30,37,43,9,13,18,24,31,38,44,49,14,19,25,32,39,45,50,54,20,26,33,40,46,51,55,58,27,34,41,47,52,56,59,61,35,42,48,53,57,60,62,63};

    public static final int[] DLDiagonal = {
            7,6,15,5,14,23,4,13,22,31,3,12,21,30,39,2,11,20,29,38,47,1,10,19,28,37,46,55,0,9,18,27,36,45,54,63,8,17,26,35,44,53,62,16,25,34,43,52,61,24,33,42,51,60,32,41,50,59,40,49,58,48,57,56};
public static final int[] LeftDiagC = {
28,21,15,10,6,3,1,0,36,29,22,16,11,7,4,2,43,37,30,23,17,12,8,5,49,44,38,31,24,18,13,9,54,50,45,39,32,25,19,14,58,55,51,46,40,33,26,20,61,59,56,52,47,41,34,27,63,62,60,57,53,48,42,35};
}