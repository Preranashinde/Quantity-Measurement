package com.bridgelabz.quantitymeasurement;

public enum Unit {
    FEET(12.0, "Length"), INCH(1.0, "Length"), YARD(36.0, "Length"),
    CM(0.4, "Length"), LITRE(1.0, "Volume"), GALLON(3.78, "Volume"), MILLILITRE(0.001, "Volume"),
    TONNE(1000.0, "Weight"), KILOGRAM(1.0, "Weight"), GRAM(0.001, "Weight"),
    FAHRENHEIT(5.0 / 9.0, "Temperature"), CELSIUS(9.0 / 5.0, "Temperature");

    public String quantityType;
    double baseUnitConversion;

    Unit(double baseUnitConversion, String quantityType){
        this.baseUnitConversion = baseUnitConversion;
        this.quantityType = quantityType;
    }

    public static boolean compare(Quantity quantity1, Quantity quantity2) throws QuantityMeasurementException {
        if (!quantity1.unit.quantityType.equals(quantity2.unit.quantityType))
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.DIFFERENT_QUANTITY_TYPE,
                    "Quantity types are different so cannot compare");
        return Double.compare(quantity1.value * quantity1.unit.baseUnitConversion,
                quantity2.value * quantity2.unit.baseUnitConversion) == 0;
    }
    public static boolean compare(double fahrenheitToCelsius, Temperature celsius) {
        return Double.compare(fahrenheitToCelsius, celsius.value) == 0;
    }
}
