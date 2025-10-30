package ByLinkedList;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ByLinkedList {
    private LinkedList<Product> products = new LinkedList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

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
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId() == id) {
                iterator.remove();
                return true;
            }
        }
        return false;
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

    public void displayAll() {
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public List<Product> getProducts() {
        return products;
    }
}
