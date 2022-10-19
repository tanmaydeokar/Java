import java.util.*;
public class day5{
    public static void main(String args[]){

        /*  String Builder requires less memory in the heap as compared to traditional string
          method


        StringBuilder sb=new StringBuilder("Tony");
        System.out.println(sb.charAt(0));
        System.out.println(sb.charAt(1));
       //1)Setcharat
        sb.setCharAt(0, 'P');
        System.out.println(sb);
      //2)Insert
        sb.insert(0,'S');
        System.out.println(sb);
     //3)Delete
        sb.delete(2,3);//Only element present at 2nd position
        System.out.println(sb);

    //4)Append
       sb.append("e");
       sb.append("h");
       System.out.println(sb);




     StringBuilder ab=new StringBuilder("Hello");
     for(int i=0;i<ab.length()/2;i++){
        int front=i;
        int back=ab.length()-1-i;

        char frontchar=ab.charAt(front);
        char backchar=ab.charAt(back);

        ab.setCharAt(front,backchar);
        ab.setCharAt(back, frontchar);

     }
     System.out.println(ab);
     */




     //Operators
     /*
      * "+" ,"-" ," * "," / "," % "
      * Unary :1)++ ->Increment
               2)-- ->Decrement


        Pre Increment
          ++a                      --a
           int a=10;              int a =10;
           int b=0;               int b=0;
           b=++a;                 b=--a;
           a->11                  a->9
           b->10                  b->9






      Post Increment
        a++                          a--
         int a=10;                   int a=10;
           int b=0;                  int b=0;
           b=a++;                    b=a--;
           a->11                     a->10;
           b->11                     b->9;
      */

     
    }
}
