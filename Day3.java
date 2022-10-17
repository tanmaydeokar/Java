public class Day3{
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
      int n=5;
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
   }
}
