package codePractice.pattern.star;

import java.util.Scanner;

public class PrintStarBasedOnInputArray {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("Enter the number of lines");
			Integer num = sc.nextInt();
			if(num<=0) {
				throw new IllegalArgumentException("Number can not be zero or negative");
			}
			Integer[] arr = new Integer[num];
			Integer min = Integer.MAX_VALUE;
			System.out.print(String.format("Enter the number of stars in %d lines", num));
			for (int i = 0; i < num; i++) {
				arr[i] = sc.nextInt();
				if(min>arr[i]) {
					min = arr[i];
				}
			}
			for (int i = 0; i < arr.length; i++) {
				if(min<0) {
					Integer blankSpace = 0;
					if(arr[i]>=0){
						blankSpace = min *(-1);
					}else {
						blankSpace = arr[i] + (min *(-1));
					}
					for (int j = 0; j < blankSpace; j++) {
						System.out.print(" ");
					}
				}
				Integer absValue = Math.abs(arr[i]);
				for (int j = 0; j < absValue; j++) {
					System.out.print("*");					
				}
				System.out.println();
			}
		}
	}
}
