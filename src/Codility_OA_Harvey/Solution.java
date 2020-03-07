package Codility_OA_Harvey;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {

	private static int tempRecord = 0;
	private static String currentLastSymbol = "";
	private Comparator<Input> comparator = new Comparator<Input>() {

		@Override
		public int compare(Input arg0, Input arg1) { 
			return arg1.getRecord() - arg0.getRecord();
		}
	};

	public String solution(int A, int B, int C) {
		List<Input> list = new ArrayList<>();
		list.add(new Input("a", A));
		list.add(new Input("b", B));
		list.add(new Input("c", C));

		sortList(list);
		StringBuilder result = new StringBuilder("");
		do {
			if (list.get(0).getRecord() > list.get(1).getRecord()
					&& list.get(1).getRecord() > list.get(2).getRecord()) {
				result.append(getCorrectSymbol(list, 1));
			} else if (list.get(0).getRecord() > list.get(1).getRecord()
					&& list.get(1).getRecord() == list.get(2).getRecord()) {
				result.append(getCorrectSymbol(list, 1));
			} else if (list.get(0).getRecord() == list.get(1).getRecord()
					&& list.get(1).getRecord() > list.get(2).getRecord()) {
				result.append(getCorrectSymbol(list, 2));
			} else if (list.get(0).getRecord() == list.get(1).getRecord()
					&& list.get(1).getRecord() == list.get(2).getRecord()) {
				result.append(getCorrectSymbol(list, 3));
			} else {
				System.err.println("impossible!!");
			}
		} while (canContinue(list));

		if (list.get(0).getRecord() > 0)
			for (int i = 0; i < list.get(0).getRecord() && i < 2; i++) {
				result.append(list.get(0).getSymbol());
			}

		return result.toString();
	}

	private boolean canContinue(List<Input> list) {
		int count = 0;
		for (Input input : list) {
			if (input.getRecord() == 0)
				count++;
		}
		if (count >= 2)
			return false;
		return true;
	}

	private void sortList(List<Input> list) {
		Collections.sort(list, comparator);
	}

	private String getCorrectSymbol(List<Input> list, int size) {
		String result = "";
		for (int i = 0; i < size; i++) {
			result += getCorrectSymbol(list);
			sortList(list);
		}
		return result;
	}

	private String getCorrectSymbol(List<Input> list) {
		for (int i = 0; i < list.size(); i++) {
			if (2 == tempRecord && list.get(i).getSymbol() == currentLastSymbol) {
				continue;
			} else {
				list.get(i).decreaseRecord();
				if (tempRecord == 2)
					tempRecord = 1;
				else if (tempRecord == 1 && list.get(i).getSymbol() == currentLastSymbol)
					tempRecord++;
				else
					tempRecord = 1;
				return currentLastSymbol = list.get(i).getSymbol();
			}
		}
		return "";
	}

	class Input {
		String symbol;
		int total;
		int record;

		public Input(String symbol, int num) {
			setSymbol(symbol);
			setTotal(num);
			setRecord(num);
		}

		public String getSymbol() {
			return symbol;
		}

		public void setSymbol(String symbol) {
			this.symbol = symbol;
		}

		public int getTotal() {
			return total;
		}

		public void setTotal(int total) {
			this.total = total;
		}

		public int getRecord() {
			return record;
		}

		public void setRecord(int record) {
			this.record = record;
		}

		public int increaseRecord() {
			return record++;
		}

		public void decreaseRecord() {
			this.record--;
		}

	}

}