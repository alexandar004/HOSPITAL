import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

public class PrintData {

public static void printData(List<String> list){

                for (String index : list) {
                    System.out.printf("%-10s", index);
                    System.out.println();
                }
            }
        }

