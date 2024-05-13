import java.util.*;
import java.lang.Math;
public class NumberGame
{
    Scanner in = new Scanner (System.in);
    int count = 1, score = 0;
    public int game (int attempt, int b, int a)
    {
    count = 1;
    while (count < attempt)
    {
    if (b == a)
    break;
    else if (b > a)
    {
    System.out.println ("Close! Guess a bit lower number. Try again");
    b = in.nextInt ();
    }
    else
    {
    System.out.println ("Close! Guess a bit higher number..Try again");
    b = in.nextInt ();
    }
    count++;
    }
    if (a == b)
    {
    System.out.println ("Yeah!! You guessed the correct number after " +count + " attempts");
    score = score + 1;
    return score;
    }
    else
    {
    System.out.println ("The attempts are over.");
    System.out.println ("The number was:" + a);
    return 0;
   }
  }
public static void main (String args[])
    {
    Scanner in = new Scanner (System.in);
    int ran, guess, attempt, n, sco = 0;
    char c;
    NumberGame obj = new NumberGame ();
    do
    {
    ran = (int) (1 + (Math.random () * 100));
    System.out.println("Enter 1 for Easy level that is the number of attempts will be 5.");
    System.out.println("Enter 2 for Medium level that is the number of attempts will be 3.");
    System.out.println("Enter 3 for Hard level that is the number of attempts will be 2.");
    System.out.println("Enter your choice:");
    n = in.nextInt ();
    switch (n)
     {
    case 1:
        System.out.println ("You have 5 attempts to guess the number:");
        System.out.println ("Enter the guessed number between 1 to 100:");
        guess = in.nextInt ();
        sco = obj.game (5, guess, ran);
        break;
    case 2:
        System.out.println ("You have 3 attempts to guess the number:");
        System.out.println ("Enter the guessed number between 1 to 100:");
        guess = in.nextInt ();
        sco = obj.game (3, guess, ran);
        break;
    case 3:
        System.out.println ("You have 2 attempts to guess the number:");
        System.out.println ("Enter the guessed number between 1 to 100:");
        guess = in.nextInt ();
        sco = obj.game (2, guess, ran);
        break;
    default:
       System.out.println ("Invalid choice! plz enter the correct choice");
}
System.out.println ("Do you want to continue playing? Enter Y or N");
c = in.next ().charAt (0);
if (c == 'Y' || c == 'y')
continue;
else
System.out.println ("Thanks for playing!");
break;
}
while (n != 0);
System.out.println ("Your final score is:" + sco);
}
}
