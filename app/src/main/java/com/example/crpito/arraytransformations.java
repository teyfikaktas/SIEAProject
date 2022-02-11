package com.example.crpito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class arraytransformations {
    public static ArrayList<Integer> SplitArray(ArrayList<Integer> arrayList){
        int size = arrayList.size();
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        int f = 0;
        while(size>=64) {
            int[][] matrix = new int[8][8];

            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    matrix[i][j] = arrayList.get(f);
                    f++;
                }

            }
        integerArrayList.addAll(printZMatrix(matrix));


        size-=64;
        }
        if(size>0){
            for (int i = integerArrayList.size()-1; i <arrayList.size() ; i++) {
                integerArrayList.add(arrayList.get(i));
            }
        }
       return integerArrayList;
    }

    public static int[] convert(int[][] input) {
        return Stream.of(input).flatMapToInt(x -> Arrays.stream(x)).toArray();
    }
    static public ArrayList<Integer> printZMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return null;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int[] result = new int[n * m];
        int t = 0;

        for (int i = 0; i < n + m - 1; i++) {
            if (i % 2 == 1) {
                // down left
                int x = i < n ? 0 : i - n + 1;
                int y = i < n ? i : n - 1;
                while (x < m && y >= 0) {
                    result[t++] = matrix[x++][y--];
                }
            } else {
                // up right
                int x = i < m ? i : m - 1;
                int y = i < m ? 0 : i - m + 1;
                while (x >= 0 && y < n) {
                    result[t++] = matrix[x--][y++];
                }
            }


        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < result.length ; i++) {
            arrayList.add(result[i]);
        }
        return arrayList;
    }
  static  public ArrayList<Integer> printZMatrix(ArrayList<Integer> arr) {
      int matrix[][] = new int[(int)(Math.sqrt(arr.size()))][(int)(Math.sqrt(arr.size()))];
      int f = 0;
      for (int i = 0; i <(int)(Math.sqrt(arr.size())) ; i++) {
          for (int j = 0; j <(int)(Math.sqrt(arr.size())) ; j++) {
              matrix[i][j]=arr.get(f);
              f++;
          }
      }
        if (matrix == null || matrix.length == 0) {
            return null;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int[] result = new int[n * m];
        int t = 0;

        for (int i = 0; i < n + m - 1; i++) {
            if (i % 2 == 1) {
                // down left
                int x = i < n ? 0 : i - n + 1;
                int y = i < n ? i : n - 1;
                while (x < m && y >= 0) {
                    result[t++] = matrix[x++][y--];
                }
            } else {
                // up right
                int x = i < m ? i : m - 1;
                int y = i < m ? 0 : i - m + 1;
                while (x >= 0 && y < n) {
                    result[t++] = matrix[x--][y++];
                }
            }


        }
        ArrayList<Integer> arrayList = new ArrayList<>();
      for (int i = 0; i < result.length ; i++) {
          arrayList.add(result[i]);
      }

        return arrayList;
    }    /*DONE*/
    static  public ArrayList<Integer> RprintZMatrix(ArrayList<Integer> arr) {
        int matrix[][] = new int[(int)(Math.sqrt(arr.size()))][(int)(Math.sqrt(arr.size()))];
        int f = 0;
        for (int i = 0; i <(int)(Math.sqrt(arr.size())) ; i++) {
            for (int j = 0; j <(int)(Math.sqrt(arr.size())) ; j++) {
                matrix[i][j]=arr.get(f);
                f++;
            }
        }
        if (matrix == null || matrix.length == 0) {
            return null;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int[] result = new int[n * m];
        int t = 0;

        for (int i = 0; i < n + m - 1; i++) {
            if (i % 2 == 1) {
                // down left
                int x = i < n ? 0 : i - n + 1;
                int y = i < n ? i : n - 1;
                while (x < m && y >= 0) {
                    result[t++] = matrix[x++][y--];
                }
            } else {
                // up right
                int x = i < m ? i : m - 1;
                int y = i < m ? 0 : i - m + 1;
                while (x >= 0 && y < n) {
                    result[t++] = matrix[x--][y++];
                }
            }


        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < result.length ; i++) {
            arrayList.add(result[i]);
        }

        return arrayList;
    }    /*DONE*/

    static ArrayList<Integer> LeftDiag(ArrayList<Integer> arrayListy) {
        ArrayList<Integer> NewInt = new ArrayList<Integer>();
        ArrayList<Integer> NewInt2 = new ArrayList<Integer>();

        NewInt.add(arrayListy.get(0));
        int started = 2;
        int started2 = 1;
        int endles = 1;
        while (started <= Math.sqrt(arrayListy.size())-1) {
            for (int i = 0; i < started; i++) {
                NewInt.add(arrayListy.get(started2));
                started2 += (int) Math.sqrt(arrayListy.size()) - 1;


            }
            endles++;
            started2 = endles;

            started++;
        }
        started = 2;
        started2 = arrayListy.get(arrayListy.size() - 3);

        endles = arrayListy.size() - 2;
        while (started < Math.sqrt(arrayListy.size())-1) {
            for (int i = 0; i<= started; i++) {
                NewInt2.add(arrayListy.get(started2));

                started2 -= (int) (Math.sqrt(arrayListy.size()))- 1;


            }
            endles--;
            started2 = endles;

            started++;
        }
        Collections.reverse(NewInt2);

        NewInt.addAll(NewInt2);
        NewInt.add(arrayListy.get(arrayListy.size() - 1));
        System.out.println(NewInt.size());
        return NewInt;
    }

    /* percent 75 */
    static void RightDiag(ArrayList<Integer> arrayListy) {
        int sqrt = arrayListy.get((int) (Math.sqrt(arrayListy.size())));
        System.out.println(sqrt);
        ArrayList<Integer> NewInt = new ArrayList<Integer>();
        NewInt.add(arrayListy.get((int) (Math.sqrt(arrayListy.size())) - 1));
        int started = 2;
        int started2 = arrayListy.get((int) (Math.sqrt(arrayListy.size())) - 3);
        int endles = sqrt - 3;
        while (started <= Math.sqrt(arrayListy.size())) {
            for (int i = 0; i < started; i++) {
                NewInt.add(arrayListy.get(started2));
                started2 += 6;
            }
            endles--;
            started2 = endles;
            started++;

        }

        int get = arrayListy.get((int) (Math.sqrt(arrayListy.size())) - 2);
        System.out.println(get);
        started = 2;
        started2 = arrayListy.get(arrayListy.size() - get);
        System.out.println("starteds" + started2);
        endles = (int) (Math.sqrt(arrayListy.size())) - 3;

        while (started < Math.sqrt(arrayListy.size())) {
            for (int i = 0; i < started; i++) {
                NewInt.add(arrayListy.get(started2));

                started2 -= arrayListy.get(get) - 1;


            }
            endles++;
            started2 = endles;

            started++;
        }


        //     NewInt.add(arrayListy.get((int)(Math.sqrt(arrayListy.size()))-1));


        for (int a : NewInt) {
            System.out.print(a + " ");
        }

    }

    /* DONE */
    public static ArrayList<Integer> zigZag(ArrayList<Integer> arrayList) {
        // Flag true indicates relation "<" is expected,
        // else ">" is expected. The first expected relation
        // is "<"
        boolean flag = true;

        int temp = 0;

        for (int i = 0; i <= arrayList.size() - 2; i++) {
            if (flag) /* "<" relation expected */ {
                /* If we have a situation like A > B > C,
                we get A > B < C by swapping B and C */
                if (arrayList.get(i) > arrayList.get(i + 1)) {
                    // swap
                    temp = arrayList.get(i);
                    arrayList.set(i, arrayList.get(i + 1));
                    arrayList.set(i + 1, temp);
                }

            } else /* ">" relation expected */ {
                /* If we have a situation like A < B < C,
                we get A < C > B by swapping B and C */
                if (arrayList.get(i) < arrayList.get(i + 1)) {
                    // swap
                    temp = arrayList.get(i);
                    arrayList.set(i, arrayList.get(i + 1));
                    arrayList.set(i + 1, temp);
                }
            }
            flag = !flag; /* flip flag */

        }
        return arrayList;
    }

    /* WORK İN PROGRESS */
    public static ArrayList<Integer> printSpiralOrder(ArrayList<Integer> arr, int m, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[][] mat = new int[m][n];
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (count == arr.size()) break;
                mat[i][j] = arr.get(count);
                count++;

            }
        }
        int top = 0, bottom = mat.length - 1;
        int left = 0, right = mat[0].length - 1;

        while (true) {
            if (left > right) {
                break;
            }

            // print top row
            for (int i = left; i <= right; i++) {
                ans.add(mat[top][i]);

            }
            top++;

            if (top > bottom) {
                break;
            }

            // print right column
            for (int i = top; i <= bottom; i++) {
                ans.add(mat[i][right]);

            }
            right--;

            if (left > right) {
                break;
            }

            // print bottom row
            for (int i = right; i >= left; i--) {
                ans.add(mat[bottom][i]);

            }
            bottom--;

            if (top > bottom) {
                break;
            }

            // print left column
            for (int i = bottom; i >= top; i--) {
                ans.add(mat[i][left]);

            }
            left++;
        }


        return ans;


        //  return ans;

    }
}
