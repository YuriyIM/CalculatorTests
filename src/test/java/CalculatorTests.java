import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CalculatorTests {
    Calculator sut;

    @BeforeEach
    public void init() {
        sut = new Calculator();
    }

    @Test
    public void testLinearEquation() {
        //arrange
        int a = -2, b = 6;
        long expected = 3;

        //act
        long result = sut.linearEquation(a, b);

        Assertions.assertEquals(result, expected);
    }

    @Test
    public void testDiscriminant() {
        int a = -1, b = 7, c = 8;
        long expected = 81;
        Calculator sut = new Calculator();

        long result = sut.discriminant(a, b, c);

        Assertions.assertEquals(result, expected);
    }

    @Test
    public void testQuadraticEquation () {
        int a = -1, b = 7, c = 8;
        long d = 81;
        long expected = -1;
        Calculator sut = new Calculator();

        ArrayList<Long> list = sut.quadraticEquation(a, b, c, d);
        long result = list.get(0);

        Assertions.assertEquals(result, expected);
    }
}
