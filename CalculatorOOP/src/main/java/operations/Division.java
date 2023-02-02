package operations;

public class Division implements Action {
    private int first;
    private int second;

    public Division(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int invoke() {
        if(second == 0) {
            throw new ArithmeticException("На ноль делить нельзя");
        } else {
            return first / second;
        }
    }
}
