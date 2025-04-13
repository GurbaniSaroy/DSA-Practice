//power question, pattern, tower of hanoi
package recursion_bcktracking6;

public class Recursion2 {
    public static int pow(int x, int y){
        if(y == 0){
            return 1;
        }
        int smallAns = pow(x, y-1);
        int ans = x * smallAns;
        return ans;
    }

    // optimised approach for pow
    public static int pow1(int x, int y){
        if(y == 0){
            return 1;
        }
        int smallAns = pow1(x, y/2);
        int ans = smallAns * smallAns;
        if(y % 2 != 0){
            ans += x;
        }
        return ans;

    }
    public static void pattern(int x){
        if( x == 0){
            return;
        }
        System.out.print(x);
        pattern(x-1);
        System.out.print(x);
        pattern(x-1);
        System.out.print(x);
        pattern(x-1);
    }

    public static void towerOfHanoi(int n, int A, int B, int c){// move n discs from A -> C using B















        

    }
    public static void main(String[] args) {
        // int ans = pow(50,50);
        // System.out.println(ans);

        // optimised approach for pow
        // int ans1 = pow1(2,5);
        // System.out.println(ans1);

        // pattern(3);

        //towerOfHanoi
        towerOfHanoi(3, 10, 20, 30);
    }
}
