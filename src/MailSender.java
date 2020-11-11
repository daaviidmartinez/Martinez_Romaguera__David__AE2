import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MailSender {
    public static void main(String[] args) throws IOException, InterruptedException {
        String file = "ListEmails.txt";
        Send(file);
    }

    private  static  void Send(String file) throws IOException, InterruptedException {
        FileReader reader = new FileReader(file);
        BufferedReader bReader = new BufferedReader(reader);

        String line;

        while ((line = bReader.readLine()) != null) {
            System.out.println("gracias por tu registro " + line + "!");
            Thread.sleep(3000);
        }
    }
}