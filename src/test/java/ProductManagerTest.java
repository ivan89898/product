import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ProductManagerTest {
    ProductRepository repository = new ProductRepository();
    ProductManager manager = new ProductManager(repository);
    Product product1 = new Product(11, "Айфон", 40);
    Product product2 = new Product(222, "Один", 200);
    Product product3 = new Product(3, "Книга", 67);
    Book book1 = new Book(12, "Хлеб", 45, "Иванов");
    Book book2 = new Book(222, "Один", 200, "Сидоров");
    Smartphone smartphone1 = new Smartphone(11, "Айфон", 40, "Apple");
    Smartphone smartphone2 = new Smartphone(56, "s", 999, "Apple");

    @Test
    public void testSearchByZero() {
        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone2);
        Product[] expected = {};
        Product[] actual = manager.searchBy("Григорьев");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSearchByOne() {
        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone2);
        Product[] expected = {smartphone2};
        Product[] actual = manager.searchBy("s");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSearchByTwo() {
        manager.add(product1);
        manager.add(smartphone1);
        Product[] expected = {product1, smartphone1};
        Product[] actual = manager.searchBy("Айфон");
        assertArrayEquals(expected, actual);
    }
}



