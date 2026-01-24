import java.io.BufferedReader;
import java.io.FileReader;

public class ResultsAnalyzer {
    public static void main(String[] args) {
        String logFile = "./results.jtl";
        int totalRequests = 0;
        int failedRequests = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(logFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                totalRequests++;
                if (line.contains("false")) failedRequests++;
            }
            double errorRate = (double) failedRequests / totalRequests * 100;
            System.out.println("=== JMeter Results Analysis ===");
            System.out.println("Total Requests: " + totalRequests);
            System.out.println("Failed Requests: " + failedRequests);
            System.out.printf("Error Rate: %.2f%%\n", errorRate);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
