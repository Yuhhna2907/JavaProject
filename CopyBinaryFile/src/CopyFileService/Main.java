package CopyFileService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        FileCopyService service = new FileCopyService();
        String basePath = "C:\\Users\\DELL 7440\\IdeaProjects\\Yuhhna2907\\CopyBinaryFile\\";

        System.out.print("Nhập đường dẫn file nguồn: ");
        String sourcePath = in.nextLine();

        System.out.print("Nhập đường dẫn file đích: ");
        String destPath = in.nextLine();

        service.copyFile(sourcePath, destPath);
    }
}