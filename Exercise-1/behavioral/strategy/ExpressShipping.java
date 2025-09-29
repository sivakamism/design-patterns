public class ExpressShipping implements ShippingStrategy {
    @Override
    public double calculate(double weight) {
        return weight * 2.5; 
    }
}
