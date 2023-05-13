package codePractice.misc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Enter the Roman Number");
			String input = sc.nextLine();
			Integer output = romanToInt(input.toUpperCase());
			System.out.println("Output : " + output);
		}
	}

	private static Integer romanToInt(String s) {

		Map<Character, Integer> romanToIntMap = new HashMap<>();
		romanToIntMap.put('I', 1);
		romanToIntMap.put('V', 5);
		romanToIntMap.put('X', 10);
		romanToIntMap.put('L', 50);
		romanToIntMap.put('C', 100);
		romanToIntMap.put('D', 500);
		romanToIntMap.put('M', 1000);

		Integer number = 0;
		for (int i = 0; i < s.length(); i++) {
			Integer temp = romanToIntMap.get(s.charAt(i));
			Integer temp1 = 0;
			if (i < s.length() - 1) {
				temp1 = romanToIntMap.get(s.charAt(i + 1));
				temp1 = temp1 / temp;
				if (temp1 == 5 || temp1 == 10) {
					temp = (temp1 - 1) * temp;
					i++;
				}
			}

			number += temp;
		}
		return number;
	}
}
