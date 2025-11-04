package FindMaxValue;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile (String filePath) {
        List<Integer> list = new ArrayList<>();
        try {
            File file = new File("numbers.txt");
            if (!file.exists()) {
                throw  new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null) {
                list.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.out.println("File does not exist or the content is invalid/corrupted.");
        }
        return list;
    }
    public void writeFile(String filePath, int maxValue) {
        try {
            FileWriter writer = new FileWriter(filePath,true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("The maximum value is " + maxValue);
            bufferedWriter.newLine();
            bufferedWriter.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
