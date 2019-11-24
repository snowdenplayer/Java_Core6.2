package com.lgs.lab.interface2;

public class Main {

    public static void main(String[] args) {
        MyCalculator calc=new MyCalculator(10, 2);
        System.out.println(calc.devide());
        System.out.println(calc.multiply());
        System.out.println(calc.plus());
        System.out.println(calc.minus());

    }

}