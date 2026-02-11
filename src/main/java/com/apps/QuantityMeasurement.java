/*
    Authur : Deepak Singh
    EmpId : 20655873
*/

package com.apps;

public class QuantityMeasurement {

    public static void main(String[] args) {
        Length lengthA1 = new Length(1.5, Length.LengthUnit.FEET);
        Length lengthA2 = new Length(18.0, Length.LengthUnit.INCHES);
        System.out.println("Are lengths equal (1.5 ft vs 18 in)? : " + lengthA1.equals(lengthA2));

        Length lengthB1 = new Length(1.0, Length.LengthUnit.YARD);
        Length lengthB2 = new Length(18.0, Length.LengthUnit.INCHES);
        System.out.println("Are lengths equal (1.0 ft vs 18 in)? : " + lengthB1.equals(lengthB2));

        Length lengthC1 = new Length(100.0, Length.LengthUnit.CENTIMETER);
        Length lengthC2 = new Length(39.3701, Length.LengthUnit.INCHES);
        System.out.println("Are lengths equal (1.0 ft vs 18 in)? : " + lengthC1.equals(lengthC2));
    }
}
