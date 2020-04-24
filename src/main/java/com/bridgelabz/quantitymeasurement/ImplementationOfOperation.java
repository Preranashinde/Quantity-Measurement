package com.bridgelabz.quantitymeasurement;

public class ImplementationOfOperation implements Operation {
    @Override
    public double addition(Quantity quantity1, Quantity quantity2) {
        return quantity1.value * quantity1.unit.baseUnitConversion +
                quantity2.value * quantity2.unit.baseUnitConversion;
    }
}
