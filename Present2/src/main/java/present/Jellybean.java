package present;

public class Jellybean extends Present {
    private String taste;

    public Jellybean(String title, int weight, int price, String taste) {
        super(title, weight, price);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Вкус - " + taste;
    }
}
