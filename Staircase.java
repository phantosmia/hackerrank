import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {
        int spaceQuantityForCurrentLine = 0;
        int symbolQuantityForCurrentLine = 0;
        Character [][] staircase = new Character [n][n];
        for(int i = 0; i < n; i++){
            spaceQuantityForCurrentLine = n - (i+1);
            symbolQuantityForCurrentLine = (i+1);
            for(int j = 0; j < n; j++){
                if((j+1) <= spaceQuantityForCurrentLine){
                    staircase[i][j] = ' ';
                }
                else{
                    staircase[i][j] = '#';
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(staircase[i][j]);
            }
            System.out.println();
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
