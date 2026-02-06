import com.apps.Length;
import com.apps.QuantityMeasurement;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class QuantityMeasurementTest {

    @Test
    void test_Compare_Equal_ConvertedUnits() {
        Length lengthA1 = new Length(1.5, Length.LengthUnit.FEET);
        Length lengthA2 = new Length(18.0, Length.LengthUnit.INCHES);
        assertTrue(lengthA1.compare(lengthA2));
        assertTrue(lengthA1.equals(lengthA2));
        assertTrue(lengthA2.equals(lengthA1));
    }

    @Test
    void testCompare_NotEqual_ConvertedUnits() {
        Length lengthB1 = new Length(1.0, Length.LengthUnit.FEET);
        Length lengthB2 = new Length(18.0, Length.LengthUnit.INCHES);
        assertFalse(lengthB1.compare(lengthB2));
        assertFalse(lengthB1.equals(lengthB2));
    }

    @Test
    void testCompare_WithNull() {
        Length length = new Length(2.0, Length.LengthUnit.FEET);
        assertFalse(length.compare(null));
    }

    @Test
    void testEquals_WithNull() {
        Length length = new Length(2.0, Length.LengthUnit.FEET);
        assertFalse(length.equals(null));
    }

    @Test
    void testEquals_SameObject() {
        Length length = new Length(3.0, Length.LengthUnit.INCHES);
        assertTrue(length.equals(length));
    }
}