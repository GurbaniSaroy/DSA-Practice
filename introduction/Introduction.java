package introduction;

import java.util.*;

public class Introduction {
  public static void printDays(int day) {
    switch (day) {
      case 1:
        System.out.println("Monday");

      case 2:
        System.out.println("Tuesday");

      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      default:
        System.out.println("not a day");
    }
  }

  public static int fibonacciLoop(int num) {
    if (num < 0) {
      return -1;
    } else if (num <= 1) {
      return num;
    } else {
      int num1 = 0, num2 = 1;
      int sum = 0;
      for (int i = 2; i <= num; i++) {
        sum = num1 + num2;
        num1 = num2;
        num2 = sum;
      }
      return sum;
    }
  }

  public static int sumOfDigits(int num) {
    int number = num;
    int sum = 0, temp = 0;
    while (number % 10 != 0) {// or while (number > 0)
      temp = number % 10;
      number = number / 10;
      sum += temp;
    }
    return sum;
  }

  public static int reverseOfDigits(int num) {
    int currDigit = 0, ans = 0;
    while (num > 0) {
      currDigit = num % 10;
      ans = ans * 10 + currDigit;
      num /= 10;
    }
    return ans;
  }

  public static int factorialLoop(int num) {
    int ans = 1;
    for (int i = num; i > 1; i--) {
      ans *= i;
    }
    return ans;
  }

  public static int inverseOfDigit(int num) {
    int pos = 1; 
    int inverse = 0, digit = 0;
    while(num > 0){
      digit = num % 10;
      inverse = inverse + ((int)Math.pow(10, digit-1) * pos);
      num = num / 10;
      pos++;
    }
    return inverse;
  }

  public static void isLeapYear(int year) {
    if ((year % 100 != 0 && year % 4 == 0) || (year % 100 == 0 && year % 400 == 0)) {
      System.out.println(year + " is a leap year");
    } else {
      System.out.println(year + " is not a leap year");
    }
  }

  public static void isPrime(int num){
    boolean isTrue = false;
    if(num > 0 && num <= 3){
      isTrue = true;
    }
    for(int i)
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    // ------- switch-cases ---------------
    // printDays(sc.nextInt());

    // -------- nth fibonacci USING LOOPS---------
    // System.out.println(fibonacciLoop(sc.nextInt()));

    // --------- nth factorial using loops -----------
    // System.out.println(factorialLoop(sc.nextInt()));

    // ----------- FIND THE SUM OF DIGITS---------------
    // System.out.println(sumOfDigits(sc.nextInt()));

    // -------------- reverse of a digit -------------
    // System.out.println(reverseOfDigits(sc.nextInt()));

    // ------------mathematical inverse of a number (permutation of positions)--------------
    // System.out.println(inverseOfDigit(sc.nextInt()));

    // ------------- isLeap year ----------------
    // isLeapYear(sc.nextInt());

    //----------- isPrime till n-th element using loops ------------
    isPrime(sc.nextInt());
  }
}