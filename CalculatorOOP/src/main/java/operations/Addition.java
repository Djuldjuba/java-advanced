package operations;

public class Addition implements Action {

    @Override
    public double invoke(double first, double second) {
        return first + second;
    }
}
