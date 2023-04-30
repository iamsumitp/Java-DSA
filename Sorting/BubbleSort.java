import java.util.*;
import java.io.*;

/*
Worst case TC -> O(N^2)
Best case TC -> O(N) --> When the entire array is already sorted and no swaps needed

*/
class Solution
{
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    {
        //code here
        
        for(int i=n-1;i>=1;i--){
            int didswap=0;
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    didswap=1;
                }
            }
            if(didswap==0){
                break;
            }
        }
    }
}
//Main Class
class BubbleSort
{
    //method to print the Elements of the array
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking total testcases
		int t = sc.nextInt();
		while(t>0)
		{
		    //taking total elements
			int n = sc.nextInt();
			
			//creating a new array of length n
			int arr[] = new int[n];
			
			//inserting elements to the array
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt(); 
			}
			
			
			//calling bubbleSort() method
			new Solution().bubbleSort(arr,n);
			
			//calling printArray() method
			printArray(arr);
			
		t--;	
		}
	}

}
// } Driver Code Ends
