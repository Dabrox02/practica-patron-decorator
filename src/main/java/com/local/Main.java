package com.local;

public class Main {
    public static void main(String[] args) {

        Cafe cafe = new CafeNormal(4500);
        System.out.println(cafe.getCostoBebida());
        LecheDecorator cafeLeche = new LecheDecorator(cafe);
        System.out.println(cafeLeche.getCostoBebida());

    }
}