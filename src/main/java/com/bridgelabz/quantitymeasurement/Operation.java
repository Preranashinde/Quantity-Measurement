package com.bridgelabz.quantitymeasurement;

public interface Operation {
    double addition(Length length1, Length length2);
    double addition(Volume volume1, Volume volume2);
    double addition(Weight weight1, Weight weight2);
}
