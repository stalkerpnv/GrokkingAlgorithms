package others.ListVsArrays.perfomance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static java.lang.Math.pow;

public class ComparePerformance {

    private static int n = 1000;
    private static int w = 500;
    private static double m = (double) w / n;

    public static void fillArr(int r) {
        long time = System.currentTimeMillis();
        int halfN = n / 2;
        int[][] infSet = new int[n][n];
        int[][] infSetOne = new int[n][n];
        int[][] infSetTwo = new int[n][n];
        int[][] infSetIncOne = new int[n][n];
        int[][] infSetIncTwo = new int[n][n];
        Arrays.stream(infSet).forEach(a -> Arrays.fill(a, -1));
        Arrays.stream(infSetOne).forEach(a -> Arrays.fill(a, -1));
        Arrays.stream(infSetTwo).forEach(a -> Arrays.fill(a, -1));
        Arrays.stream(infSetIncOne).forEach(a -> Arrays.fill(a, -1));
        Arrays.stream(infSetIncTwo).forEach(a -> Arrays.fill(a, -1));
        int count = 0;
        for (int i = 0; i < infSet.length; i++) {
            for (int j = 0; j < infSet[i].length; j++) {
                if (pow(r / m, 2) >= (pow((i - halfN), 2) + pow((j - halfN), 2))) {
                    infSet[i][j] = 0;
                    count++;
                }
            }
        }
        // Первая вспомогательная область
        for (int i = 0; i < infSetOne.length; i++) {
            for (int j = 0; j < infSetOne[i].length; j++) {
                if (pow(r / m, 2) >= (pow((i - halfN), 2) + pow((j - halfN), 2))) {
                    infSetOne[i][j] = 0;
                }
            }
        }
        // Вторая вспомогательная область
        for (int i = 0; i < infSetTwo.length; i++) {
            for (int j = 0; j < infSetTwo[i].length; j++) {
                if (pow(r / m, 2) >= (pow((i - halfN), 2) + pow((j - halfN), 2))) {
                    infSetTwo[i][j] = 0;
                }
            }
        }
        System.out.println("Fill array");
        System.out.println("count = " + count);
        System.out.println("Time fill in arr " + (System.currentTimeMillis() - time));
        System.out.println("-------------------------------------------------------");

    }

    public static void fillArrayList(int r) {
        long time = System.currentTimeMillis();
        ArrayList<String> arrayList = new ArrayList<>();
        int halfN = n / 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (pow(r / m, 2) >= (pow((i - halfN), 2) + pow((j - halfN), 2))) {
                    // i j
                    arrayList.add(Integer.toString(i).concat( " " + Integer.toString(j)));
                }
            }
        }
        System.out.println("Fill arrayList");
        System.out.println("count = " + arrayList.size());
        System.out.println("Time fill in arrayList " + (System.currentTimeMillis() - time));
        System.out.println("-------------------------------------------------------");
    }
    public static void fillHashMap(int r ){
        long time = System.currentTimeMillis();
        HashMap<String,String> hashMap = new HashMap<>();
        int halfN = n / 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (pow(r / m, 2) >= (pow((i - halfN), 2) + pow((j - halfN), 2))) {
                    // i j
                    hashMap.put(Integer.toString(i).concat( " " + Integer.toString(j)),"0");
                }
            }
        }

        System.out.println("Fill HashMap");
        System.out.println("count = " + hashMap.size());
        System.out.println("Time fill in arrayList " + (System.currentTimeMillis() - time));
        System.out.println("-------------------------------------------------------");
    }


    public static void main(String[] args) {
        int r = 100;
        fillArr(r);
        fillArrayList(r);
        fillHashMap(r);
    }
}
