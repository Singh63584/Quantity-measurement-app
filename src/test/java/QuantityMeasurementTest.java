import com.apps.Length;
import com.apps.LengthUnit;
import com.apps.QuantityMeasurement;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class QuantityMeasurementTest {

    private static final double ELIPSON = 1e-6;

    @Test
    void testConversion_FeetToInches() {
        double result = QuantityMeasurement.convert(1.0, LengthUnit.FEET, LengthUnit.INCHES);
        assertEquals(12.0, result, ELIPSON);
    }

    @Test
    void testConversion_InchesTooFeet() {
        double result = QuantityMeasurement.convert(18.0, LengthUnit.INCHES, LengthUnit.FEET);
        assertEquals(1.5, result, ELIPSON);
    }

    @Test
    void testConversion_YardToInches() {
        double result = QuantityMeasurement.convert(4.0, LengthUnit.YARD, LengthUnit.INCHES);
        assertEquals(144.0, result, ELIPSON);
    }

    @Test
    void testConversion_InchesToYard() {
        double result = QuantityMeasurement.convert(3.0, LengthUnit.YARD, LengthUnit.INCHES);
        assertEquals(108.0, result, ELIPSON);
    }
}