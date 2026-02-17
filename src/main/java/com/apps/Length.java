package com.apps;
import java.util.Objects;

public class Length {
    private final double value;
    private final LengthUnit unit;

    public Length(double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    private double toInches() {
        return unit.toInches(value);
    }

    Length convertToBaseUnit(LengthUnit targetUnit) {
        double inches = this.toInches();
        double convertedValue = targetUnit.fromInches(inches);
        convertedValue = Math.round(convertedValue * 100.0) / 100.0;
        return new Length(convertedValue, targetUnit);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        Length that = (Length) obj;
        return Double.compare(this.toInches(), that.toInches()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(toInches());
    }

    @Override
    public String toString() {
        return value + " " + unit;
    }
}
