package Codility_OA_2;

public class Solution {



	public int solution(int N, String S){ 
		boolean foundAnswer = false;
		int answer = 0;
		int[][] seat= new int[N+1][10];
		
//		for(int i = 0 ; i < seat.length ; i ++) {
//			for(int q = 0 ; q < 10 ; q ++) {
//				System.out.print(seat[i][q]);
//			}
//			System.out.println();
//		}
		
		
		String[] splited = S.split("\\s+");
		if (S.length() == 0) {
			foundAnswer = true;
			return N * 2;
		}
		
		for(int i = 0 ; i < splited.length; i ++) { 
//			System.out.println(splited[i]);
			int occupiedRow;
			char occupiedLocation_char;
			String occupiedLocation;
			if (splited[i].length() > 2) { 
				occupiedRow= Integer.valueOf(String.valueOf(splited[i] .charAt(0)))*10 + Integer.valueOf(String.valueOf(splited[i] .charAt(1))) -1;
				occupiedLocation_char =  splited[i].charAt(2);
				occupiedLocation=String.valueOf(occupiedLocation_char);  
			}else {
			
				occupiedRow= Integer.valueOf(String.valueOf(splited[i] .charAt(0))) -1;
				occupiedLocation_char =  splited[i].charAt(1);
				occupiedLocation=String.valueOf(occupiedLocation_char);  
			}
			
			
			
			if (occupiedLocation.equals("A") ){  
				seat[occupiedRow][0] = 1;
			}else if (occupiedLocation.equals("B") ){  
				seat[occupiedRow][1] = 1;
			}else if (occupiedLocation.equals("C") ){  
				seat[occupiedRow][2] = 1;
			}else if (occupiedLocation.equals("D") ){  
				seat[occupiedRow][3] = 1;
			}else if (occupiedLocation.equals("E") ){  
				seat[occupiedRow][4] = 1;
			}else if (occupiedLocation.equals("F") ){  
				seat[occupiedRow][5] = 1;
			}else if (occupiedLocation.equals("G") ){  
				seat[occupiedRow][6] = 1;
			}else if (occupiedLocation.equals("H") ){  
				seat[occupiedRow][7] = 1;
			}else if (occupiedLocation.equals("J") ){  
				seat[occupiedRow][8] = 1;
			}else if (occupiedLocation.equals("K") ){  
				seat[occupiedRow][9] = 1;
			}  
		}
		for(int i = 0 ; i < seat.length ; i ++) {
			for(int q = 0 ; q < 10 ; q ++) {
				System.out.print(seat[i][q]);
			}
			System.out.println();
		}
		for (int  i = 0 ; i < N ; i ++) {
			boolean posA = true; 
			boolean posB = true; 
			boolean posC = true;
			for(int j = 1 ; j < 9 ; j ++) {
				if (seat[i][j] != 0 && (j == 1  || j == 2 || j == 3 ||j == 4)) {
					posA = false;
				}
				if (seat[i][j] != 0 && (j == 3  || j == 4 || j == 5 ||j == 6)) {
					posB = false;
				}
				if (seat[i][j] != 0 && (j == 5 || j == 6 || j == 7 ||j == 8)) {
					posC = false;
				}
			}
			
			if ( posA == true && posB == true && posC == true && foundAnswer == false) {
				answer = answer + 2;
			}else if ( posA == true && posB == false && posC == false && foundAnswer == false) {
				answer += 1;
			}else if ( posA == false && posB == true && posC == false && foundAnswer == false) {
				answer += 1;
			}else if ( posA == false && posB == false && posC == true && foundAnswer == false) {
				answer += 1;
			}else if ( posA == true && posB == true && posC == false && foundAnswer == false) {
				answer += 1;
			}else if ( posA == false && posB == true && posC == true && foundAnswer == false) {
				answer += 1;
			} 
		}
		
		
		
		return answer;		
		
	}
	
	
}
