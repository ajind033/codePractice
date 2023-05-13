package codePractice.misc;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter String for Reverting: ");
			String input = sc.nextLine();
			String reversedStr = "";
			for (int i = 0; i < input.length(); i++) {
				reversedStr = input.charAt(i) + reversedStr;
			}
			System.out.println("Reversed String : " + reversedStr);
		}
	}
}
