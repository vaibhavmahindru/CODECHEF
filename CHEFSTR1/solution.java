import java.util.*;
import java.lang.*;
import java.io.*;

public class solution {
    public static void count(int arr[]) {
        int count = 0;
        int skip = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                count = arr[i] - arr[i + 1];
                count--;
            } else if (arr[i + 1] > arr[i]) {
                count = arr[i + 1] - arr[i];
                count--;
            } else if (arr[i] == arr[i + 1]) {
                count = 0;
            }

            skip += count;
        }
        System.out.println(skip);
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }
            count(arr);
        }
        in.close();
    }
}
