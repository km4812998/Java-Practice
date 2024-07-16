public class subArrays {
    public static void printSub(int numbers[]) {
        int tsa = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                }
                tsa++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarray is:" + tsa);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printSub(numbers);
    }
}
