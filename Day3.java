import java.util.*;
//import java.lang.Math; //FOR RAISED TO POWER
public class day3{


   //Functions in java
   public static int CalculateSum(int a,int b){
    int sum=a+b;
    return sum;
  }


  public static int Multiplication(int a,int b){
    int multiplication_=a*b;
    return multiplication_;
  }



  public static void Factorial(int n){
    if(n<0){
      System.out.println("Invalid Output");
    }
    else{
    int factorial=1;
    for(int i=n;i>=1;i--){
      factorial=factorial*i;
    }
    System.out.println("Your Factorial of no. is "+factorial);
  
    }  
  }

    //Average of 3 No.s
  public static void Average(int a,int b,int c){
    int Aver=(a+b+c)/3;
    System.out.println("Average of 3 no.s is"+Aver);
  }

  public static void SumOdd(int n){
    int sum=0;
   
    for(int i=1;i<=n;i++){
      if(i%2==0){
        continue;
      }else{
        
        sum=sum+i;
      }
    }
    System.out.println("Sum of n odd no.s is " +sum);
  }


  public static void CalculateCircumference(int a){
    double Circumference =  2 * 3.14 *a;
    System.out.println("Circumference of circle of radius 'a' is: "+Circumference);


  }


  public static void Voting(int age){
    if(age>=18){
      System.out.println("Eligible for voting");
    }
    else{
      System.out.println("Not Eligible for voting ");
    }
  }

  public static int Raisedto(int a,int b){
    
    //return Math.pow(a, b);
    int pow=1;
    for(int i=1;i<=b;i++){
      pow=pow*i;
    }
    return pow;

  }


  public static void fiboncci(int n){
    int i=0;
    int j=1;
    if(n==0){
      System.out.print("0");
    }else{
    System.out.print(i+ " " +j);
    }
    for(int m=2;m<=n;m++){
      int k=i+j;
      System.out.print(" "+k);
      i=j;
      j=k;
    }
  }
   public static void main(String []args){
    System.out.println("Hello World");
   //Day 3
       //6) Print
       /*
       
              1
              1 2
              1 2 3
              1 2 3 4 
              1 2 3 4 5 
       
       
       
       */
      //int n=5;
      //Outer loop
      /*for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){   //inner loop
            System.out.print(" "+j);
        }
        System.out.println();
      }*/


      /*
       7)Print
       1 2 3 4 5    //i=1   j=5
       1 2 3 4      //i=2   j=4
       1 2 3
       1 2
       1
      
     for(int i=1;i<=n;i++){
      for(int j=1;j<=n-i+1;j++){
        System.out.print(" "+j);
      }
      System.out.println();
     }
      */



     /*8)
        Floyds triangle
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15



     
    int Number=1;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print(" "+Number);
        Number++;
      }
      System.out.println();
    }
    */

    /*
      9)Print 
      1
      0 1
      1 0 1
      0 1 0 1
      1 0 1 0 1
      logic if i+j is even then print 1 otherwise print 0
        

     */
    /* 
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        int sum=i+j;
        if(sum%2==0){
          System.out.print("1 ");
        }
        else{
          System.out.print("0 ");
        }
       
      }
      System.out.println();
    }
    */

    Scanner sc=new Scanner(System.in);
    /*int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int sum=CalculateSum(a,b);
    int multiplication_=Multiplication(a,b);
    Average(a,b,c);
   
    System.out.println("Your addition is:"+sum);
    System.out.println("Your multiplication is:"+multiplication_);


    int m=sc.nextInt();
    Factorial(m);

   */
   // int v=sc.nextInt();
   // SumOdd(v);
    //CalculateCircumference(v);
   // Voting(v);


   /*Write a Java program to enter the numbers till the user wants 
   and at the end it should display the count of positive, negative and zeros */
   int f=sc.nextInt();
   fiboncci(f);
   int a=sc.nextInt();
   int b=sc.nextInt();
   int result=Raisedto(a,b);
   System.out.println("Raised to value is: "+result);
   char choice;
   int Countpositive=0;
   int Countnegative=0;
   int Countzero=0;

    do{
      System.out.print("Enter the Number: ");
      int v=sc.nextInt();
      if(v>0){
        Countpositive++;
      }else if(v<0){
        Countnegative++;
      }else{
        Countzero++;
      }
       choice= sc.next().charAt(0);

    }while(choice=='y' || choice=='Y');
       System.out.println("Count of Positive No. is"+Countpositive);
       System.out.println("Count of Negaitive No. is"+Countnegative);
       System.out.println("Count of Zero No. is"+Countzero);
    
   }
   
   
   
}
