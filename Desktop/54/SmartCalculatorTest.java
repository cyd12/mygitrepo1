import org.junit.Test;
import static org.junit.Assert.*;

public class SmartCalculatorTest {

    @Test
    public void testCalculateSI() {
        SmartCalculator calculator = new SmartCalculator();
        double principal = 1000;
        double rate = 5;
        double time = 2;
        double expectedSI = 1000 * 5 * 2 / 100;
        assertEquals(expectedSI, calculator.calculateSI(principal, rate, time), 0.001);
    }

    @Test
    public void testCalculateCI() {
        SmartCalculator calculator = new SmartCalculator();
        double principal = 1000;
        double rate = 5;
        double time = 2;
        int n = 1;
        double expectedCI = 1000 * Math.pow((1 + 5 / 100), 1 * 2) - 1000;
        assertEquals(expectedCI, calculator.calculateCI(principal, rate, time, n), 0.001);
    }

    @Test
    public void testCalculateMean() {
        SmartCalculator calculator = new SmartCalculator();
        double[] numbers = {10, 20, 30, 40, 50};
        double expectedMean = (10 + 20 + 30 + 40 + 50) / 5;
        assertEquals(expectedMean, calculator.calculateMean(numbers), 0.001);
    }

    @Test
    public void testCalculateFactorial() {
        SmartCalculator calculator = new SmartCalculator();
        int number = 5;
        int expectedFactorial = 5 * 4 * 3 * 2 * 1;
        assertEquals(expectedFactorial, calculator.calculateFactorial(number));
    }

    @Test
    public void testCalculatePercentage() {
        SmartCalculator calculator = new SmartCalculator();
        double totalMarks = 500;
        double marksObtained = 450;
        double expectedPercentage = (450 / 500) * 100;
        assertEquals(expectedPercentage, calculator.calculatePercentage(totalMarks, marksObtained), 0.001);
    }
}
