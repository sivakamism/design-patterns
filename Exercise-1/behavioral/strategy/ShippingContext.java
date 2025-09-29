public class ShippingContext {
    private ShippingStrategy strategy;

    public void setStrategy(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    public void calculateShipping(double weight) {
        System.out.println("Shipping cost: $" + strategy.calculate(weight));
    }
}
