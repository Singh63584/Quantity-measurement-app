import UC2.QuantityMeasurement;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class QuantityMeasurementTest {

    @Test
    void feet_equals_sameInstance() {
        QuantityMeasurement.Feet f = new QuantityMeasurement.Feet(3);
        assertTrue(f.equals(f));
    }
    @Test
    void feet_equals_sameValue_DifferentInstance() {
        QuantityMeasurement.Feet f1 = new QuantityMeasurement.Feet(5);
        QuantityMeasurement.Feet f2 = new QuantityMeasurement.Feet(5);
        assertTrue(f1.equals(f2));
        assertTrue(f2.equals(f1));
    }
    @Test
    void feet_notEquals_differentValue() {
        QuantityMeasurement.Feet f1 = new QuantityMeasurement.Feet(4);
        QuantityMeasurement.Feet f2 = new QuantityMeasurement.Feet(7);
        assertFalse(f1.equals(f2));
    }
    @Test
    void feet_notEquals_nullOrDifferentType() {
        QuantityMeasurement.Feet f = new QuantityMeasurement.Feet(2);
        assertFalse(f.equals(null));
        assertFalse(f.equals(new Object()));
    }
    @Test
    void check_FeetEquality_staticMethod() {
        assertTrue(QuantityMeasurement.checkFeetEquality(10, 10));
        assertFalse(QuantityMeasurement.checkFeetEquality(10, 11));
    }
    @Test
    void inch_equals_sameInstance() {
        QuantityMeasurement.Inch i = new QuantityMeasurement.Inch(10.4);
        assertTrue(i.equals(i));
    }
    @Test
    void inch_equals_sameValueDifferentInstance() {
        QuantityMeasurement.Inch i1 = new QuantityMeasurement.Inch(12.75);
        QuantityMeasurement.Inch i2 = new QuantityMeasurement.Inch(12.75);
        assertTrue(i1.equals(i2));
        assertTrue(i2.equals(i1));
    }
    @Test
    void inch_notEquals_differentValue() {
        QuantityMeasurement.Inch i1 = new QuantityMeasurement.Inch(10.4);
        QuantityMeasurement.Inch i2 = new QuantityMeasurement.Inch(11.9);
        assertFalse(i1.equals(i2));
    }
    @Test
    void inch_notEquals_nullOrDifferentType() {
        QuantityMeasurement.Inch i = new QuantityMeasurement.Inch(5.5);
        assertFalse(i.equals(null));
        assertFalse(i.equals(new Object()));
    }
    @Test
    void checkInchesEquality_staticMethod() {
        assertTrue(QuantityMeasurement.checkInchesEquality(6.25, 6.25));
        assertFalse(QuantityMeasurement.checkInchesEquality(6.25, 6.26));
    }
}