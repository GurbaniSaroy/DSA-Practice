// print in decreasing order, increasing order, decreasing-increasing order, factorial 
package recursion_bcktracking6;

public class Recursion1 {
    public static void printDec(int N){
        if(N == 0){
            return;
        }
        System.out.println(N);
        printDec(N-1);
    }
    public static void printInc(int N){
        if(N == 0){
            return;
        }
        printInc(N-1);
        System.out.println(N);
    }
    public static void printDecInc(int N){
        if(N == 1){
            System.out.println(N);
            return;
        }
        System.out.println(N);
        printDecInc(N-1);
        System.out.println(N);
    }

    public static int printFac(int n){
        if(n == 1){
            return 1;
        }
        int smallAns = printFac(n-1);
        int ans = smallAns * n;
        return ans;
    }
    public static void main(String[] args) {
        // print in decreasing order
        // printDec(5);

        //print in increasing order
        // printInc(5);

        //print in dec-inc order
        // printDecInc(5);

        //print factorial
        System.out.println(printFac(5));
    }
}
