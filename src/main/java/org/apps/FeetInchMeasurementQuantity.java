/*
    Authur : Deepak Singh
    EmpId : 20655873
*/

package org.apps;

public class FeetInchMeasurementQuantity {
    public static class Feet {
        public int value;
        public Feet(int value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Feet)) {
                return false;
            }
            Feet other = (Feet) obj;
            return this.value == other.value;
        }
    }

    public static class Inch {
        public double value;
        public Inch(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Inch)) {
                return false;
            }
            Inch other = (Inch) obj;
            return Double.compare(this.value, other.value) == 0;
        }
    }

    public static boolean checkFeetEquality(int value1, int value2) {
        Feet feet1 = new Feet(value1);
        Feet feet2 = new Feet(value2);
        return feet1.equals(feet2);
    }

    public static boolean checkInchesEquality(double valueInch1, double valueInch2) {
        Inch inch1 = new Inch(valueInch1);
        Inch inch2 = new Inch(valueInch2);
        return inch1.equals(inch2);
    }
    public static void main(String[] args){
        System.out.println("Feet Equalities: " + checkFeetEquality(19, 19));
        System.out.println("Inch Equalities: " + checkInchesEquality(10.4, 11.9));
    }
}
