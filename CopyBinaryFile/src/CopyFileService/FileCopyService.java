package CopyFileService;

import java.io.*;

public class FileCopyService {
    public void copyFile(String sourcePath, String destPath) {
        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        if (!sourceFile.exists()) {
            System.out.println(" Tệp nguồn không tồn tại!");
            return;
        }

        if (destFile.exists()) {
            System.out.println(" Tệp đích đã tồn tại. Hãy chọn tên khác!");
            return;
        }

        // Thực hiện copy
        try (InputStream inputStream = new FileInputStream(sourceFile);
             OutputStream outputStream = new FileOutputStream(destFile)) {

            byte[] buffer = new byte[1024]; // bộ đệm
            int bytesRead;
            int totalBytes = 0;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
                totalBytes += bytesRead;
            }

            System.out.println(" Sao chép hoàn tất!");
            System.out.println(" Tổng số byte đã sao chép: " + totalBytes);

        } catch (IOException e) {
            System.out.println(" Lỗi khi sao chép file: " + e.getMessage());
        }
    }
}
