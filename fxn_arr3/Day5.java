//combination using functions, finding no. > 40 in arr, binary to decimal, decimal to binary
package fxn_arr3;

import java.util.Scanner;

public class Day5 {
    public static int Fac(int no) {
        int ans = 1;
        while (no != 0) {
            ans *= no;
            no--;
        }
        return ans;
    }

    public static void binToDec(){
        System.out.println("enter the binary number");
        Scanner sc1 = new Scanner(System.in);
        int num = sc1.nextInt();
        int sum = 0;
        int i =0;
        while(num>0){
            int temp = num%10; 
            num = num/10;
            sum += temp*Math.pow(2, i);
            i++;
        }
        System.out.print(sum);
    }

    public static void decToBin(){
        System.out.println("enter the decimal number");
        Scanner sc1 = new Scanner(System.in);
        int num = sc1.nextInt();
        int digit = 0;
        int base = 1;
        int ans=0;
        while(num>0){
            digit = num % 2;
            ans = digit*(Math.pow(10, 1));

            num /= 10;
        }
        System.out.println(ans);
    }

    public static void printArr(int arr[]) {
        System.out.println("Printing arr");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        //-----------------array-----------------------
        /*int arr[]=new int[4];
        arr[2] = 7;
        System.out.println(arr[3]); */


        //------------------combination using functions---------------------
        /*System.out.println("enter N:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter R:");
        int r = sc.nextInt();
        if (n < r) {
            System.out.println("Error");
        }

        else {
            int one = Fac(n);
            int two = Fac(r);
            int three = Fac(n - r);
            System.out.println(one / (two * three));
        }
        sc.close();*/

        //-------------------finding no. > 40 in arr--------------------------
        /*System.out.println("enter the size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i<size; i++){
            System.out.println("enter the value of ["+ (i+1) + "]:");
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<size; i++){
            if(arr[i]>40){
                System.out.println("Arr["+(i+1)+"]("+arr[i]+")>40");
            }
        } */

        //--------------------- binary to decimal ---------------------
        // binToDec();

        //--------------------- decimal to binary ---------------------
        decToBin();
    }
}
