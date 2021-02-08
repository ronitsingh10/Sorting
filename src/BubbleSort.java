import java.util.*;
public class BubbleSort {
	
	static void bubbleSort(int arr[], int n) {
        if (n == 1)
            return;
        
        for (int i=0; i<n-1; i++) {
            if (arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        bubbleSort(arr, n-1);
    }

	public static void main(String[] args) {
		int n;
		Scanner gg = new Scanner(System.in);
		System.out.print("Enter no. of elements in the array: ");
		n = gg.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements one by one : ");
		for(int i = 0; i < n; i++)
			arr[i] = gg.nextInt();
		System.out.print("Original array : ");
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr, arr.length);
		System.out.print("Sorted array : ");
        System.out.println(Arrays.toString(arr));
	}

}
