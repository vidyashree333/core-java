import java.net.*;
import java.io.*;

public class FraudCheck {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://api.fraudlabspro.com/v1/order/screen?apiKey=YOUR_API_KEY");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(
        new InputStreamReader(con.getInputStream()));

        String inputLine;
        while((inputLine=in.readLine())!=null){
            System.out.println(inputLine);
        }
        in.close();
    }
}