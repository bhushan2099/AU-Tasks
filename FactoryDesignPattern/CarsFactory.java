package com.FactoryDesignPattern;

public class CarsFactory {

    public FourWheeler getCar(String str){

        if(str.equals("Budget Car")){
            return new Alto();
        }

        else if (str.equals("Luxury Car")) {
            return new Bmw();
        }

        else if (str.equals("Fast Car")) {
            return new Lamborgini();
        }

        else{
            return new Swift();
        }
    }
}
