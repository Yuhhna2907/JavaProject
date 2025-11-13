package FileDownloader;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class FileDownloader implements Download {
    private  String userAgent;

    public FileDownloader(String userAgent) {
        this.userAgent = userAgent;
    }


    @Override
    public void download(String fileUrl, String destinationPath) throws IOException {
        try {
            URL url = new URL(fileUrl);
            URLConnection urlConnection = url.openConnection();
            urlConnection.setRequestProperty("User-Agent", userAgent);

            System.out.println("Connecting to " + url.getHost());
            System.out.println("Using User-Agent: " + userAgent);

            try (InputStream inputStream = urlConnection.getInputStream()) {
                FileOutputStream outputStream = new FileOutputStream(destinationPath);
                byte[] buffer = new byte [4096];
                int bytesRead;
                System.out.println("Downloading " + fileUrl);
                while ((bytesRead = inputStream.read(buffer))!=1){
                    outputStream.write(buffer,0,bytesRead);
                }
                System.out.println("File download complete");
            }
        } catch (IOException e){
            System.out.println("Error downloading file" + e.getMessage());
        }
    }
}
