 import java.util.*;
 public class Day1{
  
     public static void main(String[] args) {
        //System.out.println("HelloWorld"); //println function which takes code to the next line
        //System.out.print("Hello");  //print function which continues on the same line
       // "/n used to break the line"
       //int a=5;
       //int b=7;
       //int sum=a+b;
       //System.out.println("Sum is "+sum);
       //int x=(a+b)/(a-b);
       //System.out.println("Value of x is  "+x); 
       //Taking input
       Scanner sc=new Scanner(System.in);
       //String name=sc.nextLine();  //nextLine //nextInt //next //nextFloat
       //System.out.println(name);
       //int d=sc.nextInt();
       //int u=sc.nextInt();
       //int h=d+u;
       //System.out.println("Value of Addition is : " +h);
       int g=sc.nextInt();
       int k=sc.nextInt();
       //if else condition
       if(g>k){
          System.out.println("Value of g is greater than k");

       }else if(g<k){
          System.out.println("Value of g is less than k");
       }else{
          System.out.println("Value of g is equal to k");
       }
       sc.nextLine();
       int Button=sc.nextInt();
       switch(Button){
        case 1:
          System.out.println("A button");
          break;
        case 2:
          System.out.println("B button");
          break;
        case 3:
          System.out.println("C Button");
          break;
        default:
          System.out.println("Invalid Button");
          break;
       }

       //loops:1)For
      /*  int n=sc.nextInt();
       System.out.println("How many time u want to print hello world: " +n);
       for(int i=0;i<n;i++){
        System.out.println("Hello World");
       }
      */
      //   2)While
      /*int i=0;
      int n=sc.nextInt();
      System.out.println("How many times u want to print hello world: "+n);
      while(i<n){
        System.out.println("Hello World");
        i++;
      } */
      //     3)Do while loop
      int i=0;
      int n=sc.nextInt();
      System.out.println("How many times u want to print hello world: "+n );
      do{ 
        System.out.println("Hello World");
        i++;

      }while(i<=n);
        
        
    }
}

