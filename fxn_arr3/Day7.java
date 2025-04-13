package fxn_arr3;

import java.util.Scanner;

public class Day7 {
    public static void main(String[] args) {
        int arr[] = {9, 5, 4, 3, 2};

        //--------------------- reverse of an array ----------------------
        /*int end = arr.length-1;
        int temp = 0;
        for(int i = 0; i<arr.length/2; i++){
            temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;
            end--;
        }
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }*/

        //--------------------- rotate an array --------------------------
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key");
        int key = sc.nextInt();
        int size = arr.length;
        key = key % size;
        if(key > 0){ // iterate to right 
            for(int i = 0; i<size; i++){
                int temp = arr[i];
                arr[i] = 
            }
        }

    }
}
