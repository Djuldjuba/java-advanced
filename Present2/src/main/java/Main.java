import present.Candy;
import present.Chocolate;
import present.Jellybean;
import present.Present;

public class Main {
    public static void main(String[] args) {
        Chocolate ritterSport = new Chocolate("Ritter Sport", 100, 150, 70);
        Candy raffaello = new Candy("Rafaello", 100, 250, "white");
        Jellybean mamba = new Jellybean("Mamba", 50, 50, "Apple");
        Present[] present = {ritterSport, raffaello, mamba};
        int totalSum = 0;
        int totalWeight = 0;
        for (Present value : present) {
            totalSum += value.getPrice();
            totalWeight += value.getWeight();
        }
        System.out.println("Общая стоимость подарка: " + totalSum);
        System.out.println("Общая масса подарка: " + totalWeight);
        for (Present somePresents : present) {
            System.out.println(somePresents.toString());
        }
    }
}
