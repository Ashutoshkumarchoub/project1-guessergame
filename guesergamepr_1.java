import java.util.*;
class guesser
{
    int guessnum;
    int guessnum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Guesser kindly gueses the number : ");
        guessnum=sc.nextInt();
        return guessnum;
    }
    
}
class player
{
    int guessnum;
    int guessnum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Player kindly guess the name : ");
        guessnum=sc.nextInt();
        return guessnum;
    }
}
class umpire
{
    int numfromguesser;
    int numfromplayer1;
    int numfromplayer2;
    int numfromplayer3;
    void collectnumfromguesser()
    {
        guesser g=new guesser();
        numfromguesser=g.guessnum();
    }
    void collectnumfromplayer()
    {
        player p1=new player();
        player p2=new player();
        player p3=new player();
        numfromplayer1=p1.guessnum();
        numfromplayer2=p2.guessnum();
        numfromplayer3=p3.guessnum();
    }
    void compare()
    {
        if(numfromguesser==numfromplayer1)
        {
            if(numfromguesser==numfromplayer2 && numfromguesser==numfromplayer3)
            {
                System.out.println("All the player won the game...");
            }
            else if (numfromguesser==numfromplayer2)
            {
                System.out.println("Player1 and player2 won the game...");
                
            }
            else if(numfromguesser==numfromplayer3)
            {
                System.out.println("Player1 and player3 woon the  game...");
            }
            else
            {
                System.out.println("Player1 won the game...");
            }
        }
        else if(numfromguesser==numfromplayer2)
        {
            if(numfromguesser==numfromplayer3)

            {
                System.out.println("Player2 and player3 won the game...");
            }
            else
            {
                System.out.println("Player3 won the game...");
            }
        }
        else if(numfromguesser==numfromplayer3)
        {
            System.out.println("Player3 won the game...");
        }
        else
        {
            System.out.println("All player lost the game! Try again...");
        }
    }
}
public class guesergamepr_1
{
    public static void main(String[] args)
    {
        umpire u=new umpire();
        u.collectnumfromguesser();
        u.collectnumfromplayer();
        u.compare();
    }
    
}