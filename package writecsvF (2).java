package csvfiles2;

import java.io.FileWriter;
import java.io.IOException;

public class csvfilewriter_2 {
    public static void main(String[] args) {
        String csvFileName = System.getProperty("user.dir") + "\\data\\sample_leads.csv";

        try {
            FileWriter writer = new FileWriter(csvFileName);
            writer.append("Name,ID,phone_no.,Email\n"); // header
            writer.append("Mr. Christopher Maclead,\"1007250000000000000\",555-555-5555,christopher-maclead@noemail\n");
            writer.append("Ms. Carissa Kidman,\"1007250000000000000\",555-555-5555,carissa-kidman@noemail\n");
            writer.append("Mr. James Merced,\"1007250000000000000\",555-555-5555,james-merced@noemail\n");
            writer.close();

            System.out.println("CSV file created at: " + csvFileName);
        } catch (IOException e) {
            System.out.println("❌ Error writing CSV file: " + e.getMessage());
        }
    }
}
