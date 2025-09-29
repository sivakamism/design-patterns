public class DecoratorDemo {
    public static void main(String[] args) {
        Text myText = new PlainText("Hello, World!");

        Text boldText = new BoldDecorator(myText);
        Text italicText = new ItalicDecorator(boldText);
        Text underlineText = new UnderlineDecorator(italicText);

        underlineText.display();
    }
}
