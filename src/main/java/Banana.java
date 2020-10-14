public class Banana implements Fruit {
    double price=0;

    public Banana(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
