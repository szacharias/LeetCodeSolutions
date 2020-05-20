package Codility_OA_Harvey_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
	public int solution(int N, String S) {
		int result = 0;
		Pattern pattern = Pattern.compile("(?<row>\\d{1,3})(?<col>[A-K])");
		int[][] seats = new int[N][10];
		String[] bookedSeats = S.split(" ");
		for (String each : bookedSeats) {
			if (each == null || "".equals(each))
				continue;
			Matcher matcher = pattern.matcher(each);
			int row = -1;
			int col = -1;
			String temp;
			while (matcher.find()) {
				if ((temp = matcher.group("row")) != null)
					row = Integer.parseInt(temp) - 1;
				if ((temp = matcher.group("col")) != null)
					col = Character.codePointAt(temp, 0) - 65;
			}
			if (row < 0 || col < 0)
				throw new RuntimeException("invalid input");
			seats[row][col] = 1;
		}
		for (int i = 0; i < N; i++) {
			if ((seats[i][1] + seats[i][2] + seats[i][3] + seats[i][4]) == 0
					&& (seats[i][5] + seats[i][6] + seats[i][7] + seats[i][8]) == 0)
				result += 2;
			else if ((seats[i][1] + seats[i][2] + seats[i][3] + seats[i][4]) == 0
					|| (seats[i][3] + seats[i][4] + seats[i][5] + seats[i][6]) == 0
					|| (seats[i][5] + seats[i][6] + seats[i][7] + seats[i][8]) == 0)
				result++;
		}
		return result;
	}

	private String genBookedSeats(int N) {
		Set<String> results = new HashSet<>();
		Random random = new Random();
		for (int i = 0; i < N; i++) {
			int bookedPerRow = random.nextInt(4);
			for (int j = 0; j < bookedPerRow; j++) {
				String bookedSeat;
				do {
					bookedSeat = String.valueOf(i + 1).concat(Character.toString((char) ('A' + random.nextInt(10))));
				} while (results.contains(bookedSeat));
				results.add(bookedSeat);
			}
		}
		StringBuilder sb = new StringBuilder();
		results.forEach(each -> {
			sb.append(" " + each);
		});
		return sb.substring(1);
	}
}