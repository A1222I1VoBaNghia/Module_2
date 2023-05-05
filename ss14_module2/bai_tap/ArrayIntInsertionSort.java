package ss14_module2.bai_tap;

import java.util.Arrays;

public class ArrayIntInsertionSort {

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
            int[] arr = { 3, 6, 1, 8, 2, 4 };
            System.out.println("Mảng chưa sắp xếp: " + Arrays.toString(arr));
            insertionSort(arr);
            System.out.println("Mảng đã sắp xếp: " + Arrays.toString(arr));
    }


    }

