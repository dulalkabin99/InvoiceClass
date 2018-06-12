package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Item {

        private static Double taxRate;
        private Double price;
        private int quantity;
        private String itemName;
        double tTotal = 0;
        double ntTotal = 0;



        public void setTaxRate(double taxRate) {
                this.taxRate = taxRate;
        }


        public double getTaxRate() {
                return taxRate;
        }

        public Double getPrice() {
                return price;
        }

        public void setPrice(Double price) {
                this.price = price;
        }

        public int getQuantity() {
                return quantity;
        }

        public void setQuantity(int quantity) {
                this.quantity = quantity;
        }

        public String getItemName() {
                return itemName;
        }

        public void setItemName(String itemName) {
                this.itemName = itemName;
        }

        public static double taTotal(ArrayList<Double> taxableTotal) {
                double tTotal = 0.0;
                for (int i = 0; i < taxableTotal.size(); i++) {
                        tTotal += taxableTotal.get(i);
                }
                return tTotal;
        }

        public static double ntaTotal(ArrayList<Double> nonTaxTotal) {
                double ntTotal = 0.0;
                for (int i = 0; i < nonTaxTotal.size(); i++) {
                        ntTotal += nonTaxTotal.get(i);
                }
                return ntTotal;
        }

        public static double tax(ArrayList<Double> taxableTotal) {
                double tax = 0.0;
                for (int i = 0; i < taxableTotal.size(); i++) {
                        tax += (taxableTotal.get(i) * taxRate);
                }
                return tax;
        }

        public static double subTotal(ArrayList<Double> taxableTotal, ArrayList<Double> nonTaxTotal) {
                double subTotal = 0;
                subTotal = (ntaTotal(nonTaxTotal)) + (taTotal(taxableTotal));

                return subTotal;
        }

}

