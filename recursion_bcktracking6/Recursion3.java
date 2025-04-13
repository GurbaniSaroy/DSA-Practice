package recursion_bcktracking6;

public class Recursion3 {
    public static void printArr(int[] arr, int idx) {
        if (idx == arr.length) {
            return;
        }
        System.out.println(arr[idx]);
        printArr(arr, idx + 1);
    }

    public static void printRevArr(int arr[], int idx) {
        if (idx == arr.length) {
            return;
        }
        printRevArr(arr, idx + 1);
        System.out.println(arr[idx]);
    }

    public static int maxInArr(int arr[], int idx) {
        if (idx == arr.length) {
            return Integer.MIN_VALUE;
        }
        int maxSoFar = maxInArr(arr, idx + 1);
        int ans = Math.max(maxSoFar, arr[idx]);
        return ans;
    }

    public static int firstIdx(int arr[], int idx, int tar) {
        if(idx == arr.length){
            return -1;
        }
        int furtherAns = firstIdx(arr, idx + 1, tar);
        if (arr[idx] == tar) {
            return idx;
        } else{
            return furtherAns;
        }
    }

    public static int findLastIdx(int arr[], int idx, int tar) {
        if (idx == arr.length) {
            return -1;
        }
        int furtherLast = findLastIdx(arr, idx+1, tar);
        if(arr[idx] == tar && furtherLast == -1){
            return idx;
        }
        else{
            return furtherLast;
        }
    }

    public static int allIndices(int arr[], int idx, int tar, int found){
        if(idx == arr.length){
            int baseArr[] = new int[found];
            return baseArr;
        }
        int ans[];
        if(arr[idx] == tar){
            ans = allIndices(arr, idx++, tar, found++);
        } else{

            ans = allIndices(arr, idx++, tar, found)
        }

        

        return ans;
    }
    public static void main(String[] args) {
        int arr[] = { 12, 4, 5, 2, 2, 3, 2, 7, 8, -1 };
        // printArr(arr, 0);
        // printRevArr(arr, 0);
        // System.out.println( maxInArr(arr, 0));
        // System.out.println(firstIdx(arr,0,2));
        // System.out.println(findLastIdx(arr, 0, 2));
        allIndices(arr, 0, 2, 0);
    }
}
