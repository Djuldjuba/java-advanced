package present;

public class Present {
    private String title;
    private int weight;
    private int price;

    public Present(String title, int weight, int price) {
        this.title = title;
        this.weight = weight;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Название - " + title + "\n" +
                "Вес - " + weight + "\n" +
                "Цена - " + price;
    }
}
