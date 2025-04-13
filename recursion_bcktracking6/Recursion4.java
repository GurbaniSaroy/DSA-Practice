//Recursion on the way down
package recursion_bcktracking6;

import java.util.ArrayList;

public class Recursion4 {
    static String arr[] = {",:", "<;", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static ArrayList<String> getSubsequences(String str){
        
        if(str == ""){
            ArrayList<String> baseAns = new ArrayList<>();
            baseAns.add("");
            return baseAns;
        }

        char firstChar = str.charAt(0);
        String remString = str.substring(1);

        ArrayList<String> smallAns = getSubsequences(remString);
        ArrayList<String> answer = new ArrayList<>();
        for(String s : smallAns){
            answer.add(s);
        }
        for(String s: smallAns){
            answer.add(firstChar+s);
        }

        return answer;

    }

    public static ArrayList<String> KYC(String str){ //456

        if(str == ""){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        int firstDigit = str.charAt(0) - '0'; //'4' - '0' = 4
        String remString = str.substring(1); //56
        ArrayList<String> smallAns = KYC(remString);

        ArrayList<String> answer = new ArrayList<>();
        
        String ch = arr[firstDigit];
        for(String s : smallAns){
            for(int i = 0; i<ch.length(); i++){

                answer.add(ch.charAt(i) + s);
            }
        }

        return answer;

        
    }

    public static ArrayList<String> stairPaths(int n){
        if(n- == 0){
            return 
        }

        stairPaths(n-);
    }
    public static void main(String[] args) {
        // ArrayList<String> allSub = getSubsequences("abc");
        // System.out.println(allSub);

        //keypad combinations
        // ArrayList<String> KeyPadCom = KYC("456");
        // System.out.println(KeyPadCom);

        //stair paths
        ArrayList<String> paths = stairPaths(4);
        System.out.println(paths);
    }
}
