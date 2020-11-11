import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class MemberMonitor {
    public static void main(String[] args) throws IOException, InterruptedException {
        String file = "ListEmails.txt";
        ReadFiles(file);
    }


    private static void ReadFiles(String nameFiles) throws IOException, InterruptedException {
        FileReader reader = new FileReader(nameFiles);
        BufferedReader bReader = new BufferedReader(reader);
        String line;
        while ((line = bReader.readLine()) != null) {
            try {
                System.out.println(line);
            } catch (Exception e) {
                System.out.println("Error en el monitor nº " + e);
            }
            Thread.sleep(4000);
        }
    }
}
