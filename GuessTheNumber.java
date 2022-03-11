import java.util.*;
public class GuessTheNumber{
public static void main(String args[]){
Random rnd=new Random();
int number=rnd.nextInt(10);
Scanner sc = new Scanner(System.in);
System.out.println("Guess the number-Whole number");
int guess= sc.nextInt();
if(number == guess)
System.out.println("huraahhhhh");
else
System.out.println("huuuuuuuuuuuuuuuuu");

System.out.println("The generated number was " + number);
}
}
