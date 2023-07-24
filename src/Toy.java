public class Toy {
    private int id;
    private String name;
    private double price;
    private double weight;

    public Toy(int id, String name, double price, double weight) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight(){
        return weight;
    }

    @Override
    public String toString() {
        return "Toy [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
}


