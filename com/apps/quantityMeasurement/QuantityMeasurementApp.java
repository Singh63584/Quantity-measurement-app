/*  
    Authur : Deepak Singh
    EmpId : 20655873
*/

import java.util.Scanner;

public class QuantityMeasurementApp {
    public static class Feet {
        public int value;
        public Feet(int value) {
            this.value = value;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            Feet secondValue = (Feet) obj;
            //return int.compare(this.value, secondValue.value) == 0;
            if(this.value == secondValue.value){
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first value in Feet: ");
        int value1 = scanner.nextInt();
        System.out.print("Enter second value in feet: ");
        int value2 = scanner.nextInt();
        Feet feet1 = new Feet(value1);
        Feet feet2 = new Feet(value2);
        boolean result = feet1.equals(feet2);
        System.out.println("Are both value are equal? : " + result);
    }
}
