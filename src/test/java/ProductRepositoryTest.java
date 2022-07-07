import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ProductRepositoryTest {
    ProductRepository repository = new ProductRepository();
    Product product1 = new Product(11, "Айфон", 40);
    Product product2 = new Product(222, "Один", 200);
    Product product3 = new Product(3, "Книга", 67);
    Book book1 = new Book(12, "Хлеб", 45, "Иванов");
    Book book2 = new Book(222, "Один", 200, "Сидоров");
    Smartphone smartphone1 = new Smartphone(11, "Айфон", 40, "Apple");
    Smartphone smartphone2 = new Smartphone(56, "s", 999, "Apple");

    @Test
    public void testRemoveById() {

        repository.save(product1);
        repository.save(product2);
        repository.save(product3);
        repository.removeById(222);

        Product[] expected = {product1, product3};
        Product[] actual = repository.getProducts();

        Assertions.assertArrayEquals(expected, actual);
    }
}

