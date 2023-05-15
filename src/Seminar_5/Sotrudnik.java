package Seminar_5;

public class Sotrudnik {
    String name;
    String family;
    Integer numbers;

    public Sotrudnik(String name, String family, Integer numbers) {
        this.name = name;
        this.family = family;
    }

    @Override
    public String toString() {
        return "Sotrudnik{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                '}';
    }

    public Sotrudnik(String name, String family) {
        this.name = name;
        this.family = family;
    }
}
