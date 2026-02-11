import com.apps.Length;
import com.apps.QuantityMeasurement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

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
    void test_Compare_Equal_ConvertedUnits_YardCentimeter() {
        Length lengthA1 = new Length(1.0, Length.LengthUnit.YARD);
        Length lengthA2 = new Length(91.44, Length.LengthUnit.CENTIMETER);
        System.out.println(lengthA1);
        System.out.println(lengthA2);
//        Assertions.assertEquals(lengthA1,lengthA2, String.valueOf(0.01));
        assertTrue(lengthA1.compare(lengthA2));
        assertTrue(lengthA1.equals(lengthA2));
        assertTrue(lengthA2.equals(lengthA1));
    }

    @Test
    void testCompare_NotEqual_ConvertedUnits() {
        Length lengthB1 = new Length(1.0, Length.LengthUnit.FEET);
        Length lengthB2 = new Length(18.0, Length.LengthUnit.INCHES);
        Length lengthB3 = new Length(36.0, Length.LengthUnit.YARD);
        Length lengthB4 = new Length(0.393701, Length.LengthUnit.CENTIMETER);
        assertFalse(lengthB1.compare(lengthB2));
        assertFalse(lengthB1.equals(lengthB2));
        assertFalse(lengthB3.compare(lengthB4));
        assertFalse(lengthB3.equals(lengthB4));
    }

    @Test
    void testCompare_WithNull() {
        Length length = new Length(2.0, Length.LengthUnit.FEET);
        Length lengthA3 = new Length(36.0, Length.LengthUnit.YARD);
        Length lengthA4 = new Length(0.393701, Length.LengthUnit.CENTIMETER);
        assertFalse(length.compare(null));
        assertFalse(lengthA3.compare(null));
        assertFalse(lengthA4.compare(null));
    }

    @Test
    void testEquals_WithNull() {
        Length length = new Length(2.0, Length.LengthUnit.FEET);
        Length lengthA3 = new Length(36.0, Length.LengthUnit.YARD);
        Length lengthA4 = new Length(0.393701, Length.LengthUnit.CENTIMETER);
        assertFalse(length.equals(null));
        assertFalse(lengthA3.equals(null));
        assertFalse(lengthA4.equals(null));
    }

    @Test
    void testEquals_SameObject() {
        Length length = new Length(3.0, Length.LengthUnit.INCHES);
        Length lengthA3 = new Length(36.0, Length.LengthUnit.YARD);
        Length lengthA4 = new Length(0.393701, Length.LengthUnit.CENTIMETER);
        assertTrue(length.equals(length));
        assertTrue(lengthA3.equals(lengthA3));
        assertTrue(lengthA4.equals(lengthA4));
    }
}