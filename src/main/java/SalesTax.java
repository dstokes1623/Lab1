
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Client
 */
public class SalesTax {
    public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      
     final double STATE_SALES_TAX = 0.04;
     final double COUNTY_SALES_TAX = 0.02;
    //ask user to enter the amount of a purchase
    //display amount of purchase
     System.out.println("Enter the amount of your purchase");
     double amountOfPurchase = keyboard.nextDouble();
     System.out.println("Amount of purchase: " + amountOfPurchase);
    //compute state sales tax at .04
    //display state sales tax
     
     double stateSalesTaxTotal = amountOfPurchase * STATE_SALES_TAX;
     System.out.println("State sales tax: " + stateSalesTaxTotal);
    
    //compute county sales tax at .02
    //display county sales tax
    
     double countySalesTaxTotal = amountOfPurchase * COUNTY_SALES_TAX;
     System.out.println("County sales tax: " + countySalesTaxTotal);
     
    //compute total sales tax
    //display total sales tax
     
     double totalSalesTax = stateSalesTaxTotal + countySalesTaxTotal;
     System.out.println("Total sales tax: " + totalSalesTax);
     
    //compute total of sale
    //display total of sale
    
     double saleTotal = amountOfPurchase + totalSalesTax;
     System.out.println("Total Sale: " + saleTotal);
    }
}
