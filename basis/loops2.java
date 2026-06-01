import java.util.Scanner;
public class loops2 {
    public static void main(String[] args) {
                        // for loop statement 
    
    
     for (int i=0; i<5; i++){
     System.out.println(i);
    
    }  
   // print the  number from 1 to 20 
   for (int i=0; i<=20;i++){
    System.out.println(i);
   } 
//
   
                         // while loop statement 
// while (condition){
       // code to be executed
       //}


// while means jab tk statement true hoga tab tk loop chalega
   int i =0;
   while (i<5){
    System.out.println(i);
    i++;
   }

   // do-while loop statement 
   // do{
    // code to be executed}
// while (condition);
// isme pehle do m btate h kya kaam krna h phir condition check krta h ki loop chalega ya nhi
do{
System.out.println("This is do while loop");
}
while (false);

// print the sum of  first  n  natural number 
System.out.println("Enter the value of n : ");
Scanner Num = new Scanner (System.in);
int n = Num.nextInt();
int sum =0;
for(int z =1;z<=n;z++){
    sum =sum +z;

}
System.out.println("the Sum of First Natural Number are :"+sum);

// print the multiplication table of a given number
System.out.println("Enter the number you want to print the multiplication table : ");
int No =Num.nextInt();
 for(int x=1;x<=11;x++){
    System.out.println(No*x);

 }


   





}










}
