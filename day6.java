public class day6

{

    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();

    }

    public static void main(String [] args){
        int arr[]={2,4,1,5,9};
  
        //  bubble Sort
        //Time Complexity:O(n^2)
        /*for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }*/
        //Selection Sort

        //Time Complexity:O(n^2)
       /* for(int i=0;i<arr.length-1;i++){
            int smallest=i;
           for(int j=i+1;j<arr.length;j++){
            if(arr[smallest]>arr[j]){
                smallest=j;

            }

           }
           int temp=arr[smallest];
           arr[smallest]=arr[i];
           arr[i]=temp;
        }
        */
        //Insertion Sort
        for(int i=1;i<arr.length-1;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;    
            }

            //Placement
            arr[j+1]=current;
        }


        printarray(arr);
    }
}
