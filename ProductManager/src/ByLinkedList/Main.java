package ByLinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Test với ArrayList ===");
        ByLinkedList manager = new ByLinkedList();
        manager.addProduct(new Product(1, "Chuột", 200000));
        manager.addProduct(new Product(2, "Bàn phím", 300000));
        manager.addProduct(new Product(3, "Màn hình", 2500000));

        manager.sortAscending();
        manager.displayAll();

        System.out.println("\n=== Test với LinkedList ===");
        ByLinkedList linkedListManager = new ByLinkedList();
        linkedListManager.addProduct(new Product(10, "Loa", 700000));
        linkedListManager.addProduct(new Product(11, "USB", 150000));
        linkedListManager.addProduct(new Product(12, "Tai nghe", 400000));

        linkedListManager.sortDescending();
        linkedListManager.displayAll();
    }
}
