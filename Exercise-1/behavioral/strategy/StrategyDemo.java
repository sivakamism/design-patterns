public class StrategyDemo {
    public static void main(String[] args) {
        ShippingContext context = new ShippingContext();

        context.setStrategy(new StandardShipping());
        context.calculateShipping(10); 

        context.setStrategy(new ExpressShipping());
        context.calculateShipping(5);

        context.setStrategy(new FreeShipping());
        context.calculateShipping(15);
    }
}
