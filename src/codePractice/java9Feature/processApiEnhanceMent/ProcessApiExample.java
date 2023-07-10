package codePractice.java9Feature.processApiEnhanceMent;

public class ProcessApiExample {

	public static void main(String[] args) {
	
		ProcessHandle process = ProcessHandle.current();
		System.out.println("pid - >" + process.pid());
		System.out.println("isAlive - >" + process.isAlive());
		System.out.println("parent - >" + process.parent().get());
		System.out.println("info - >" + process.info());
		System.out.println("allProcesses - >" + ProcessHandle.allProcesses());

		System.out.println("children - >");
		process.children().forEach(System.out::println);
		System.out.println("descendants - >");
		process.descendants().forEach(System.out::println);
	}
}
