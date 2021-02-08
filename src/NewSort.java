import java.util.*;
public class NewSort {
	
	static void Sort(int arr[]) { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
            while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
    } 
	
	public static void main(String[] args) {
		int n;
		Scanner gg = new Scanner(System.in);
		System.out.print("Enter no. of elements in the array:");
		n = gg.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements one by one :");
		for(int i = 0; i < n; i++)
			arr[i] = gg.nextInt();
		System.out.print("Original array : ");
        System.out.println(Arrays.toString(arr));
		Sort(arr);
		System.out.print("Sorted array : ");
        System.out.println(Arrays.toString(arr));
	}
}
