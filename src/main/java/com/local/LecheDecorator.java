package com.local;

public class LecheDecorator implements Cafe {

    Cafe cafe;

    public LecheDecorator(Cafe cafe) {
        this.cafe = cafe;
    }

    @Override
    public double getCostoBebida() {
        return this.cafe.getCostoBebida() + 1000;
    }

}
