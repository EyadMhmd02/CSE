package y1.s1.self_practicing_code.chapter_08.p16_CoinTossSimulator;

/**
   This program demonstrates a solution to the
   Coin Toss Simulator programming challenge.
*/

public class CoinTossSimulator
{
   public static void main(String args[])
   {
      // Constant for the number of tosses.
      final int NUM_TOSSES = 20;
      
      // Create an instance of the Coin class.
      Coin myCoin = new Coin();
      
      // Display the side facing up.
      System.out.println("The side initially facing up: " +
                         myCoin.getSideUp() );
      
      // Toss the coin repeatedly.
      System.out.println("Now I will toss the coin " +
                         NUM_TOSSES + " times.");
                         
      for (int i = 0; i < NUM_TOSSES; i++)
      {
         // Toss the coin.
         myCoin.toss();
         
         // Display the side facing up.
         System.out.println("Toss:   " + myCoin.getSideUp());
      }
   }
}