import java.util.Scanner;
public class Funtions {
  
  
    public static void printMyName(String name){
    System.out.println(name);
    return;
}  
    
    
   
    
    
    public static void main(String args[]){
       Scanner pc = new Scanner(System.in);
       String Name =pc.next();
       printMyName(Name); 

    }



}