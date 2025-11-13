package FileCalculator;

public class Client {
    public FileCalculator fileCalculator;

    public Client(FileCalculator fileCalculator) {
        this.fileCalculator = fileCalculator;
    }

    public void printFileSize(String path){
        long size = fileCalculator.calculateSize(path);
        System.out.println("Size: " + size);
    }
}
