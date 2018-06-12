package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Invoice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double price;
        int quantity;

        double subTotal;
        String input;

        ArrayList <String> taxableList = new ArrayList<String>();
        ArrayList <String> nonTaxableList = new ArrayList<String>();
        ArrayList <Double> taxableTotal = new ArrayList<>();
        ArrayList <Double> nonTaxTotal = new ArrayList<>();

        System.out.print("Enter Tax Rate");
        Item t = new Item();
        double ta = sc.nextDouble();
        t.setTaxRate(ta);
        System.out.print("Enter the First Item ");
        input = sc.next();
while (!input.equalsIgnoreCase("n")){
            Item a = new Item();
            a.setItemName(input);

            System.out.print("Enter the price per item ");
            price = sc.nextDouble();
            a.setPrice(price);

            System.out.print("Enter the Quantity ");
            quantity = sc.nextInt();
            a.setQuantity(quantity);

            System.out.print("Is this Taxable ");
            input = sc.next();
             if (input.equalsIgnoreCase("y")) {

        taxableList.add((a.getItemName() + " Quantity-" + a.getQuantity() + " Price-" + a.getPrice()));
        taxableTotal.add(a.getQuantity() * a.getPrice());
    }
    else if (input.equalsIgnoreCase("n")) {

        nonTaxableList.add((a.getItemName() + " Quantity-" + a.getQuantity() + " Price-" + a.getPrice()));
        nonTaxTotal.add(a.getQuantity() * a.getPrice());
    }

            System.out.print("Enter the Item name or 'N' to calculate to total ");
            input = sc.next();
        }

        System.out.println("--------------------Thank You for Shopping-------------------");


        double taTotal= Item.taTotal(taxableTotal);
        double ntaTotal= Item.ntaTotal(nonTaxTotal);
        double tax = Item.tax(taxableTotal);
        subTotal=ntaTotal+taTotal;
        double grandTotal = subTotal + tax;

        System.out.println("---Taxable Items---");

        for (int i=0; i<taxableTotal.size();i++) {
            System.out.print(taxableList.get(i) + " ");
            System.out.println(String.format("\tfor---> %.2f" , taxableTotal.get(i)));
        }
        System.out.println("---------------------------------------");
        System.out.println ( String.format("Taxable Total %.2f: " , taTotal));
        System.out.println("---------------------------------------");


        System.out.println("---Non Taxable Items---");
        for (int i=0; i<nonTaxTotal.size();i++) {
            System.out.print("\t "+ nonTaxableList.get(i) + " ");
            System.out.println(String.format("\t "+"for---> %.2f", nonTaxTotal.get(i)));
        }
        System.out.println("---------------------------------------");
        System.out.println(String.format("Non Taxable Total %.2f : " , ntaTotal));

        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");

        System.out.println(String.format("Sub Total: %.2f", subTotal));
        System.out.println(String.format("Tax: %.2f", tax));

        System.out.println(String.format("Total Ammount Due %.2f: ", grandTotal));

    }

}
