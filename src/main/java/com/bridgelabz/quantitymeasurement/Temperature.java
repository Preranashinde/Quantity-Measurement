package com.bridgelabz.quantitymeasurement;

public class Temperature {
    public final Unit unit;
    public final double value;

    public Temperature(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temperature temperature = (Temperature) o;
        return Double.compare(temperature.value, value) == 0 && unit == temperature.unit;
    }
}
