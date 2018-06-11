package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Invoice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String name;
        double price;
        int quantity;
        double total;
        double subTotal;

        ArrayList <String> list = new ArrayList<String>(5);
        //ArrayList<Double>Itemprice =new ArrayList<Double>(5);
        ArrayList <Double> sTotal = new ArrayList<Double>(5);

        //name = sc.nextLine();
        Item Item1= new Item();
        Item Item2= new Item();
        Item Item3= new Item();
        Item Item4= new Item();

        for (int i=0;i<2;i++) {
            Item a = new Item();
            System.out.println("");

            System.out.print("Enter the Item name or Q to calculate to total ");
            name = sc.next();
            a.setItemName(name);


            System.out.print("Enter the price per item ");
            price = sc.nextDouble();
            a.setPrice(price);


            System.out.print("Enter the Quantity ");
            quantity = sc.nextInt();
            a.setQuantity(quantity);

            list.add((a.getItemName()+ " Quantity-"+ a.getQuantity()+" Price-" +a.getPrice()));
            sTotal.add(a.getQuantity()*a.getPrice());


        }
        double x=0;

        for (int i=0; i<sTotal.size();i++){
            System.out.print( list.get(i)+ " ");
            System.out.println("for--->"+ sTotal.get(i));
            x=x+sTotal.get(i);

        }


        System.out.println("---------------------------------------");
        System.out.println("SubTotal: "+ x);
        System.out.println("Tax: "+ x*0.06);//Assuming 6 % tax
        System.out.print("Grand Total: " + (x+ (x*0.06)));
        System.out.println();





    }

}
