package Codility_BinaryGap;

class Solution {
    public int solution(int N) { 
        char[] binary_version = Integer.toString(N,2).toCharArray(); 
        int current_max = 0;
        int local_max = 0;
        for(int i = 0 ; i < binary_version.length ; i ++){ 
            int compare_number = Character.getNumericValue(binary_version[i]);
            if (compare_number== 0){
                local_max += 1;
            }else if (compare_number != 0){
                if (current_max < local_max){
                    current_max = local_max;
                }   
                local_max = 0;
            } 
            
        } 
//        Ctrl + space = content assist
        return current_max;
    }
}
