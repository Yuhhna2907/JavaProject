package FileDownloader;

import java.io.IOException;

public class FileDownloaderProxy implements Download {

    @Override
    public void download(String fileUrl, String destinationPath) throws IOException {
        String firefoxUserAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:89.0) Gecko/20100101 Firefox/89.0";
        FileDownloader realDownloader = new FileDownloader(firefoxUserAgent);

        System.out.println(" Proxy: forwarding download request to FileDownloader...");
        realDownloader.download(fileUrl, destinationPath);
    }
}
