/*import java.util.Random;
import java.util.Scanner;
public class world {
    public static void main(String[] args) {
    Random rc = new Random();
    Scanner sc= new Scanner(System.in);
    int num = rc.nextInt(15);
    int attempts = 0;
    int guess = 0 ;
    System.out.println("Enter the Number Between 1 to 100");
    System.out.println();
    while (num!=guess) {
        System.out.println("Guess the number");
        attempts++;
         guess = sc.nextInt();
        
        if(guess == num){
            System.out.println("Guessed Number is Correct");
            System.out.println(attempts + "taken");
            System.out.println("Thanks for Playing");
            break;
           
        }else if(guess<num){
            System.out.println("Guessed Number is less than Correct Number");
         
        }else{
            System.out.println("Guessed Number is More Than Correct Number");
           
        }

    }
    }
}
public class world {
     public static void main(String[] args) {
        int i=0;
        for ( i=0;i<4;i++){
            for(int j = 0; j<i+1 ; j++){
                  System.out.print("*");
            }
            System.out.println(" ");
        }
        
     }
}
public class world {

    public static void main(String[] args) {
        for(int i= 0 ; i<5 ; i++){
            for( int j= 5 ; j>i+1 ; j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
public class world {

    public static void main(String[] args) {
        for(int i=1; i<6;i++){
            for(int j=1;j<i+1;j++){
                System.out.print(j);    
            }
            System.out.println(" ");
            
        }
    }
}
public class world {

    public static void main(String[] args) {
        for(int i=1; i<=5;i++){
            for(int j=1;j<i+1;j++){
                System.out.print(j);  
                i++;  
            }
            System.out.println("");
            
        }
    }
}*/
import java.util.Scanner;
/*import java.util.Random;*/
public class world {
    /*Creating Own Functions */
    /*public static void main(String[] args) {
       System.out.println(add(10, 20));
        System.out.println(Mul(10, 20));
         System.out.println(Sub(10, 20));
          System.out.println(Div( 10, 20));
    }
     public static int add(int a,int b) {
          return a+b;
    }
    public static int Mul(int a,int b) {
          return a*b;
    }
    public static int Sub(int a,int b) {
          return a-b;
    }
    public static float Div(float a,float b) {
          return a/b;
    }
  /*multiplication Table 
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Table number");
    int num = sc.nextInt();
   
    for(int i=1;i<=10;i++){
            System.out.println(num + "x" + i + "=" + num*i);
  
    }
}
    /*Voting Simulator */
/*public static void main(String[] args) {
    Random rc = new Random();
    int A = rc.nextInt(50000);
    System.out.println("Votes of A--"+ A);
    int B = rc.nextInt(50000);
    System.out.println("Votes of B--"+ B);
    int C = rc.nextInt(50000);
    System.out.println("Votes of C--"+ C);
    int D = rc.nextInt(50000);
    System.out.println("Votes of D--"+ D);
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Your Age:");
    int Age = sc.nextInt();
    if(Age>=18){
        System.out.println("Your are eligible for vote");
        System.out.print("Choose Your Vote:");
        int vote = sc.nextInt();
        if(vote==1){
            A++;
            System.out.println("Thanks for Voting");
        }else if(vote==2){
            B++;
            System.out.println("Thanks For Voting");
        }else if(vote==3){
            C++;
            System.out.println("Thanks For Voting");
        }
        else{
            D++;
            System.out.println("Thanks For Voting");
        }
        System.out.println("Election Results");
        System.out.println("Votes of A--"+ A);
        System.out.println("Votes of B--"+ B);
        System.out.println("Votes of C--"+ C);
        System.out.println("Votes of D--"+ D);
        if(A>B && A>C && A>D){
               System.out.println("A Won With Number of Votes:  "+ A);
        }
        else if(B>A && B>C && B>D){
            System.out.println("B Won With Number of Votes:  "+ B);
        }else if(C>A && C>B && C>D){
              System.out.println("C Won With Number of Votes:  "+ C);
        }else{
               System.out.println("D Won With Number of Votes:  "+ D); 
        }
        
    }else{
        System.out.println("Your are Not eligible for vote:");
         System.out.println("Election Results");
        System.out.println("Votes of A--"+ A);
        System.out.println("Votes of B--"+ B);
        System.out.println("Votes of C--"+ C);
        System.out.println("Votes of D--"+ D);
        if(A>B && A>C && A>D){
               System.out.println("A Won With Number of Votes:  "+ A);
        }
        else if(B>A && B>C && B>D){
            System.out.println("B Won With Number of Votes:  "+ B);
        }else if(C>A && C>B && C>D){
              System.out.println("C Won With Number of Votes:  "+ C);
        }else{
               System.out.println("D Won With Number of Votes:  "+ D); 
        }
     } 
}
/*Fibbonacci Series */
/*public static void main(String[] args) {
    int i=7;
    System.out.println(series(i));
}
public static int series(int i){
    if(i==1){
        return 0;
    }else if(i==2){
            return 1;   
    }else{
       return series(i-1)+series(i-2);
    }
    
}*/
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter A Number: ");
    int i = sc.nextInt();
    System.out.println(series(i));
}
public static int series(int i) {
    if(i<=1){
        return 1;
    }else{
        return i*series(i-1);
    }
    
}
}

