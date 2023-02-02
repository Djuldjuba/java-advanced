package operations;

public class Multiplication implements Action {
    private int first;
    private int second;

    public Multiplication(int first, int second) {
        this.first = first;
        this.second = second;
    }
    @Override
    public int invoke() {
        return first * second;
    }
}
