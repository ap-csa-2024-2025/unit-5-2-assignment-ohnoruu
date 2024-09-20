/*
 * ## Coins
Write a method called `coinConverte`r that accepts a single integer parameter representing some number of pennies and prints the correct number of dollars, quarters, dimes, and nickels that can be made from the pennies. The method should also print any leftover pennies.

This method must be called `coinConverter()` and its parameter must be an integer.

Calling `coinConverter(1234)` would print the following:
```
Dollar Bills: 12
Quarters: 1
Dimes: 0
Nickels: 1
Pennies: 4
```
Call your method in `main()` with some inputs to test and make sure it works.

Hint - you might want to review the unit 1 lessons on the use of integer and modular division as you will need to use these in your answer. Start by thinking about how many pennies there are in a single dollar bill, and therefore how you would work out the number of whole dollar bills in a given number of pennies (and how many pennies would be leftover).

 */
public class Coins
{
  public static void main(String[] args)
  {
    coinConverter(1234);
  }

  // write code for coinConverter
  public static void coinConverter(int numPennies){
    int dollars;
    int quarters;
    int dimes;
    int nickels;

    dollars = numPennies/100; 
    numPennies %= 100;
    quarters = numPennies/25; 
    numPennies %= 25;
    dimes = numPennies/10;
    numPennies %= 10;
    nickels = numPennies/5;
    numPennies %= 5;
    int leftoverPennies = numPennies;
    System.out.println("Dollar Bills: " + dollars);
    System.out.println("Quarters: " + quarters);
    System.out.println("Dimes: " + dimes);
    System.out.println("Nickels: " + nickels);
    System.out.println("Pennies: " + leftoverPennies);
  }

}
