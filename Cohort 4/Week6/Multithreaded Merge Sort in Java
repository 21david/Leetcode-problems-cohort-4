import java.util.Arrays;

public class Multithread extends Thread
{

	static int[] array = { 9, 1, 3, 4, 5, 12, 13, 19, -4, 5, -9, 15, 8, 4 };

	static int[] temp1;
	static int[] temp2;

	static int[] result = new int[array.length];

	static boolean sortedLeft, sortedRight;

	public static void main(String[] args)
	{

		// copy first half of array onto temp1
		// copy second half of array onto temp2
		temp1 = Arrays.copyOfRange(array, 0, array.length / 2);
		temp2 = Arrays.copyOfRange(array, array.length / 2, array.length);

		// merge sort on left half
		// merge sort on right half
		Multithread leftHalf = new Multithread();
		Multithread rightHalf = new Multithread();

		// merge sort temp1 and temp2 in parallel
		leftHalf.start();
		rightHalf.start();

		// wait for both halves to finish sorting
		while (!sortedLeft || !sortedRight);

		// merge temp1 and temp2 into final array
		result = merge(temp1, temp2);

		System.out.println("Final sorted array: \n" + Arrays.toString(result));
	}

	public void run()
	{

		if (Thread.currentThread().getId() % 2 == 0) // sort left half
		{
			mergeSort(temp1);

			System.out.println("Sorting left half: " + Arrays.toString(temp1));

			sortedLeft = true;
		}
		else // sort right half
		{
			mergeSort(temp2);

			System.out.println("Sorting right half: " + Arrays.toString(temp2));

			sortedRight = true;
		}

	}

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
			} else
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
