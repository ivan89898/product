import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
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

    @BeforeEach
    public void setUp() {
        manager.add(product1);
        manager.add(product2);
        manager.add(product3);
        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);
        manager.add(smartphone2);
        Product product1 = new Product(11, "Айфон", 40);
        Product product2 = new Product(222, "Один", 200);
        Product product3 = new Product(3, "Книга", 67);
        Book book1 = new Book(12, "Хлеб", 45, "Иванов");
        Book book2 = new Book(222, "Один", 200, "Сидоров");
        Smartphone smartphone1 = new Smartphone(11, "Айфон", 40, "Apple");
        Smartphone smartphone2 = new Smartphone(56, "s", 999, "Apple");

    }

    @Test
    public void test() {
        ProductRepository repository = new ProductRepository();
        ProductManager manager = new ProductManager(repository);
        Product product1 = new Product(11, "Айфон", 40);
        Product product2 = new Product(222, "Один", 200);
        Product product3 = new Product(3, "Книга", 67);
        Book book1 = new Book(12, "Хлеб", 45, "Иванов");
        Book book2 = new Book(222, "Один", 200, "Сидоров");
        Smartphone smartphone1 = new Smartphone(11, "Айфон", 40, "Apple");
        Smartphone smartphone2 = new Smartphone(56, "s", 999, "Apple");

        manager.save(book1);
        manager.save(book2);
        manager.save(smartphone2);
        manager.removeById(12);
        Product[] expected = {book2, smartphone2};
        Product[] actual = repository.getProducts();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestFindAll() {
        manager.add(product1);
        manager.add(product2);
        manager.add(product3);
        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);
        manager.add(smartphone2);
        Product[] expected = {product1, product2, product3, book1, smartphone2};
        Product[] actual = repository.getProducts();
        Assertions.assertArrayEquals(expected, actual);
    }

}



