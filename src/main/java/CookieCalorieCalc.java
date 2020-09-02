
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
public class CookieCalorieCalc {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        //ask user how many cookies they ate as int
        System.out.println("How many cookies did you eat?");
        int numberOfCookiesEaten = keyboard.nextInt();
        
        //calculate number of cookies in a serving 40 cookies in bag 10 servings total
        double totalCookies = 40;
        double totalServings = 10;
        double oneServing = totalCookies / totalServings;
        
        //calculate number of calories in 1 cookie. 300 calories per serving
        
        double caloriesPerServing = 300;
        double caloriesPerCookie = caloriesPerServing / oneServing;
        
        //multiply user entered number by calories in 1 cookie
        
        double totalCalories = numberOfCookiesEaten * caloriesPerCookie;
        //display total calories consumed
        
        System.out.println("Total calories consumed: " + totalCalories);
    }
}
