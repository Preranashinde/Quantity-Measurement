package com.bridgelabz.quantitymeasurement;

public class ImplementationOfOperation implements Operation {
    @Override
    public double addition(Quantity quantity1, Quantity quantity2) throws QuantityMeasurementException {
        if(!quantity1.unit.quantityType.equals(quantity2.unit.quantityType))
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.DIFFERENT_QUANTITY_TYPE,
                    "Quantity types are different so cannot compare");
        return quantity1.value * quantity1.unit.baseUnitConversion +
                quantity2.value * quantity2.unit.baseUnitConversion;
    }
}


