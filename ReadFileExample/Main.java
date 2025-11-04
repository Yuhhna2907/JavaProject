package ReadFileExample;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the file path:");
        Scanner input = new Scanner(System.in);
        String filePath = input.nextLine();

        ReadFileExample readFile = new ReadFileExample();
        readFile.readFileText(filePath);
    }
}
