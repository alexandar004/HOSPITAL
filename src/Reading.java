import java.io.BufferedReader;
import java.io.FileReader;
public class Reading {

public static void reading(){
        String file = "src\\TestCSV.csv";
        String line = "";

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while ((line = reader.readLine()) != null) {

                String[] row = line.split(",");

                for (String index : row) {
                    System.out.printf("%-10s", index);
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
}
}
