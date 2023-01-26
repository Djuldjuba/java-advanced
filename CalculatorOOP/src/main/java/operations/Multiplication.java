package operations;

public class Multiplication implements Action {

    @Override
    public double invoke(double first, double second) {
        return first * second;
    }
}
