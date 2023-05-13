package codePractice.misc;

import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			System.out.print("Enter the number of String");
			Integer num = sc.nextInt();
			if (num <= 0) {
				throw new IllegalArgumentException("Number can not be zero or negative");
			}
			String[] arr = new String[num];
			for (int i = 0; i < num; i++) {
				System.out.print(String.format("Enter the  %d string", i+1));
				arr[i] = sc.next();

			}

			String output = longestCommonPrefix(arr);
			System.out.println("Output : " + output);
		}
	}

	public static String longestCommonPrefix(String[] strs) {
		String output = "";
		int min = Arrays.stream(strs).map(String::length).min(Integer::compare).orElse(0);
			for (int i = min; i > 0; i--) {
				String subStr = strs[0].substring(0, i);
				boolean allSubStrSame = true;
				for (int j = 1; j < strs.length; j++) {
					String tempSub =strs[j].substring(0, i);
					if(!subStr.equals(tempSub)) {
						allSubStrSame = false;
						break;
					}
				}
				if(allSubStrSame) {
					output = subStr;
					break;
				}
				
			}
		return output;

	}
}
