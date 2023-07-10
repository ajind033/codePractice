package codePractice.java9Feature.processApiEnhanceMent;

public class ProcessBuilderExample {

    public static void main(String[] args) throws Exception {
    	ProcessBuilder  pb =  new ProcessBuilder("jshell");
    	Process p =pb.inheritIO().start();
    	Thread.sleep(5_000l);
    	p.destroy();
        System.out.println("ProcessBuilderExample exiting");
    }
}
