import java.util.*;
public class day4{

   public static void main(String args[]){
    //SynTAX:1) type[] arrayname=new int[size]; 

    //int[] marks=new int[3];

    //Another way of writting array is:2) type arrayname[]=new int[size];
    /*marks[0]=97;
    marks[1]=98;
    marks[2]=99;
    System.out.println(marks[0]);
    System.out.println(marks[1]);
    System.out.println(marks[2]);
    int marks[]={97,98,99};
    System.out.println(marks[0]);
    System.out.println(marks[1]);
    System.out.println(marks[2]);
    
    Scanner sc=new Scanner(System.in);
    
    int size=sc.nextInt();
    int[] marks=new int[size];
    for(int i=0;i<size;i++){
        marks[i]=sc.nextInt();
    }
    for(int i=0;i<size;i++){
        System.out.println(marks[i]);
    }
    
    
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int[] marks=new int[size];
    for(int i=0;i<size;i++){
        marks[i]=sc.nextInt();

    }
    int x=sc.nextInt();
    for(int i=0;i<size;i++){
        if(x==marks[i]){
            System.out.println(i);

        }
    }
    *

    //2D Array 
    Scanner sc=new Scanner(System.in);
    int rows=sc.nextInt();
    
    int columns=sc.nextInt();
    int[][] numbers=new int[rows][columns];
    for(int i=0;i<rows;i++){
        for(int j=0;j<columns;j++){
            numbers[i][j]=sc.nextInt();
            

        }
    }
    int x=sc.nextInt();

    for(int i=0;i<rows;i++){
        for(int j=0;j<columns;j++){
            if(x==numbers[i][j]){
                System.out.println("Number found at "+ i + " & " + j );
            }
        }
        
    }
    */

    //Strings
    String Firstname="Tanmay";
    String Lastname="Deokar";
    String Fullname=Firstname + Lastname;
    System.out.println(Fullname);
    System.out.println(Fullname.length());
    for(int i=0;i<Fullname.length();i++){
        System.out.println(Fullname.charAt(i));

    }

    //Compare
    String FrstN="Tony";
    String LastN="Tonyk";
    if(FrstN.compareTo(LastN)==0)
    {
            System.out.println("Strings are equal");
    }
    else{
        System.out.println("Strings are not equal");
    
    
    }

    if(new String("Tony")==new String("Tony")){
        System.out.println("Two sTRINGHS aRE equal");
    }else{
        System.out.println("Two Stribngs aRE nOT equal");
    }


    String sentence="My name is Tonny";
    //String name=sentence.substring(11,sentence.length());
    String name=sentence.substring(5);
    System.out.println(name);




    
   
   }
}