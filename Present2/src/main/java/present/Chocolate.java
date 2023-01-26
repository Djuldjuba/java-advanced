package present;

public class Chocolate extends Present {
    private int cocoa;

    public Chocolate(String title, int weight, int price, int cocoa) {
        super(title, weight, price);
        this.cocoa = cocoa;
    }

    public int getCocoa() {
        return cocoa;
    }

    public void setCocoa(int cocoa) {
        this.cocoa = cocoa;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Процент какао - " + cocoa;
    }
}
