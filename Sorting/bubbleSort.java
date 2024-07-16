public class bubbleSort{
    //```````````````````````````````1st EXAMPLE - ASCENDING ORDER 
    // public static void main(String[] args) {
    //     int arr[] ={5,4,1,3,2};
    //     bSort(arr);
    //     PrintArr(arr);
    // }

    // public static void bSort(int arr[]){
    //     for(int turn=0;turn<arr.length-1;turn++){
    //         for(int i=0;i<arr.length-1-turn;i++){
    //             if(arr[i] > arr[i+1]){
    //                 //SWAP
    //                 int temp=arr[i];
    //                 arr[i]=arr[i+1];
    //                 arr[i+1]=temp;
    //             }
    //         }
    //     }
    // }
    // public static void PrintArr(int arr[]){
    //     for(int j=0;j<arr.length;j++){
    //         System.out.print(arr[j] + " ");
    //     }
    //     System.out.println();
    // }


    //````````````````````````````````````` 2ND EXAMPLE - DESCENDING ORDER ````````````````````````````//
    public static void main(String[] args) {
        int arr[]={3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        bSort(arr);
        PrintArr(arr);
    }
    public static void bSort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int i=0;i<arr.length-1-turn;i++){
                if(arr[i] < arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }
    public static void PrintArr(int arr[]) {
       for(int j=0;j<arr.length;j++){
        System.out.print(arr[j] + " ");
       }
       System.out.println();
    }
}


