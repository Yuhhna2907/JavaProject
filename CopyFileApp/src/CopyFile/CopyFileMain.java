package CopyFile;

public class CopyFileMain {
    public static void main(String[] args) {
        String sourcePath = InputHelper.getInput("Nhập đường dẫn tệp nguồn: ");
        String targetPath = InputHelper.getInput("Nhập đường dẫn tệp đích: ");

        try {
            int copiedChars = FileCopier.copyFile(sourcePath, targetPath);
            System.out.println("Sao chép thành công!");
            System.out.println("Tổng số ký tự đã sao chép: " + copiedChars);
        } catch (Exception e) {
            System.out.println(" Lỗi: " + e.getMessage());
        }
    }
}
