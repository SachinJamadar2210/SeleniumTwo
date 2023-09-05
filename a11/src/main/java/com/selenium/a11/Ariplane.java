package com.selenium.a11;
import java.util.Arrays;
public class Ariplane {
    public static void main(String[] args) {
        int[] X = {2, 7, 9, 15, 25};
        int[] Y = {5, 8, 13, 20};
        int[] Z = {2, 45, 3, 4, 3};
        int M = X.length;
        int N = Y.length;
        int O = Z.length;
        int totalLength = M + N + O;
        int[] mergedArray = new int[totalLength];
        System.arraycopy(X, 0, mergedArray, 0, M);
        System.arraycopy(Y, 0, mergedArray, M, N);
        System.arraycopy(Z, 0, mergedArray, M + N, O);
        Arrays.sort(mergedArray);
        for (int i = 0; i < totalLength; i++) {
            System.out.print(mergedArray[i] + " ");
        }
    }
}