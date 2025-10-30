package ByArrayList;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class ByArrayListTest {

    @Test
    public void testAddAndFindProduct() {
        ByArrayList manager = new ByArrayList();
        manager.addProduct(new Product(1, "Laptop", 15000000));

        Product found = manager.findByName("Laptop");
        assertNotNull(found);
        assertEquals(15000000.0, found.getPrice(),0.001);
    }

    @Test
    public void testUpdateProduct() {
        ByArrayList manager = new ByArrayList();
        manager.addProduct(new Product(1, "Tai nghe", 300000));

        boolean updated = manager.updateProduct(1, "Tai nghe Bluetooth", 500000);
        assertTrue(updated);

        Product found = manager.findByName("Tai nghe Bluetooth");
        assertNotNull(found);
        assertEquals(500000.0, found.getPrice(),0.001);
    }

    @Test
    public void testSortAscending() {
        ByArrayList manager = new ByArrayList();
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