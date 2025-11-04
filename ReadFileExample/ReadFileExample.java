package ReadFileExample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileExample {
    public void readFileText(String filePath){
        try {
            File file = new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader= new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println("The line is: " + line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println("Sum is: " + sum);
        } catch (Exception e) {
            System.out.println("File does not exist or the content is invalid/corrupted.");;
        }
    }
}
