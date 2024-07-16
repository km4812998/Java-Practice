public class selectionSort {

    //````````````````````````````````` 1ST EXAPMLE -ASCENDING ORDER````````````````````````````````````//

    // public static void main(String[] args) {
    //     int arr[]={5,4,1,3,2};
    //     sSort(arr);
    //     PrintArr(arr);
    // }
    // public static void PrintArr(int arr[]){
    //     for(int j=0;j<arr.length;j++){
    //         System.out.print(arr[j]+ " ");
    //     }
    //     System.out.println();
    // }
    // public static void sSort(int arr[]){
    //     for(int i=0;i<arr.length-1;i++){
    //         int minPosition=i;
    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[minPosition] > arr[j]){
    //                 minPosition=j;
    //             }
    //         }
    //         int temp=arr[minPosition];
    //         arr[minPosition]=arr[i];
    //         arr[i]=temp;
    //     }
    // }



    //```````````````````````````` 2ND EXAMPLE - DESCENDING ORDER``````````````````````````````//
    public static void main(String[] args) {
        int arr[]={3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        sSort(arr);
        PrintArr(arr);
    }

    public static void PrintArr(int arr[]){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }

    public static void sSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos] < arr[j]){
                    minPos = j; 
                }
            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }
}