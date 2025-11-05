package ProductManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService {
    private final String FILE_PATH = "products.dat";
    private List<Product> products;

    public ProductService() {
        products = FileUtil.readFromFile(FILE_PATH);
        if (products == null) {
            products = new ArrayList<>();
        }
    }

    public void addProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sản phẩm: ");
        String id = sc.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        String name = sc.nextLine();
        System.out.print("Nhập giá: ");
        double price = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nhập hãng sản xuất: ");
        String manufacturer = sc.nextLine();
        System.out.print("Nhập mô tả: ");
        String desc = sc.nextLine();

        Product p = new Product(id, name, price, manufacturer, desc);
        products.add(p);
        FileUtil.writeToFile(FILE_PATH, products);
    }

    public void showAll() {
        if (products.isEmpty()) {
            System.out.println(" Chưa có sản phẩm nào.");
        } else {
            products.forEach(System.out::println);
        }
    }

    public void searchById() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sản phẩm cần tìm: ");
        String id = sc.nextLine();
        boolean found = false;
        for (Product p : products) {
            if (p.getId().equalsIgnoreCase(id)) {
                System.out.println(" Kết quả tìm thấy: " + p);
                found = true;
                break;
            }
        }
        if (!found) System.out.println(" Không tìm thấy sản phẩm có mã: " + id);
    }
}
