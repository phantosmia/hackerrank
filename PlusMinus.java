import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int totalElements = arr.length;
        int totalZeros = 0;
        int totalNegatives = 0;
        int totalPositives = 0;
        NumberFormat formatter = new DecimalFormat("#0.000000");     
        for(int i = 0; i < totalElements; i++){
            if(arr[i] == 0){
                totalZeros++;
            }
            if(arr[i] < 0){
                totalNegatives++;
            }
            if (arr[i] > 0){
                totalPositives++;
            }
        }
        
        float fractionZero = (float) totalZeros / (float)totalElements;
        float fractionNegative =  (float) totalNegatives / (float) totalElements;
        float fractionPositive = (float) totalPositives / (float) totalElements;
        System.out.println(formatter.format(fractionPositive));
        System.out.println(formatter.format(fractionNegative));
        System.out.println(formatter.format(fractionZero));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
