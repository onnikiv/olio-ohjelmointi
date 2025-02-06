package task01;
import java.io.*;
import java.net.*;

public class Main {

    final static String HALUTTUPVM = "01.01.2023";
    public static void main(String[] args) {

        try {
            URL myUrl = new URL("https://users.metropolia.fi/~jarkkov/temploki.csv");

            InputStream istream = myUrl.openStream();
            InputStreamReader istreamreader = new InputStreamReader(istream);
            BufferedReader reader = new BufferedReader(istreamreader);

            String line;
            boolean header = true;  
            double kaikkilämmöt = 0;
            int lämpöjenMäärä = 0;

            while ((line = reader.readLine()) != null) {
                // eka rivi "hypätään yli"
                if (header) {
                    header = false; 
                } else {
                    String[] columns = line.split(";");
                    if (columns[0].trim().contains(HALUTTUPVM)) {
                        System.out.println(columns[0].trim() + ": " + columns[1]);
                        // lisätään yhteen muuttujaan, pilkku muutetaan pisteeksi, koska koska -> napataan arvo ja muutetaan doubleksi.
                        kaikkilämmöt += Double.parseDouble(columns[1].trim().replace(",", "."));
                        lämpöjenMäärä++;
                    }
                }
            }

            double averageTemperatyyri = kaikkilämmöt / lämpöjenMäärä;
            System.out.println("\nPVM: " + HALUTTUPVM);
            System.out.printf("Keskiarvollinen lämpötila : %.2f%n", averageTemperatyyri);

            reader.close();

        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
