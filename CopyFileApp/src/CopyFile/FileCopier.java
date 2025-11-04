package CopyFile;

import java.io.*;

public class FileCopier {
    public static int copyFile(String sourcePath, String targetPath) throws IOException {
        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);

        // Kiểm tra file nguồn
        if (!sourceFile.exists()) {
            throw new FileNotFoundException("Tệp nguồn không tồn tại: " + sourcePath);
        }

        // Kiểm tra file đích đã tồn tại
        if (targetFile.exists()) {
            throw new IOException("Tệp đích đã tồn tại: " + targetPath);
        }

        int count = 0;
        try (
                FileReader fileReader = new FileReader(sourceFile);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                FileWriter fileWriter = new FileWriter(targetFile);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            int c;
            while ((c = bufferedReader.read()) != -1) {
                bufferedWriter.write(c);
                count++;
            }
        }
        return count;
    }
}
