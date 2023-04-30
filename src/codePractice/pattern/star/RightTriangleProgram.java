package codePractice.pattern.star;

import java.util.Scanner;

public class RightTriangleProgram {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print(" RightTriangleProgram enter the num : ");
			int num = sc.nextInt();
			for (int i = 0; i < num; i++) {
				for (int j = 0; i >= j; j++) {
					System.out.print("* ");
				}
				System.out.println(" ");
			}

		} catch (Exception e) {
			System.err.println("RightTriangleProgram e : " + e.getMessage());
			e.printStackTrace();
		}
	}
}
