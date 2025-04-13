package fxn_arr3;

public class Day6 {
    public static void main(String[] args) {
        int currLine = 1;
        int arr[] = {3, 1, 8, 4, 0, 6};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int totalLine = max;
        int size = arr.length;
        //calculate min ele
        for(int i = 0; i<size; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        // calculate max ele
        for(int i = 0; i<size; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        while(currLine < totalLine){
            
            //spaces
            for()
        }
    }
}
