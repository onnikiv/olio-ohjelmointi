package task01;

import java.io.*;
import java.net.*;

public class Main {
    public static void main(String[] args) {

        URL myUrl;
        try {
            myUrl = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");
        } catch (MalformedURLException e) {
            System.err.println(e);
            return;
        }

        try {
            InputStream istream = myUrl.openStream();
            InputStreamReader istreamreader = new InputStreamReader(istream);
            BufferedReader reader = new BufferedReader(istreamreader);

            String line;
            StringBuilder response = new StringBuilder();

            int amountOfSamples = 0;
            double sumOfTemperatures = 0;

            // imuroidaan kaikki 0, ja 1 columneista
            while ((line = reader.readLine()) != null) {
                String[] columns = line.split(";");

                if (columns.length > 0) { // PVM rivi 
                    response.append(columns[0]).append(" ");
                    amountOfSamples++;

                    if (columns.length > 1) { // UlkoTalo
                        response.append(columns[1]).append("\n");


                    }
                }
            }
            reader.close();
            
            String[] lines = response.toString().split("\n");
            for (String l : lines) {
                if (l.startsWith("01.01.2023")) {
                    System.out.println(l);
                }
            }

            System.out.println("Date: 01.01.2023 --- Average temperature: ");

        } catch (IOException e) {
            System.err.println(e);
        }
    }
}