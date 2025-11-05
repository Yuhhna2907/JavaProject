package ProductManager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    public static <T> void writeToFile(String filePath, List<T> data) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(data);
            System.out.println(" Ghi dữ liệu thành công vào file " + filePath);
        } catch (IOException e) {
            System.err.println(" Lỗi khi ghi file: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> List<T> readFromFile(String filePath) {
        File file = new File(filePath);
        if (!file.exists())
            return new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            return (List<T>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println(" Lỗi khi đọc file: " + e.getMessage());
        }
        return new ArrayList<>();
    }
}
