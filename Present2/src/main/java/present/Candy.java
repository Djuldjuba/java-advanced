package present;

public class Candy extends Present {
    private String color;

    public Candy(String title, int weight, int price, String color) {
        super(title, weight, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Цвет - " + color;
    }
}
