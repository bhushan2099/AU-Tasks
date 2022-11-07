package com.FactoryDesignPattern;

public class CarsMain {

    public static void main(String[] args) {

        FourWheeler fw = new Alto();  // --> Need to create an object
        fw.getSpec();
        System.out.println("\n");

        CarsFactory cf = new CarsFactory();
        FourWheeler fw1 = cf.getCar("Budget Car");
        fw1.getSpec();
        System.out.println("\n");

        FourWheeler fw2 = cf.getCar("Luxury Car");
        fw2.getSpec();
        System.out.println("\n");

        FourWheeler fw3 = cf.getCar("iaflkja");
        fw3.getSpec();
        System.out.println("\n");



        /* Advantage of using Factory Design Pattern is that if in future more classes are created then
        we don't need to make changes to code written in Main file. We will just need to make changes in
        Factory file code.
         */

    }


}
