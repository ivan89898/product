import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
        repository.add(product1);
        repository.add(product2);
        repository.add(product3);
        Product[] expected = {product1, product3};
        Product[] actual = repository.removeById(222);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindAll() {
        repository.add(product1);
        repository.add(product2);
        repository.add(product3);
        Product[] expected = {product1, product2, product3};
        Product[] actual = repository.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testSetId() {
        Product product4 = new Product(22, "Айфон", 450);
        product4.setId(222);
        int expected = 222;
        int actual = product4.getId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetName() {
        Product product4 = new Product(22, "Айфон", 450);
        product4.setName("Айфон");
        String expected = "Айфон";
        String actual = product4.getName();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetPrice() {
        Product product4 = new Product(22, "Айфон", 450);
        product4.setPrice(450);
        int expected = 450;
        int actual = product4.getPrice();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetAuthor() {
        Book book4 = new Book(22, "Айфон", 450, "Пушкин");
        book4.setAuthor("Пушкин");
        String expected = "Пушкин";
        String actual = book4.getAuthor();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetProducer() {
        Smartphone smartphone4 = new Smartphone(22, "Айфон", 450, "Пушкин");
        smartphone4.setProducer("Пушкин");
        String expected = "Пушкин";
        String actual = smartphone4.getProducer();
        Assertions.assertEquals(expected, actual);
    }
}

