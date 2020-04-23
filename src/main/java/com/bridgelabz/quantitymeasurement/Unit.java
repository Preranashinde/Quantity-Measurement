package com.bridgelabz.quantitymeasurement;

public enum Unit {
    FEET(12.0), INCH(1.0), YARD(36.0),
    CM(0.4), LITRE(1.0), GALLON(3.78), MILLILITRE(0.001);

    double baseUnitConversion;

    Unit(double baseUnitConversion) {
        this.baseUnitConversion = baseUnitConversion;
    }

    public static boolean compare(Length length1, Length length2) {
        return Double.compare(length1.value * length1.unit.baseUnitConversion,
                length2.value * length2.unit.baseUnitConversion) == 0;
    }
    public static boolean compare(Volume volume1, Volume volume2){
        return Double.compare(volume1.value * volume1.unit.baseUnitConversion,
                volume2.value * volume2.unit.baseUnitConversion) == 0;
    }
}
