/*
Splits an array into two halves, and sorts each half simultaneously using merge sort, then merges the two sorted halves
back together, resulting in a sorted array.
*/

import java.util.Arrays;

public class MultithreadedMergeSort extends Thread
{
	int[] toBeSorted;
	public String whichHalf;
	public boolean inProgress;
	
	public MultithreadedMergeSort(String whichHalf, int[] toBeSorted)
	{
		this.whichHalf = whichHalf;
		this.toBeSorted = toBeSorted;
		
		inProgress = true;
	}
	
	public static void main(String[] args)
	{
		// initialize arrays
		
		int[] array = new int[] { 19, 4, -5, 8, 9, 7, 0, -3, 12, -14, -21, 40, 60, 95, 126 };
		
		int[] leftHalf = Arrays.copyOfRange(array, 0, array.length / 2); 		      // copy first half of array onto leftHalf
		int[] rightHalf = Arrays.copyOfRange(array, array.length / 2, array.length);  // copy second half of array onto rightHalf

		
		MultithreadedMergeSort left = new MultithreadedMergeSort("left", leftHalf);
		MultithreadedMergeSort right = new MultithreadedMergeSort("right", rightHalf);
		
		
		// perform merge sort on the two halves of the array simultaneously
		left.start();  // perform merge sort on left half
		right.start(); // perform merge sort on right half
		
		
		// wait for both to finish to be able to merge
		while(left.inProgress || right.inProgress)
			System.out.print("");
		
		
		// merge the two sorted halves back together
		array = merge(left.toBeSorted, right.toBeSorted);
		
		System.out.println( "Sorted array: \n" + Arrays.toString(array) );
	}
	
	
	public void run()
	{
		System.out.println("Sorting " + whichHalf + " half...");
		
		
		// Perform merge sort:
		mergeSort(toBeSorted);
		
		
		System.out.println("Done sorting " + whichHalf + " half");
		
		inProgress = false;
	}
	
	
	
	// ************ Merge sort functions *****************
	private static int[] merge(int[] temp1, int[] temp2)
	{
		int[] result = new int[temp1.length + temp2.length];

		int t1 = 0, t2 = 0;

		int r = 0;

		while (t1 < temp1.length && t2 < temp2.length)
		{
			if (temp1[t1] < temp2[t2])
			{
				result[r] = temp1[t1];
				t1++;
			}
			else
			{
				result[r] = temp2[t2];
				t2++;
			}

			r++;
		}

		while (t1 < temp1.length)
		{
			result[r] = temp1[t1];
			r++;
			t1++;
		}

		while (t2 < temp2.length)
		{
			result[r] = temp2[t2];
			r++;
			t2++;
		}

		return result;
	}

	// Merge sort: merge(), mergeSort(), and sort()

	private static void merge(int[] a, int[] aux, int lo, int mid, int hi)
	{
		// precondition: a[lo .. mid] and a[mid+1 .. hi]
		// are sorted subarrays

		// copy to aux[]
		for (int k = lo; k <= hi; k++)
		{
			aux[k] = a[k];
		}

		// merge back to a[]
		int i = lo, j = mid + 1;
		for (int k = lo; k <= hi; k++)
		{
			if (i > mid)
				a[k] = aux[j++];
			// this copying is unnecessary
			else if (j > hi)
				a[k] = aux[i++];
			else if (aux[j] < aux[i])
				a[k] = aux[j++];
			else
				a[k] = aux[i++];
		}
		// postcondition: a[lo .. hi] is sorted
	}

	public static int[] mergeSort(int[] array)
	{
		int[] index = new int[array.length];

		for (int i = 0; i < array.length; i++)
			index[i] = i;

		int[] aux = new int[array.length];

		sort(array, index, aux, 0, array.length - 1);

		return index;
	}

	// mergesort a[lo..hi] using auxiliary array aux[lo..hi]
	private static void sort(int[] a, int[] index, int[] aux, int lo, int hi)
	{
		if (hi <= lo)
			return;

		int mid = lo + (hi - lo) / 2;

		sort(a, index, aux, lo, mid);
		sort(a, index, aux, mid + 1, hi);
		merge(a, aux, lo, mid, hi);
	}

}
