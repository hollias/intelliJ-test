package com.hollias.inflearn.intelliJ.refactory;

public class ReturnType {
    public void print(){
        Integer num = calculate();
        System.out.println("num = " + num);

    }

    private Integer calculate(){ return 1; }
}
