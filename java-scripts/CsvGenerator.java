import java.io.FileWriter;
import java.util.Random;

public class CsvGenerator {
    public static void main(String[] args) {
        String csvFile = "./test-data/users.csv";
        try (FileWriter writer = new FileWriter(csvFile)) {
            writer.append("username,email,userId\n");
            for (int i = 1; i <= 1000; i++) {
                writer.append(String.format("user%d,user%d@test.com,%d\n", i, i, i));
            }
            System.out.println("CSV file generated: " + csvFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
