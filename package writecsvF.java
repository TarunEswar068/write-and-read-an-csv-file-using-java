package csvFiles;
import java.io. FileWriter;
public class CSVFileWritter{
public static void main(String[] args) throws IOException {
String csvFileName=System.getProperty("user.dir")+"\\data\\sample_leads.csv";\\give the file directory\\
FileWriter writer=new FileWriter(csvFileName);
writer.append("Name,ID,phone_no.,Email \n"); //header
writer.append("Mr. Christopher Maclead,1.00725E+18, 555-555-5555,christopher-maclead@noemail \n");
writer.append("Ms. Carissa Kidman,1.00725E+18, 555-555-5555,carissa-kidman@noemail \n");
writer.append("Mr. James Merced,1.00725E+18, 555-555-5555,james-merced@noemail \n");
writer.close();
System.out.println("CSV file created at:"+csvFileName);
}
}