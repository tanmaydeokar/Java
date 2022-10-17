public class Day2{
    public static void main(String[] args){



        // /* 
        //  1)To print
        //     * * * * *
        //     * * * * *
        //     * * * * *
        //     * * * * *
        // */
        // for(int i=1;i<=4;i++)
        //     {
        //         for(int j=1;j<=5;j++){
        //             System.out.print("*");

        //         }
        //         System.out.println();
                
        //     }
        //     System.out.println();


           //2) Hollow Rectangle

            /*
             * * * * * 
             *       *
             *       *
             * * * * *
             
            for(int i=1;i<=4;i++){
                for(int j=1;j<=5;j++){
                    if(i==1 || j==1 || i==4 || j==5 ){
                        System.out.print("*" );

                    } else{
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }

            System.out.println();

            //3)Half Pyrammid
            /*
             * 
             * *
             * * *
             * * * *
             */
            /* 
            for(int i=1;i<=4;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("*");

                }
                System.out.println();
            }
           */
            

            //4)Inverted Pyramid
               /*     * * * *                
                      * * *
                      * *
                      *
               */
               /*  for(int i=4;i>=1;i--){
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
    
                    }
                    System.out.println();
                }
                */



            /* 5)Print 
                   * 
                 * * 
               * * *
             * * * *
             */
             //Outer loop
             int n=4;
             for(int i=1;i<=n;i++){
                //inner loop for spaces
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
             }



             /*6)Print





             */
    }
}
