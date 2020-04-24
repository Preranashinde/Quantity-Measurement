package com.bridgelabz.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {
    Operation operation = new ImplementationOfOperation();
    @Test
    public void given0FeetAnd0Feet_shouldReturnEqual() {
        Quantity feet1 = new Quantity(Unit.FEET, 0.0);
        Quantity feet2 = new Quantity(Unit.FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }
    @Test
    public void given0FeetAnd1Feet_shouldReturnNotEqual() {
        Quantity feet1 = new Quantity(Unit.FEET, 0.0);
        Quantity feet2 = new Quantity(Unit.FEET, 1.0);
        Assert.assertNotEquals(feet1, feet2);
    }
    @Test
    public void given1NullObject_shouldReturnNotEqual() {
        Quantity feet = new Quantity(Unit.FEET,0.0);
        Assert.assertNotEquals(feet, null);
    }
    @Test
    public void givenStringAndFeet_shouldReturnEqual() {
        Quantity feet = new Quantity(Unit.FEET,0.0);
        Assert.assertNotEquals(feet, "message");
    }
    @Test
    public void given0InchAnd0Inch_shouldReturnEqual() {
        Quantity inch1  = new Quantity(Unit.INCH, 0.0);
        Quantity inch2  = new Quantity(Unit.INCH, 0.0);
        Assert.assertEquals(inch1, inch2);
    }
    @Test
    public void given1NullValueObject_shouldReturnNotEqual() {
        Quantity inch = new Quantity(Unit.INCH, 0.0);
        Assert.assertNotEquals(inch, null);
    }
    @Test
    public void givenSameReferenceOfInch_shouldReturnEqual() {
        Quantity inch = new Quantity(Unit.INCH, 0.0);
        Assert.assertEquals(inch, inch);
    }
    @Test
    public void givenStringAndInch_shouldReturnNotEqual() {
        Quantity inch = new Quantity(Unit.INCH, 0.0);
        Assert.assertNotEquals(inch, "string");
    }
    @Test
    public void given0InchAnd1Inch_shouldReturnNotEqual() {
        Quantity inch1 = new Quantity(Unit.INCH, 0.0);
        Quantity inch2 = new Quantity(Unit.INCH, 1.0);
        Assert.assertNotEquals(inch1, inch2);
    }
    @Test
    public void given0InchAnd0Feet_shouldReturnEqual() {
        Quantity inch = new Quantity(Unit.INCH, 0.0);
        Quantity feet = new Quantity(Unit.FEET, 0.0);
        boolean compareCheck = Unit.compare(feet, inch);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given1FeetAnd1Inch_shouldReturnNotEqual() {
        Quantity inch = new Quantity(Unit.INCH, 1.0);
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        boolean compareCheck = Unit.compare(feet, inch);
        Assert.assertFalse(compareCheck);
    }
    @Test
    public void given1InchAnd1Feet_shouldReturnNotEqual() {
        Quantity inch = new Quantity(Unit.INCH, 1.0);
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        boolean compareCheck = Unit.compare(inch, feet);
        Assert.assertFalse(compareCheck);
    }
    @Test
    public void given1FeetAnd12Inch_shouldReturnEqual() {
        Quantity inch = new Quantity(Unit.INCH, 12.0);
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        boolean compareCheck = Unit.compare(inch, feet);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given12InchAnd1Feet_shouldReturnEqual() {
        Quantity inch = new Quantity(Unit.INCH, 12.0);
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        boolean compareCheck = Unit.compare(inch, feet);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given3FeetAnd1Yard_shouldReturnEqual() {
        Quantity feet = new Quantity(Unit.FEET, 3.0);
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        boolean compareCheck = Unit.compare(feet, yard);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given1FeetAnd1Yard_shouldReturnNotEqual() {
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        boolean compareCheck = Unit.compare(feet, yard);
        Assert.assertFalse(compareCheck);
    }
    @Test
    public void given1InchAnd1Yard_shouldReturnNotEqual() {
        Quantity inch = new Quantity(Unit.INCH,1.0);
        Quantity yard = new Quantity(Unit.YARD,1.0);
        boolean compareCheck = Unit.compare(inch, yard);
        Assert.assertFalse(compareCheck);
    }
    @Test
    public void given1YardAnd36Inch_shouldReturnEqual() {
        Quantity yard = new Quantity(Unit.YARD,1.0);
        Quantity inch = new Quantity(Unit.INCH,36.0);
        boolean compareCheck = Unit.compare(yard, inch);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given36InchAnd1Yard_shouldReturnEqual() {
        Quantity inch = new Quantity(Unit.INCH, 36.0);
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        boolean compareCheck = Unit.compare(inch, yard);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given1YardAnd3Feet_shouldReturnEqual() {
        Quantity yard = new Quantity(Unit.YARD, 1.0);
        Quantity feet = new Quantity(Unit.FEET, 3.0);
        boolean compareCheck = Unit.compare(yard, feet);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given2InchAnd5CM_shouldReturnEqual() {
        Quantity cm = new Quantity(Unit.CM, 5.0);
        Quantity inch = new Quantity(Unit.INCH, 2.0);
        boolean compareCheck = Unit.compare(inch, cm);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given2InchAnd2Inch_shouldReturn4Inch() {
        Quantity inch1 = new Quantity(Unit.INCH, 2.0);
        Quantity inch2 = new Quantity(Unit.INCH, 2.0);
        double addition = operation.addition(inch1, inch2);
        Assert.assertEquals(4.0, addition, 0.0);
    }
    @Test
    public void given1FeetAnd2Inch_shouldReturn14Inch() {
        Quantity feet = new Quantity(Unit.FEET, 1.0);
        Quantity inch = new Quantity(Unit.INCH, 2.0);
        double addition = operation.addition(feet, inch);
        Assert.assertEquals(14.0, addition, 0.0);
    }
    @Test
    public void given1FeetAnd1Feet_shouldReturn24Inch() {
        Quantity feet1 = new Quantity(Unit.FEET, 1.0);
        Quantity feet2 = new Quantity(Unit.FEET, 1.0);
        double addition = operation.addition(feet1, feet2);
        Assert.assertEquals(24.0, addition, 0.0);
    }
    @Test
    public void given2InchAnd2AndHalf_shouldReturn3Inch() {
        Quantity inch = new Quantity(Unit.INCH, 2);
        Quantity cm = new Quantity(Unit.CM, 2.5);
        double addition = operation.addition(inch, cm);
        Assert.assertEquals(3.0, addition, 0.0);
    }
    @Test
    public void given1GallonAnd3Point78litres_shouldRetunEqual() {
        Quantity gallon = new Quantity(Unit.GALLON, 1.0);
        Quantity litre = new Quantity(Unit.LITRE, 3.78);
        boolean compareCheck = Unit.compare(gallon, litre);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void givenLitreAndMililitres_shouldReturnEqual() {
        Quantity litre = new Quantity(Unit.LITRE,1.0);
        Quantity mililitre = new Quantity(Unit.MILLILITRE,1000.0);
        boolean compareCheck = Unit.compare(litre, mililitre);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given1GallonAnd3Point78_shouldReturn7Point57litres() {
        Quantity gallon = new Quantity(Unit.GALLON,1.0);
        Quantity litres = new Quantity(Unit.LITRE,3.78);
        double addition = operation.addition(gallon, litres);
        Assert.assertEquals(7.57, addition,0.1);
    }
    @Test
    public void given1LitresAnd1000Millilitres_shouldReturn2Litres() {
        Quantity litre = new Quantity(Unit.LITRE,1.0);
        Quantity mililitre = new Quantity(Unit.MILLILITRE,1000.0);
        double addition = operation.addition(litre, mililitre);
        Assert.assertEquals(2.0, addition,0.0);
    }
    @Test
    public void given1KilogramAnd1000Grams_shouldReturnEqual() {
        Quantity kilogram = new Quantity(Unit.KILOGRAM,1.0);
        Quantity gram = new Quantity(Unit.GRAM,1000.0);
        boolean compareCheck = Unit.compare(kilogram, gram);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given1TonneAnd1000Kilograms_shouldReturnEqual() {
       Quantity tonne = new Quantity(Unit.TONNE,1.0);
        Quantity kilogram = new Quantity(Unit.KILOGRAM,1000.0);
        boolean compareCheck = Unit.compare(tonne, kilogram);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given1TonneAnd1000Gram_shouldReturn1001Kilogram(){
        Quantity tonne = new Quantity(Unit.TONNE,1.0);
        Quantity gram = new Quantity(Unit.GRAM,1000.0);
        double addition = operation.addition(tonne, gram);
        Assert.assertEquals(1001.0, addition,0.0);
    }
    @Test
    public void given212FahrenheitAnd100Celsius_shouldReturnEqual() {
        Temperature fahrenheit = new Temperature(Unit.FAHRENHEIT,212.0);
        Temperature celsius = new Temperature(Unit.CELSIUS,100.0);
        boolean compareCheck = Unit.compare(fahrenheit, celsius);
        Assert.assertTrue(compareCheck);
    }
}
