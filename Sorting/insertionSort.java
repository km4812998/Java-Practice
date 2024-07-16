public class insertionSort {

    // //`````````````````````````````` 1ST EXAMPLE - ASCENDING ORDER`````````````````//
    // public static void main(String[] args) {
    //     int arr[]={5,4,1,3,2};
    //     iSort(arr);
    //     PrintArr(arr);
    // }

    // public static void PrintArr(int arr[]){
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i] + " ");
    //     }
    //     System.out.println();
    // }

    // public static void iSort(int arr[]){
    //     for(int i=1;i<arr.length;i++){
    //         int curr=arr[i];
    //         int  prev=i-1;
            
    //         while(prev >= 0 && arr[prev] > curr){
    //             arr[prev+1]=arr[prev];
    //             prev--;
    //         }
    //         arr[prev+1]=curr;
    //     }
    // }


    //`````````````````````````````````` 2ND EXAMPLE -DESCENDING ORDER```````//

    public static void main(String[] args) {
        int arr[]={3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        iSort(arr);
        // Arrays.sort(arr,0,3);  //`````````ASCENDING ORDER````////
        // Arrays.sort(arr,Collections.reverseOrder()) //`````DESCENDING ORDER``````// - TO USE THIS WE HAVE TO CHANGE THE PRIMITIVE TYPE(int) TO OBJECT TYPE(Integer) in calling the main function and PrintArr function.
        PrintArr(arr);
    }
    public static void PrintArr(int arr[]){
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void iSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while( prev >= 0 && arr[prev] < curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
}
