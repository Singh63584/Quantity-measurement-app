
import org.apps.FeetInchMeasurementQuantity;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FeetInchMeasurementQuantityTest {

    @Test
    void feet_equals_sameInstance() {
        FeetInchMeasurementQuantity.Feet f = new FeetInchMeasurementQuantity.Feet(3);
        assertTrue(f.equals(f));
    }
    @Test
    void feet_equals_sameValueDifferentInstance() {
        FeetInchMeasurementQuantity.Feet f1 = new FeetInchMeasurementQuantity.Feet(5);
        FeetInchMeasurementQuantity.Feet f2 = new FeetInchMeasurementQuantity.Feet(5);
        assertTrue(f1.equals(f2));
        assertTrue(f2.equals(f1));
    }
    @Test
    void feet_notEquals_differentValue() {
        FeetInchMeasurementQuantity.Feet f1 = new FeetInchMeasurementQuantity.Feet(4);
        FeetInchMeasurementQuantity.Feet f2 = new FeetInchMeasurementQuantity.Feet(7);
        assertFalse(f1.equals(f2));
    }
    @Test
    void feet_notEquals_nullOrDifferentType() {
        FeetInchMeasurementQuantity.Feet f = new FeetInchMeasurementQuantity.Feet(2);
        assertFalse(f.equals(null));
        assertFalse(f.equals(new Object()));
    }
    @Test
    void checkFeetEquality_staticMethod() {
        assertTrue(FeetInchMeasurementQuantity.checkFeetEquality(10, 10));
        assertFalse(FeetInchMeasurementQuantity.checkFeetEquality(10, 11));
    }
    @Test
    void inch_equals_sameInstance() {
        FeetInchMeasurementQuantity.Inch i = new FeetInchMeasurementQuantity.Inch(10.4);
        assertTrue(i.equals(i));
    }
    @Test
    void inch_equals_sameValueDifferentInstance() {
        FeetInchMeasurementQuantity.Inch i1 = new FeetInchMeasurementQuantity.Inch(12.75);
        FeetInchMeasurementQuantity.Inch i2 = new FeetInchMeasurementQuantity.Inch(12.75);
        assertTrue(i1.equals(i2));
        assertTrue(i2.equals(i1));
    }
    @Test
    void inch_notEquals_differentValue() {
        FeetInchMeasurementQuantity.Inch i1 = new FeetInchMeasurementQuantity.Inch(10.4);
        FeetInchMeasurementQuantity.Inch i2 = new FeetInchMeasurementQuantity.Inch(11.9);
        assertFalse(i1.equals(i2));
    }
    @Test
    void inch_notEquals_nullOrDifferentType() {
        FeetInchMeasurementQuantity.Inch i = new FeetInchMeasurementQuantity.Inch(5.5);
        assertFalse(i.equals(null));
        assertFalse(i.equals(new Object()));
    }
    @Test
    void checkInchesEquality_staticMethod() {
        assertTrue(FeetInchMeasurementQuantity.checkInchesEquality(6.25, 6.25));
        assertFalse(FeetInchMeasurementQuantity.checkInchesEquality(6.25, 6.26));
    }
}