public class Patterns {
    public static void main(String args[]){
// solid rectnagle pattern 
for(int i=1 ; i<=4 ;i++){
 for (int j=1 ;j<=5 ;j++){
System.out.print("*");
 }
    System.out.println();
}

// hollow rectangle pattern
System.out.println("Hollow Rectangle Pattern : ");
int n =4 ;
int m =5 ;

for(int i=1 ;i<=n ;i++){
    for(int j=1;j<=m ;j++){
        if(i==1 || j==1 || i==n || j==m){
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
    }
    System.out.println();
}
 
// half pyramid pattern
System.out.println("Half pyramid pattern : ");
for(int k=1;k<=n;k++){
    for(int l=1;l<=k;l++){
        System.out.print("*");
    }
    System.out.println();
}

// inverted half pyramid pattern
System.out.println("Inverted half pyramid pattern : ");

for(int i=n;i>=1;i--){
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}

// half pyramid after 180 degree rotation
System.out.println("Half pyramid after 180 degree rotation : ");
 for(int i =1;i<=n;i++){
    for(int j =1;j<=n-i;j++){
        System.out.print(" ");
    }
    for(int k=1;k<=i;k++){
        System.out.print("*");
    }
    System.out.println();
 }


int a =5;
// half triangle with number 
System.out.println("Half triangle with number : ");
for(int i=1;i<=a;i++){
    for(int j=1;j<=i;j++){
        System.out.print(j+" ");
    }
    System.out.println();
}


//inverted triangle with number from 1 to 5 
System.out.println("Inverted triangle with number from 1 to 5 : ");
for(int i=a;i>=1;i--){
    for(int j=1;j<=i;j++){
    System.out.print(j+" ");
    }
    System.out.println();  
}

// next question 
















































































}





















}

