package codePractice.java9Feature;

import java.math.BigDecimal;
import java.util.Scanner;

public class TryWithResourceEnhancementExample {
// Now we can have use final or effectively final closeable resource,like, Scanner, instead of creating one in try braces.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try(sc){
			BigDecimal bd= sc.nextBigDecimal();
			System.out.println("try Block " + bd);
			throw new Exception("Excepttion s");
		}catch(Exception e) {

			System.err.println(" Exception Block {}"+e);
		}finally {
			System.out.println("finally Block");

		}
	}
}
