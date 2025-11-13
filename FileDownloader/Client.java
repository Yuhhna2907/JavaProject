package FileDownloader;

import java.io.IOException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileDownloaderProxy downloader = new FileDownloaderProxy();

        System.out.println("=== File Downloader App (Proxy Pattern Demo) ===");
        System.out.print("Nhập URL file cần tải: ");
        String url = scanner.nextLine();

        System.out.print("Nhập đường dẫn lưu file (ví dụ: D:/test/file.txt): ");
        String destination = scanner.nextLine();

        downloader.download(url, destination);
        scanner.close();
    }
}
