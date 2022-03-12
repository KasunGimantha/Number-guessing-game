import java.util.Random;
import java.util.Scanner;
public class guessTheNumber{
public static void main(String args[]){

Random rnd=new Random();
int numberToGuess=rnd.nextInt(1000);
int numberOfTries=0;
Scanner input=new Scanner(System.in);
boolean win=false;

while(win==false){
          System.out.println("Guess the number between 1 and 1000");
          int guess= input.nextInt();
          numberOfTries++;

          if(guess==numberToGuess){
          win=true;
          }
          else if(guess<numberToGuess){
          System.out.println("Your guess is too low");
          }
          else if(guess>numberToGuess){
          System.out.println("Your guess is too high");
          }
      }
System.out.println("You Win!!!!!!!!!");
System.out.println("The generated number was " + numberToGuess);
System.out.println("It took you "+numberOfTries+" tries");

}
}
