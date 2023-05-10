package Seminar_3;

public class Product3 {
    String name;
    String surname;
    Integer year;
    Integer page;

    public Product3(String name, String surname, Integer year, Integer page) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.page = page;
    }

    @Override
    public String toString() {
        return "Product3{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", page=" + page +
                '}';
    }
}
