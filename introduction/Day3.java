//inverse of a number, rotate a no. by 'k', gcd, lcm and prime factorization

// package intro1;

import java.util.Scanner;

public class Day3 {
   public static void main(String[] args) {
      
      
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int ans=0 , temp=0;
        int pos = 1;
        while (number>0) {
        temp = number%10;
        number = number/10;
        ans = ans + pos*(int)(Math.pow(10,temp-1));
        pos++;
        System.out.println(ans);
        
        }
        System.out.println(ans);
       

      // -------------Rotate a number by 'k'----------------
      /*
       * System.out.println("enter the number");
       * Scanner sc = new Scanner(System.in);
       * int num = sc.nextInt();
       * int temp = num;
       * System.out.println("enter roating number");
       * Scanner sc = new Scanner(System.in);
       * int k = sc.nextInt();
       * 
       * //getting the length
       * int len = 0;
       * while(temp > 0){
       * temp = temp/10;
       * len++;
       * }
       * 
       * if(k == 0){
       * System.out.println(num);
       * }
       * 
       * //shortening k
       * if(k > len){
       * k %= len;
       * }
       * 
       * //handling negative k
       * if(k < 0){
       * k += len;
       * }
       * 
       * int temp1 = (int)Math.pow(10, k);
       * int newN=0;
       * newN = (num%temp1)*(int)Math.pow(10, len-k)+(num/temp1);
       * 
       * System.out.println(newN);
       */

      // ---------------- GCD calculation ------------------
      // System.out.println("enter 1st no:");
      // int ip1 = sc.nextInt();
      // System.out.println("enter 2nd no:");
      // int ip2 = sc.nextInt();
      // int min = Math.min(ip1, ip2);
      // int max = Math.max(ip1, ip2);
      // int ans = 1;
      // if (max % min == 0) {
      //    System.out.println("gcd"+min);
      // }
      // else {

      //    while (max % min != 0) {
      //       ans = max % min;
      //       max = min;
      //       min = ans;
      //    }
      //    System.out.println("gcd:"+min);
      // }
      //----------------- LCM Calculator -------------------
      //formula no1*no2 = lcm*gcd
      // System.out.println("lcm:"+ (ip1*ip2)/min);
   }
}
