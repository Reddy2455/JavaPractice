package Day8;
import java.io.*;

import java.util.*;

public class CsvReader {
    public static void main(String[] args) {
        String file = "C:\\Users\\nagar\\OneDrive\\Documents\\names.csv";
        BufferedReader reader = null;
        String line = "";
        List<String[]> rows = new ArrayList<>();

        try {
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                rows.add(row);
            }

            // Sort the rows by last name
            Collections.sort(rows, new Comparator<String[]>() {
                @Override
                public int compare(String[] row1, String[] row2) {
                    String lastName1 = row1[1].trim(); // Assuming last name is in the second column (index 1)
                    String lastName2 = row2[1].trim();
                    return lastName1.compareTo(lastName2);
                }
            });

            // Print the sorted rows
            for (String[] row : rows) {
                for (String value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}



