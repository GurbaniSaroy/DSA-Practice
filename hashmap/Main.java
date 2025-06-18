package hashmap;

import java.util.HashMap;

class Main {
    // Most frequent CHaracter
    // http://geeksforgeeks.org/problems/maximum-occuring-character-1587115620/1-----------------
    public static char getMaxOccuringChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int Maxfreq = 0;
        for(int i = 0; i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch) == false){
                map.put(ch, 1);
            } else{
                int oldFreq = map.get(ch);
                map.put(ch, oldFreq+1);
            }
            ;
        }
        char MaxChar = '&';
        for(int i = 0; i < s.length(); i++){
        char ch = s.charAt(i) ;
        int val = map.get(ch);
            if(val>Maxfreq){
                Maxfreq = val;
                MaxChar = ch;
            } else if(val == Maxfreq && ch < MaxChar){
                MaxChar = ch;
            }
        }
        return MaxChar;
    }

    // leetcode 3005------------------------------
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int arrVal = nums[i];
            if(map.containsKey(arrVal) == false){
                map.put(arrVal, 1);
            } else{
                int oldFreq = map.get(arrVal);
                map.put(arrVal, oldFreq+1);
            }
        }
        for(int i = 0; i<nums.length; i++){
            int val = nums[i];
            
        }
        return ;
    }
}
