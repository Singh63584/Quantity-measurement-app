/*
    Authur : Deepak Singh
    EmpId : 20655873
*/

package com.apps;

public class QuantityMeasurement {
    public static double convert(double value, LengthUnit baseUnit, LengthUnit targetUnit) {
        double inches = baseUnit.toInches(value);
        return targetUnit.fromInches(inches);
    }

    public static void main(String[] args) {
        Length feet = new Length(1.5, LengthUnit.FEET);
        Length inches = feet.convertToBaseUnit(LengthUnit.INCHES);
        System.out.println("Are lengths convert to inches : " + inches);
        System.out.println(convert(4.0, LengthUnit.YARD, LengthUnit.FEET));
    }
}
