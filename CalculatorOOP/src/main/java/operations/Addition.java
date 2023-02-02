package operations;

public class Addition implements Action {
    private int first;
    private int second;

    public Addition(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int invoke() {
        return first + second;
    }
}
