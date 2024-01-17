package com.local;

public class CafeNormal implements Cafe {

    private double costo;

    public CafeNormal(double costo) {
        this.costo = costo;
    }

    @Override
    public double getCostoBebida() {
        return costo;
    }

}
