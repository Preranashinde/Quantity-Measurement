package com.bridgelabz.quantitymeasurement;

public class ImplementationOfOperation implements Operation {
    @Override
    public double addition(Length length1, Length length2) {
        return length1.value * length1.unit.baseUnitConversion +
                length2.value * length2.unit.baseUnitConversion;
    }
    @Override
    public double addition(Volume volume1, Volume volume2) {
        return volume1.value * volume1.unit.baseUnitConversion +
                volume2.value * volume2.unit.baseUnitConversion;
    }
    @Override
    public double addition(Weight weight1, Weight weight2) {
        return weight1.value * weight1.unit.baseUnitConversion +
                weight2.value * weight2.unit.baseUnitConversion;
    }
}
