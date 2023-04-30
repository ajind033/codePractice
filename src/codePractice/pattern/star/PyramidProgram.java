package codePractice.pattern.star;

import java.util.Scanner;

public class PyramidProgram {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print(" PyramidProgram enter the num : ");
			int num = sc.nextInt();
			for (int i = 0; i < num; i++) {
				for (int j = 0; j < num; j++) {
					if (j < num - (i + 1)) {
						System.out.print(" ");
					} else {
						System.out.print("* ");
					}
				}
				System.out.println();
			}

		} catch (Exception e) {
			System.err.println("PyramidProgram e : " + e.getMessage());
			e.printStackTrace();
		}
	}
}
