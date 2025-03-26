public class Test{
    public static void main(String[] args) {
        int[] arr = {2,4,3,7,1,5};
        System.out.print("The elements of the Array are :");
        printArray(arr);
        System.out.println();
        System.out.print("Reverse of and array is :");
        reverseArray(arr);
        numMinMax(arr);
        int k =1;
        kthelement(arr,k);
    }
    static void printArray(int[] arr){

        for (int i: arr) {
            System.out.print(i+" ");
        }
    }
    static void reverseArray(int[] arr){

        int i=0,j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        printArray(arr);
    }
    static void numMinMax(int [] arr){
        int min=arr[0];
        int max=arr[0];
        for(int i: arr){
            if(i<min){
                min=i;
            }
            if(i>max){
                max=i;
            }
        }
        System.out.println("Min and Max are :"+min +", "+max+" respectively");
    }
    static void kthelement(int[] arr,int k){
        int n=arr.length;
        boolean swapped;
        for(int i=0;i<n-1;i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        System.out.println("The largest "+k+" element is :"+arr[n-k]);
    }
}