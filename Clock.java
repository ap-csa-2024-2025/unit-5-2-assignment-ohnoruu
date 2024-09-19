/*
## Clock
Write a method that takes a single integer parameter that represents the hour of the day (in 24 hour time) and prints the time of day as a string. The hours and corresponding times of the day are as follows:

0 = “midnight”
12 = “noon”
18 = “dusk”
0-12 (exclusive) = “morning”
12-18 (exclusive) = “afternoon”
18-24 (exclusive) = “evening”

You may assume that the actual parameter value passed to the method is always between 0 and 24, including 0 but excluding 24.
This method must be called `timeOfDay()` and it must have an integer parameter.

Calling `timeOfDay(8)` should print “morning” to the screen, and calling `timeOfDay(12)` should print “noon” to the screen.

Call your method in `main()` with some inputs to test and make sure it works. */

public class Clock
{
  public static void main(String[] args)
  {
    // test code here
  }

  public static void timeOfDay(int hour){
    if (hour == 0){
      System.out.print("midnight");
    if (hour == 12){
      System.out.print("noon");
    if (hour == 18){
      System.out.print("dusk");
    if (hour >= 1)(hour < 12){

    }
    }
    }
    }
  }

}
