public class ProductRepository {
    private ProductRepository repository;
    private Product[] products = new Product[0];
    Product product1 = new Product(11, "Айфон", 40);
    Product product2 = new Product(222, "Один", 200);
    Product product3 = new Product(3, "Книга", 67);
    Book book1 = new Book(12, "Хлеб", 45, "Иванов");
    Book book2 = new Book(222, "Один", 200, "Сидоров");
    Smartphone smartphone1 = new Smartphone(11, "Айфон", 40, "Apple");
    Smartphone smartphone2 = new Smartphone(56, "s", 999, "Apple");

    public void save(Product product) {
        Product[] tmp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = product;
    }

    public void removeById(int id) {
        Product[] tmp = new Product[products.length - 1];
        int copyToIndex = 0;
        for (Product product :
                products) {
            if (product.getId() != id) {
                tmp[copyToIndex] = product;
                copyToIndex++;
            }
        }
        products = tmp;
    }


    public Product[] getProducts() {
        return products;
    }

    public Product[] findAll() {
        return products;
    }

    public void add(Product product) {
        repository.save(product);
    }


}
