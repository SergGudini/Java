package Seminar_3;

public class Product2 {
    String name;
    String country;
    Integer weight;
    Integer price;
    String sort;

    public Product2(String name, String country, Integer weight, Integer price, String sort) {
        this.name = name;
        this.country = country;
        this.weight = weight;
        this.price = price;
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Product2{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", sort='" + sort + '\'' +
                '}';
    }
}
