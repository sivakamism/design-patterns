public class ObserverDemo {
    public static void main(String[] args) {
        Stock apple = new Stock("APPLE", 150);
        
        ConcreteInvestor investor1 = new ConcreteInvestor("Alice");
        ConcreteInvestor investor2 = new ConcreteInvestor("Bob");
        
        apple.addInvestor(investor1);
        apple.addInvestor(investor2);

        apple.setPrice(155);
        apple.setPrice(160);
    }
}
