package codePractice.misc;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter the number for reverse :");
			Integer num = sc.nextInt();
			boolean isNegative = false;
			if(num<0) {
				num = num *-1;
				isNegative = true;
			}
			Integer reversedNum = 0;
			while(num>0) {
				reversedNum = reversedNum * 10 + num%10;
				num = num/10;
			}
			if(isNegative) {
				reversedNum = reversedNum *-1;
			}
			System.out.println("Reversed Number : "+reversedNum);
		}
	}

}
