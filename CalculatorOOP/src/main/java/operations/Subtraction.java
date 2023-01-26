package operations;

public class Subtraction implements Action {

    @Override
    public double invoke(double first, double second) {
        return first - second;
    }
}
