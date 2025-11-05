package CopyFileService;

import java.io.FileOutputStream;
import java.io.IOException;

public class CreateBinaryFile {
    public static void main(String[] args) {
        String path = "C:\\Users\\DELL 7440\\IdeaProjects\\Yuhhna2907\\CopyBinaryFile\\source.bin";
        try (FileOutputStream out = new FileOutputStream(path)) {
            for (int i = 0; i < 26; i++) {
                out.write(i + 65);
            }
            System.out.println("File source.bin đã được tạo!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
