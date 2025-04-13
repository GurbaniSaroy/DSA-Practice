//FIBONNACI, FIND THE SUM OF DIGITS, reverse number and isprime....


// int no = sc.nextInt();
// boolean isPrime = false;

// for(int n = 2; n<no; n++){

// }
package intro1;
import java.util.*;

public class Day2 {
    public static void main(String[] args) {
        /*
    Scanner sc = new Scanner(System.in);

    //FIBONACCI USING LOOPS
    int no = sc.nextInt();
    int sum = 0;
    
    if(no == 0){ //OR if(no<=1){syso(no);}
        sum =  0;
    } else if(no == 1){
        sum = 1;
    }
    int first = 0;
    int second = 1;
    for(int n = 2; n<= no ;n++){
        sum = first+second;
        first = second;
        second = sum;
    }
    System.out.println(sum);
     */


     //FIND THE SUM OF DIGITS

     /*int number = 12345;
     int n = 0;
     while(number> 0){
        n += number%10;
        number = number/10;
     }
     System.out.println(n);
     */

     int number = 12345;
     int rev =0;
     while(number > 0){
        int lastDig = number%10;
         rev = rev*10 + lastDig;
         number /= 10;

     }
     System.out.println(rev);
}
}
