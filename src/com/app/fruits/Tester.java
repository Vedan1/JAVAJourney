package com.app.fruits;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        int size, counter=0;
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Basket: ");
        System.out.println("Please Enter Basket Size: ");
        size = sc.nextInt();


        Mango[] m = new Mango[size];
        Apple[] a = new Apple[size];
        Orange[] o = new Orange[size];

        while (flag==false){

                for(int i = 0;i<=size-1;i++){
                    System.out.println("Round : "+i);
                    System.out.println("Enter Your  Choice: ");
                    System.out.println("1. Apples");
                    System.out.println("2. Mango");
                    System.out.println("3. Oranges");
                    switch (sc.nextInt()){

                        case 1:
                            System.out.println("Enter Details: Color, Weight, Name, Fresh");
                            m[i] = new Mango(sc.next(),sc.nextDouble(),sc.next(),sc.nextBoolean());
                            break;
                        case 2:
                            break;
                        case 3:
                            break;

                    }
                }
            System.out.println("LoopEnds Flag Gone Wrong ig....  ");
            flag=true;
        }







        System.out.println(m[0]);
        System.out.println(m[1]);
//        System.out.println("\n");
//        System.out.println(a);
//        System.out.println("\n");
//        System.out.println(o);
    }
}
