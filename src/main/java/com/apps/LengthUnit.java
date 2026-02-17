package com.apps;

public enum LengthUnit {
    FEET(12.0), INCHES(1.0), YARD(36.0), CENTIMETER(0.393701);

    private final double conversionFactor;

    LengthUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double toInches(double value) {
        return value * conversionFactor;
    }

    public double fromInches(double inches) {
        return inches / conversionFactor;
    }
}
