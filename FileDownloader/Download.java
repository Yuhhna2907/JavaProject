package FileDownloader;

import java.io.IOException;

public interface Download {
    void download(String fileUrl,String destinationPath) throws IOException ;
}
