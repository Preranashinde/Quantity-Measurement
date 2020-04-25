package com.bridgelabz.quantitymeasurement;

public class Quantity {
    public final Unit unit;
    public final double value;

    public Quantity(Unit unit, double value) throws QuantityMeasurementException {
        this.unit = unit;
        this.value = value;
        if (value < 0.0 )
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NEGATIVE_VALUE,
                    "Quantities can not be in negative");
        }
    public static double temperatureConversion(Temperature quantity, Unit unit) {
        switch (unit) {
            case FAHRENHEIT:
                return (quantity.value - 32) * (unit.baseUnitConversion);
            case CELSIUS:
                return ((quantity.value * (unit.baseUnitConversion)) + 32);
        }
        return quantity.value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity quantity = (Quantity) o;
        return Double.compare(quantity.value, value) == 0 && unit == quantity.unit;
    }
}
