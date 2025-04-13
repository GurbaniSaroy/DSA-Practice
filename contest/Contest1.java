// butterfly pattern, total perfect sq, sum of even position
package contest;
import java.util.Scanner;

public class Contest1 {
    public static void main(String[] args) {

        //----------------- Butterfly pattern ---------------------
        int currLine = 1;
        System.out.println("enter the no.");
        Scanner sc = new Scanner(System.in);
        int totalLines = sc.nextInt();
        int stars = 1;
        int spaces = totalLines-2;
        while(currLine <= totalLines){
            //stars
            for(int i = 0; i < stars; i++){
                System.out.print("*\t");
            }
            //spaces
            for(int i = 0; i<spaces; i++){
                System.out.print("\t");
            }
            //stars
            if(currLine == (totalLines/2)+1){
                stars--;
            }
            for(int i = 0; i < stars; i++){
                System.out.print("*\t");
            }
            //next iteration
            stars++;
            System.out.println();
        }

        //----------------- Sum of even positions------------------
        /*int len = 0;
        System.out.println("enter the no.");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int temp = no;
        int sum = 0;
        while(temp > 0){
            temp = temp/10;
            len++;
        }
       
        while(len > 0){
            if(len % 2 == 0){
                sum = sum + (no%10);
            }
            no = no/10;
            len--;

        }
        System.out.println(sum);
        */
    }
}
