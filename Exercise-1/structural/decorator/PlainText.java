public class PlainText implements Text {
    private String content;

    public PlainText(String content) {
        this.content = content;
    }

    @Override
    public void display() {
        System.out.println(content);
    }
}
