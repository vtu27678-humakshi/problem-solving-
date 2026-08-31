import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        return a / b;
    }
}

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(10, calc.add(5, 5));
    }

    @Test
    void testSubtract() {
        assertEquals(5, calc.subtract(10, 5));
    }

    @Test
    void testMultiply() {
        assertEquals(25, calc.multiply(5, 5));
    }

    @Test
    void testDivide() {
        assertEquals(5, calc.divide(10, 2));
    }
}

INPUT
Enter first number: 20
Enter second number: 5

OUTPUT
Addition = 25
Subtraction = 15
Multiplication = 100
Division = 4

Unit Testing:
Addition Test: PASS
Subtraction Test: PASS
Multiplication Test: PASS
Division Test: PASS