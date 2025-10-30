package ByLinkedList;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ByLinkedListTest {
    @Test
    public void testAddAndFindProduct() {
        ByLinkedList manager = new ByLinkedList();
        manager.addProduct(new Product(1, "Laptop", 15000000));

        Product found = manager.findByName("Laptop");
        assertNotNull(found);
        assertEquals(15000000, found.getPrice());
    }

    @Test
    public void testUpdateProduct() {
        ByLinkedList manager = new ByLinkedList();
        manager.addProduct(new Product(1, "Tai nghe", 300000));

        boolean updated = manager.updateProduct(1, "Tai nghe Bluetooth", 500000);
        assertTrue(updated);
        assertEquals(500000, manager.findByName("Tai nghe Bluetooth").getPrice());
    }

    @Test
    public void testSortAscending() {
        ByLinkedList manager = new ByLinkedList();
        manager.addProduct(new Product(1, "A", 300));
        manager.addProduct(new Product(2, "B", 100));
        manager.addProduct(new Product(3, "C", 200));

        manager.sortAscending();
        List<Product> sorted = manager.getProducts();

        assertEquals("B", sorted.get(0).getName());
        assertEquals("C", sorted.get(1).getName());
        assertEquals("A", sorted.get(2).getName());
    }
}