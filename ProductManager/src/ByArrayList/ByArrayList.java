package ByArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ByArrayList {
    private final List<Product> products = new ArrayList<>();

    // Thêm sản phẩm
    public void addProduct(Product product) {
        products.add(product);
    }

    // Sửa sản phẩm theo id
    public boolean updateProduct(int id, String newName, double newPrice) {
        for (Product p : products) {
            if (p.getId() == id) {
                p.setName(newName);
                p.setPrice(newPrice);
                return true;
            }
        }
        return false;
    }

    // Xóa sản phẩm theo id
    public boolean removeProduct(int id) {
        return products.removeIf(p -> p.getId() == id);
    }

    // Tìm theo tên
    public Product findByName(String name) {
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    // Sắp xếp tăng dần theo giá
    public void sortAscending() {
        products.sort(Comparator.comparingDouble(Product::getPrice));
    }

    // Sắp xếp giảm dần theo giá
    public void sortDescending() {
        products.sort((p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice()));
    }

    // Hiển thị danh sách
    public void displayAll() {
        for (Product p : products) {
            System.out.println(p);
        }
    }

    // Lấy danh sách (phục vụ test)
    public List<Product> getProducts() {
        return products;
    }
}
