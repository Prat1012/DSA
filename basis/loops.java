import java.util.Scanner;

public class loops {

    public static void main(String[] args) {
        // we have diiferent types of loops in java 
        // if,else 
        // else if ladder 
        // switch 
        // break 
        // continue
        // for loop
        // while loop
        // do while loop
//
      // if statement
      Scanner prac =new Scanner(System.in);
      int age = prac.nextInt();
      if (age >=18){
        System.out.println("You are eligible to vote");
      }
      else{
        System.out.println("You are not eligible to vote");     
      }
 //
      // nested if statement
      System.out.println("Enter your both numbers you wan to check : ");
      int num1 = prac.nextInt();
      int num2 = prac.nextInt();
      if (num1==num2){
        System.out.println("both numbers are equal");  
      } else{
        if (num1>num2){
            System.out.println(num1 + "is greater than" + num2);
        }if(num2>num1){
            System.out.println(num2 + "is greater than" + num1);
        }
        
      }
      // 


    }
}
