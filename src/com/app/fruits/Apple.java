package com.app.fruits;

public class Apple extends Fruit{


    public Apple(String color, double weight, String name, boolean fresh) {
        super(color, weight, name, fresh);
    }

    public String taste(){
        return "Sweet and Sour";
    }


    public void jam(){
        System.out.println(super.getName()+ " Making a Jam!!");
    }

    public String toString(){


        return super.getName()+" "+super.getColor()+ " Making a Jam!!" + "is Fresh?: "+ super.isFresh()+ " " ;
    }




}
