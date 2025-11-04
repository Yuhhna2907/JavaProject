package ReadCsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CountryReader {
    public List<Country> readCountries(String filePath) {
        List<Country> countries = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) continue;

                String[] parts = line.split(",");

                int id = Integer.parseInt(parts[0].trim());
                String code = parts[1].replace("\"", "").trim();
                String name = parts[2].replace("\"", "").trim();

                countries.add(new Country(id, code, name));
            }
        } catch (IOException e) {
            System.out.println(" Lỗi khi đọc file: " + e.getMessage());
        }

        return countries;
    }
}
