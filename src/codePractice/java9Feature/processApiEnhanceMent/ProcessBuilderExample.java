package codePractice.java9Feature.processApiEnhanceMent;

public class ProcessBuilderExample {

    public static void main(String[] args) throws Exception {
        new ProcessBuilder("jshell").inheritIO().start().waitFor();
        System.out.println("ProcessBuilderExample exiting");
    }
}
