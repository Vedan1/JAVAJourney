package com.app.fruits;

public class Mango extends Fruit{
    public Mango(String color, double weight, String name, boolean fresh) {
        super(color, weight, name, fresh);
    }

    public String taste(){
        return "Sweet";
    }
    public void pulp(){
        System.out.println(super.getName()+" "+super.getColor()+ " Creating Pulp!");

    }
    public String toString(){


        return super.getName()+" "+super.getColor()+ " Creating Pulp!" + "is Fresh?: "+ super.isFresh()+ " " ;
    }



}
