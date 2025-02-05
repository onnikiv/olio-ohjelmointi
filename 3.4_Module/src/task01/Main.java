package task01;
import java.io.*;
import java.net.*;

public class Main {
    public static void main(String[] args) {
        // first, create the url
        URL myUrl;
        try {
            myUrl = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");
        } catch (MalformedURLException e) {
            System.err.println(e);
            return;
        }

        try {
            // open the connection and get the input stream
            // it will automatically generate HTTP GET-request
            InputStream istream = myUrl.openStream();

            // jump to character streams
            InputStreamReader istreamreader = new InputStreamReader(istream);

            // and to buffered reader for efficiency
            BufferedReader reader = new BufferedReader(istreamreader);

            // we use StringBuilder for efficiency, concatenating ordinary Strings is slow and
            // generates unnecessary objects
            String line;
            StringBuilder response = new StringBuilder();

            // here we read the content of the web page line by line
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            // now it is time to print the result
            reader.close();
            String[] lines = response.toString().split("\n");
            for (String l : lines) {
                String[] columns = l.split(",");
                // Assuming you want the second column (index 1)
                if (columns.length > 1) {
                    System.out.println(columns[1]);
                }
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}