//{ Driver Code Starts
import java.util.*;

class SelectionSort
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n]; 
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
		
			Solution obj = new Solution();
			obj.selectionSort(arr, n);
			
			for(int i=0;i<n;i++)
		    	System.out.print(arr[i]+" ");
		    System.out.println();
			t--;
		}
		
	}
}

// } Driver Code Ends


class Solution
{	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i=0;i<=arr.length-2;i++){
	        int mini=i;
          for(int j=i;j<=arr.length-1;j++){
            if(arr[j]<arr[mini]){
                mini=j;
            }
        }
	        int temp=arr[mini];
          arr[mini]=arr[i];
          arr[i]=temp;
	    }
	}
}
