package com.bridgelabz.quantitymeasurement;

public enum Unit {
    FEET(12.0), INCH(1.0), YARD(36.0),
    CM(0.4), LITRE(1.0), GALLON(3.78), MILLILITRE(0.001),
    TONNE(1000.0), KILOGRAM(1.0), GRAM(0.001),
    FAHRENHEIT(1.0), CELSIUS(2.12);

    double baseUnitConversion;

    Unit(double baseUnitConversion) {
        this.baseUnitConversion = baseUnitConversion;
    }

    public static boolean compare(Quantity quantity1, Quantity quantity2) {
        return Double.compare(quantity1.value * quantity1.unit.baseUnitConversion,
                quantity2.value * quantity2.unit.baseUnitConversion) == 0;
    }
    public static boolean compare(Temperature temperature1, Temperature temperature2){
        return Double.compare(temperature1.value * temperature1.unit.baseUnitConversion,
                temperature2.value * temperature2.unit.baseUnitConversion) == 0;
    }
}
