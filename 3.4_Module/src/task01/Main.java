package task01;
import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private final static String URL_STRING = "https://users.metropolia.fi/~jarkkov/temploki.csv";

    public static void main(String[] args) {
        URL myUrl;
        try {
            myUrl = new URL(URL_STRING);
        } catch (MalformedURLException e) {
            System.err.println(e);
            return;
        }

        try {
            InputStream istream = myUrl.openStream();
            InputStreamReader istreamreader = new InputStreamReader(istream);
            BufferedReader reader = new BufferedReader(istreamreader);

            String line;
            String[] columnNames = new String[0];
            boolean header = true;
            List<Double> temperatures = new ArrayList<>();

            while ((line = reader.readLine()) != null) {
                if (header) {
                    columnNames = line.split(";");
                    header = false;
                } else {
                    String[] columns = line.split(";");
                    String date = columns[0]; // Date is in the first column
                    if (date.startsWith("01.01.2023")) {
                        double temperature = Double.parseDouble(columns[1]); // Temperature is in the second column
                        temperatures.add(temperature);
                    }
                }
            }

            reader.close();

            // Calculate the average temperature
            double sum = 0;
            for (double temp : temperatures) {
                sum += temp;
            }
            double average = sum / temperatures.size();
            System.out.println("Average temperature for 1st January 2023: " + average);

        } catch (IOException e) {
            System.err.println(e);
        }
    }
}