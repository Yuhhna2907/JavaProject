package ReadCsv;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CountryReader reader = new CountryReader();
        List<Country> countryList = reader.readCountries("C:\\Users\\DELL 7440\\IdeaProjects\\Yuhhna2907\\ReadCSVApp\\countries.csv.txt");

        System.out.println(" Danh sách các quốc gia:");
        for (Country c : countryList) {
            System.out.println(c);
        }
    }
}
