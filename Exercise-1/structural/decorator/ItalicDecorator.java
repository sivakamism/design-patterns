public class ItalicDecorator extends TextDecorator {
    public ItalicDecorator(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public void display() {
        System.out.print("<i>");
        super.display();
        System.out.print("</i> ");
    }
}
