package contest;

import java.util.Scanner;

public class Contest2 {
    public static void main(String[] args) {
        //QUESTION 2
        Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();  
            int maxCount = 0;
            int count = 1;
            int arr[] = new int[size];
            for(int i = 0; i< size; i++){
                    arr[i] = sc.nextInt();
            }
            
            for(int j = 1; j < size; j++){
                    if(arr[j] == arr[j-1]){
                            count++;
                    } else {
                            count = 1;
                    }
                    maxCount = Math.max(maxCount, count);
            }
            System.out.println(count);
    }
}
