package com.BuilderDesignPattern;

public class Shop {

    public static void main(String[] args) {

        Bike b1 = new Bike("Hero",180,"Shine",1.7,50);

        // the disadvantage is that there are multiple parameters to be entered, and we do not know the order in which it has to be entered

        // also sometime we do not with to enter the value of some parameter suppose we do not want to specify RAM

        // Hence we use Builder Pattern

        System.out.println(b1);

        /*
         Using Builder Design Pattern we do not have to worry about the order in which we have to enter the constructor parameter
         neither we have to worry to compulsorily enter the parameter values
         */

        Bike b2 = new BikeBuilder().setCompany("Hero").setModel("Shine").setMilage(50).getBike();

        System.out.println(b2);

        System.out.println();
    }
}
