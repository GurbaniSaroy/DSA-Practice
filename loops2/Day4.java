//Patterns
package loops2;

import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalLine = sc.nextInt();
        int currLine = 1;

        /*
         * -----------Pattern 1------------
         *
         **
         ***
         */
        /*
         * while(currLine <= totalLine){
         * //stars
         * for(int i = 1; i<=currLine; i++){
         * System.out.print("*\t");
         * }
         * 
         * //spaces
         * System.out.println(" ");
         * //next line
         * currLine++;
         * }
         */

        /*----------- Pattern 2 ---------------
        *****
        ****
        ***
        **
        * */

        /*
         * int stars= totalLine;
         * while(currLine <= totalLine){
         * //stars
         * for(int i = 1; i <= stars; i++){
         * System.out.print("*\t");
         * }
         * //space
         * currLine++;
         * stars--;
         * System.out.println();
         * }
         */

        /*---------------Pattern 3---------------
            * 
           **
          ***
         **** 
        *****   */

        /*
         * int stars = currLine;
         * int spaces = totalLine-1;
         * while(currLine <= totalLine){
         * //spaces
         * for(int i = 1; i<=spaces; i++){
         * System.out.print("\t");
         * }
         * //stars
         * for(int j = 0; j < stars; j++){
         * System.out.print("*\t");
         * }
         * System.out.println();
         * spaces--;
         * stars++;
         * currLine++;
         * }
         */

        /*-------------- Pattern 4------------- 
         ****
          ***
           **
            *
        */

        /*
         * int stars = totalLine;
         * while(currLine <= totalLine){
         * //spaces
         * for(int i = 0; i<(currLine-1); i++){
         * System.out.print("\t");
         * }
         * //stars
         * for(int j = 0; j < stars; j++){
         * System.out.print("*\t");
         * }
         * 
         * currLine++;
         * stars--;
         * System.out.println();
         * }
         */

        /*--------------------Pattern 5------------
         n=2   *
              ***
             *****
              ***
               *    */
        /*
         * int newTotalLine = (totalLine*2)+1;
         * int space = totalLine;
         * int stars = 1;
         * while (currLine <= newTotalLine) {
         * //spaces
         * for(int i = 1; i<=space; i++){
         * System.out.print("\t");
         * }
         * //stars
         * for(int j = 0; j<stars; j++){
         * System.out.print("*\t");
         * }
         * 
         * //next line
         * if(currLine <= totalLine){
         * stars += 2;
         * space--;
         * } else{
         * space++;
         * stars -=2;
         * }
         * System.out.println();
         * currLine++;
         * 
         * }
         */

        /*------------------- Pattern 6-------------------
        n= 5 ***0***  0 Represent spaces
             **000**
             *00000*
             **000**
             ***0***
         */

        /*
         * int stars = (totalLine+2)/2;
         * int space = 1;
         * while(currLine <= totalLine){
         * //star
         * for(int i = 0; i<stars; i++){
         * System.out.print("*\t");
         * }
         * //space
         * for(int j = 0; j<space; j++){
         * System.out.print("\t");
         * }
         * //star
         * for(int i = 0; i<stars; i++){
         * System.out.print("*\t");
         * }
         * //next line
         * if(currLine < (totalLine+1)/2){
         * stars--;
         * space += 2;
         * } else{
         * stars++;
         * space -=2;
         * }
         * currLine++;
         * System.out.println();
         * }
         */

         /*--------------- Pattern 7--------------------
          * n=4  *
                  *
                   * 
                    *   */

                    //=============method1============
        /*int space = currLine-1;
        int star = 1;
        while(currLine <= totalLine){
            //spaces
            for(int i = 0; i < space; i++){
                System.out.print("\t");
            }
            //star
            for(int j = 0; j < star; j++){
                System.out.print("*\t");
            }
            //next line 
            currLine++;
            space++;
            System.out.println();
        }*/

        //================method2(nested looping)================
        /*int star = 1;
        int space = 0;
        for(int i = 0; i<totalLine; i++){
            //space 
            for(int k = 0; k <space; k++){
                System.out.print("\t");
            }
            //stars
            for(int j = 0; j<star; j++){
                System.out.print("*\t");
            }
            System.out.println();
            space++;
        }
        */

        //==============method3=============
        /*for(int i = 0; i<totalLine; i++){
            for(int j = 0; j<totalLine; j++){
                if(i==j){
                    System.out.print("*\t");
                } else{
                    System.out.print("\t");
                }

            }
            System.out.println();
        }*/

        //-------------------------------- Pattern 8----------------------------------
        /*  *
          *
         *
        *       */
        //===================Method1==============
        /*int space = totalLine-1;
        while(currLine<=totalLine){
            //space
            for(int i = 0; i<space; i++){
                System.out.print("\t");
            }
            //star
            System.out.print("*\t");
            space--;
            currLine++;
            System.out.println();
        }*/

        /*int space = totalLine-1;
        for(int i = 0; i<totalLine; i++){
            //space
            for(int j = 0; j<space; j++){
                System.out.print("\t");
            }
            //star
            System.out.print("*\t");
            //next
            space--;
            System.out.println();
        }*/

        //===============method3==================
        for(int i = 0; i<totalLine; i++){
            for(int j = 0; j<totalLine; j++){
                if()
            }
        }
    }
}
