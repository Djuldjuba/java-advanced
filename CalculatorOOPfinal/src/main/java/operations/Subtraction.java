package operations;

public class Subtraction implements Action {
    private int first;
    private int second;

    public Subtraction(int first, int second) {
        this.first = first;
        this.second = second;
    }
    @Override
    public int invoke() {
        return first - second;
    }
}
