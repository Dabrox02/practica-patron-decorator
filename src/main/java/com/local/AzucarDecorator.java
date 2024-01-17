package com.local;

public class AzucarDecorator implements Cafe {

    Cafe cafe;

    public AzucarDecorator(Cafe cafe) {
        this.cafe = cafe;
    }

    @Override
    public double getCostoBebida() {
        return this.cafe.getCostoBebida() + 500;
    }

}
