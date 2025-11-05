package CopyFileService;
import java.io.File;


public class FileValidator {
    public static boolean isValidSource(String path) {
        File file = new File(path);
        return file.exists() && file.isFile();
    }

    public static boolean canCreateTarget(String path) {
        File file = new File(path);
        return !file.exists();
    }
}
