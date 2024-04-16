package a2.calculator.unittesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RaihanTest {
    @Test
    public void testAdd() {
        assertEquals(4.0, Calculator.add(2.0, 2.0));
        assertEquals(-3.0, Calculator.add(-5.0, 2.0));
        assertEquals(0.0, Calculator.add(0.0, 0.0));
    }
}
