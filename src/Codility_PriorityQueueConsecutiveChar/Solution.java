package Codility_PriorityQueueConsecutiveChar;
 
import java.util.PriorityQueue; 

public class Solution {
	
	


	public static String solution(int A, int B,int C ){

        PriorityQueue<int[]>pq = new PriorityQueue<>((a,b)->( b[1]-a[1]));

        StringBuilder str = new StringBuilder();
        for(int i =0 ; i < 1; i++){
            pq.offer(new int[]{'a',A});
            pq.offer(new int[]{'b',B});
            pq.offer(new int[]{'c',C});
        }
        while (!pq.isEmpty()){
            int[]curr = pq.poll();
            int hold =0;

            while (hold < 2 && curr != null){
                str.append(Character.toChars(curr[0]));
                hold++;
                if(curr[1] == 1)break;
            }
            int[] subs = pq.poll();
            if(subs != null) str.append(Character.toChars(subs[0]));
            if(curr != null){if(curr[1] - 2 > 0 ) pq.offer(new int[]{curr[0], curr[1]-2});}
            if(subs != null){if(subs[1] - 1 > 0 ) pq.offer(new int[]{subs[0], subs[1]-1});}
            if(pq.size() ==1){
                int[] ele = pq.peek();
                if(ele[1] >= 3)return "";
            }
        }
        return str.toString();
	}
}
