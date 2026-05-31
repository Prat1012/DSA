import java.util.Scanner;
class hello{
// this is the way to output the any text 
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        System.out.println("Hello, World!");

         // star pattern {*}
         System.out.println("*");
         System.out.println("**" );
         System.out.println("***");
         System.out.println("****");
         // 


         // variable declaration and initialization
            String Name ="Anushka";
            int age = 20;
            double price = 99.99;
            System.out.println("Name: " + Name);
            System.out.println("Age: " + age);  
            System.out.println("Price: " + price);
            //
            // variables
            int a = 10;
            int b = 20;
            int c = 30;
            int diff = a-b-c;
            System.out.println("Sum of a,b and c is : " + (a + b + c));
            System.out.println("Difference of a,b and c is : " + diff);
            //
            // taking input using scanner class 
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String name = sc.next();// it takes only one token as input
            System.out.println("Hello, " + name + "!");
            System.out.print("Enter your Full name : ");
            String Fullname =sc.nextLine();
            System.out.println("Hello, " + Fullname + "!");
            // Take 2 variables 'a' and 'b' and print the sum 
            System.out.print("Enter the value of a : ");
            int A1 = sc.nextInt();
            System.out.print("Enter the value of b : ");
            int B1 = sc.nextInt();
            int sum = A1 + B1;
            System.out.println("The sum of a and b is : " + sum);
            //
         sc.close();
            
        

 
 

        
    }
}