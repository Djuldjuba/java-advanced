import operations.Addition;
import operations.Division;
import operations.Multiplication;
import operations.Subtraction;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    @Test
    @DisplayName("проверка сложения")
    public void operationAdditionTest() {
        String message = "сложение работает неверно";
        Addition additionTwoPositive = new Addition(1, 2);
        Addition additionOneZero = new Addition(0, 5);
        Addition additionOneNegative = new Addition(-1, 5);
        Addition additionTwoNegative = new Addition(-5, -2);
        Addition additionTwoZero = new Addition(0, 0);
        assertAll(
                () -> assertEquals(additionTwoPositive.invoke(), 3, message),
                () -> assertEquals(additionOneZero.invoke(), 5, message),
                () -> assertEquals(additionOneNegative.invoke(), 4, message),
                () -> assertEquals(additionTwoNegative.invoke(), -7, message),
                () -> assertEquals(additionTwoZero.invoke(), 0, message)
        );
    }

    @Test
    @DisplayName("проверка вычитания")
    public void operationSubtractionTest() {
        String message = "вычитание работает неверно";
        Subtraction subtractionTwoPositive = new Subtraction(1, 2);
        Subtraction subtractionFirstZero = new Subtraction(0, 5);
        Subtraction subtractionSecondZero = new Subtraction(5, 0);
        Subtraction subtractionFirstNegative = new Subtraction(-1, 5);
        Subtraction subtractionSecondNegative = new Subtraction(1, -5);
        Subtraction subtractionTwoNegative = new Subtraction(-5, -2);
        Subtraction subtractionTwoZero = new Subtraction(0, 0);
        assertAll(
                () -> assertEquals(subtractionTwoPositive.invoke(), -1, message),
                () -> assertEquals(subtractionFirstZero.invoke(), -5, message),
                () -> assertEquals(subtractionSecondZero.invoke(), 5, message),
                () -> assertEquals(subtractionFirstNegative.invoke(), -6, message),
                () -> assertEquals(subtractionSecondNegative.invoke(), 6, message),
                () -> assertEquals(subtractionTwoNegative.invoke(), -3, message),
                () -> assertEquals(subtractionTwoZero.invoke(), 0, message)
        );
    }

    @Test
    @DisplayName("проверка умножения")
    public void operationMultiplicationTest() {
        String message = "умножение работает неверно";
        Multiplication multiplicationTwoPositive = new Multiplication(1, 2);
        Multiplication multiplicationOneZero = new Multiplication(0, 5);
        Multiplication multiplicationOneNegative = new Multiplication(-1, 5);
        Multiplication multiplicationTwoNegative = new Multiplication(-5, -2);
        Multiplication multiplicationTwoZero = new Multiplication(0, 0);
        assertAll(
                () -> assertEquals(multiplicationTwoPositive.invoke(), 2, message),
                () -> assertEquals(multiplicationOneZero.invoke(), 0, message),
                () -> assertEquals(multiplicationOneNegative.invoke(), -5, message),
                () -> assertEquals(multiplicationTwoNegative.invoke(), 10, message),
                () -> assertEquals(multiplicationTwoZero.invoke(), 0, message)
        );
    }

    @Test
    @DisplayName("проверка деления")
    public void operationDivisionTest() {
        String message = "деление работает неверно";
        Division divisionTwoPositive = new Division(5, 2);
        Division divisionFirstZero = new Division(0, 5);
        Division divisionFirstNegative = new Division(-10, 5);
        Division divisionSecondNegative = new Division(5, -5);
        Division divisionTwoNegative = new Division(-7, -2);
        assertAll(
                () -> assertEquals(divisionTwoPositive.invoke(), 2, message),
                () -> assertEquals(divisionFirstZero.invoke(), 0, message),
                () -> assertEquals(divisionFirstNegative.invoke(), -2, message),
                () -> assertEquals(divisionSecondNegative.invoke(), -1, message),
                () -> assertEquals(divisionTwoNegative.invoke(), 3, message)
        );
    }

    @Test
    @DisplayName("проверка деления на ноль")
    public void operationDivisionOnZeroTest() throws ArithmeticException {
        Division divisionSecondZero = new Division(5, 0);
        Throwable thrown = assertThrows(ArithmeticException.class, () -> divisionSecondZero.invoke());
        assertNotNull(thrown.getMessage(), "не отловлено исключение \"делить на ноль нельзя\"");
    }
}
