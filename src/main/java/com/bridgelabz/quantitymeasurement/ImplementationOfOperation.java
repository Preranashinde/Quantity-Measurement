package com.bridgelabz.quantitymeasurement;

public class ImplementationOfOperation implements Operation {
    @Override
    public double addition(Length length1, Length length2) {
        return length1.value * length1.unit.baseUnitConversion +
                length2.value * length2.unit.baseUnitConversion;
    }
}
