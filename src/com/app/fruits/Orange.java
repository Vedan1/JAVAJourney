package com.app.fruits;

public class Orange extends Fruit {


    public Orange(String color, double weight, String name, boolean fresh) {
        super(color, weight, name, fresh);
    }

    public String taste(){
        return "Sour";
    }

    public void juice(){

            System.out.println(super.getName()+" "+super.getWeight()+ " Extracting Juice!!");
    }

    public String toString(){


        return super.getName()+" "+super.getWeight()+ " Extracting Juice!! " + "is Fresh?: "+ super.isFresh()+ " " ;
    }


}
