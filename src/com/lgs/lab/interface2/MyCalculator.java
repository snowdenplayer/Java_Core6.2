package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {
    int numberOne;
    int numberTwo;
    MyCalculator(int numberOne,int numberTwo){
        this.numberOne=numberOne;
        this.numberTwo=numberTwo;
    }
    @Override
    public int devide() {
        System.out.print(numberOne+"/"+numberTwo+"=");
        return (numberOne/numberTwo);
    }

    @Override
    public int multiply() {
        System.out.print(numberOne+"*"+numberTwo+"=");
        return (numberOne*numberTwo);

    }

    @Override
    public int plus() {
        System.out.print(numberOne+"+"+numberTwo+"=");
        return(numberOne+numberTwo);

    }

    @Override
    public int minus() {
        System.out.print(numberOne+"-"+numberTwo+"=");
        return(numberOne-numberTwo);

    }
}
