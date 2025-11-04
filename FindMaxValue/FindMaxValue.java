package FindMaxValue;

import java.util.ArrayList;
import java.util.List;

public class FindMaxValue {
    public static int findMaxValue(List<Integer> numbers) {
        int maxValue = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (maxValue < numbers.get(i)) {
                maxValue = numbers.get(i);
            }
        }
        return maxValue;
    }
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("");
        int maxValue = findMaxValue(numbers);
        readAndWriteFile.writeFile("numbers.txt", maxValue);
    }
}
