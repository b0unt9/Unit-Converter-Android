package com.prigic.unitconverter;

public class Unit {
    private String name;
    private double factor;
    private String unitSymbol;

    public Unit(String name, double factor, String unitSymbol) {
        this.name = name;
        this.factor = factor;
        this.unitSymbol = unitSymbol;
    }

    public String getName() {
        return name;
    }

    public double getFactor() {
        return factor;
    }

    public String getUnitSymbol() {
        return unitSymbol;
    }
}
