 import java.util.Scanner;
public class function3 {

    public static int Product(int a , int b){
        int pro= a*b;
        return pro;
    }




    public static void main(String[] args){
System.out.println("enter your number");
 Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b =sc.nextInt();
System.out.println("THe product of 2 no is :");
int pro = Product(a,b);
System.out.println(pro);
    }
}
