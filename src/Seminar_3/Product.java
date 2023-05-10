package Seminar_3;

public class Product {
    String name;
    String sort;
    Integer price;

    public Product(String name, String sort, Integer price) {
        this.name = name;
        this.sort = sort;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", sort='" + sort + '\'' +
                ", price=" + price +
                '}';
    }
}
