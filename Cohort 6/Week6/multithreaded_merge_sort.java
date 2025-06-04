import java.util.Arrays;

public class MultithreadedMergeSortMain {
	
	public static void main(String[] args) {
		
		// set up the array
		int[] inputArray = new int[] {-9, 5, 4, -8, -8, -8, 0, 12, 34, 54, 54, -43, 3, 9, 17, 13, 21, -2, 2, 1, -9, 0, 12}; 
		System.out.println("Input array: ");
		System.out.println(Arrays.toString(inputArray) + "\n");
		
		
		// split the array into two halves
		int[] leftHalf = getHalf("left", inputArray);
		int[] rightHalf = getHalf("right", inputArray);
		
		
		// set up the objects to do merge sort
		MultithreadedMergeSort one = new MultithreadedMergeSort(leftHalf, true);
		MultithreadedMergeSort two = new MultithreadedMergeSort(rightHalf, false);
		
		
		// perform merge sort on each half simultaneously
		one.inProgress = true;
		two.inProgress = true;
		one.start();
		two.start();
		
		
		// wait for both to be done
		while(one.inProgress || two.inProgress);

		
		// merge the two sorted halves back:
		MultithreadedMergeSort.merge(inputArray, leftHalf, rightHalf);
		
		
		// print the final sorted array
		System.out.println("\nFinal sorted array: ");
		System.out.println(Arrays.toString(inputArray));

	}
	
	/*
	 * If the input is "left", it returns the left half of the array
	 * If the input is "right", it returns the right half of the array
	 * 
	 * If the array is even length, left gets the first half and right gets the right half.
	 * If it is of odd length, left gets the smaller half and right gets the bigger half
	 * (the center element will go to the right half).
	 */
	public static int[] getHalf(String whichHalf, int[] inputArray) {
		int[] array = new int[0];
		
		switch(whichHalf) {
			case "left":
				array = Arrays.copyOfRange(inputArray, 0, inputArray.length / 2);
				break;
			case "right":
				array = Arrays.copyOfRange(inputArray, inputArray.length / 2, inputArray.length);
				break;
		}
		
		return array;
	}

}

class MultithreadedMergeSort extends Thread {

	int[] unsortedArray;
	boolean isLeftHalf; // true if it is left half, false if it is right half
	boolean inProgress;
	
	
	public MultithreadedMergeSort(int[] unsorted, boolean isLeft) {
		unsortedArray = unsorted;
		isLeftHalf = isLeft;
	}
	
	
	public void run() {
		System.out.println("Sorting " + (isLeftHalf? "left" : "right") + " half...");
		
		// sort 'unsortedArray' using merge sort
		mergeSort(unsortedArray);
		
		System.out.println("Done sorting " + (isLeftHalf? "left" : "right") + " half.");
		inProgress = false;
		
	}
	
	
	/***************** Merge Sort methods ****************************/
	public static void mergeSort(int[] a) {
        mergeSort(a, a.length);
    }

    public static void mergeSort(int[] a, int n) {
        if (n < 2)
            return;

        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++)
            l[i] = a[i];

        for (int i = mid; i < n; i++)
            r[i - mid] = a[i];


        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }
    
    public static void merge(int[] a, int[] l, int[] r) {
		merge(a, l, r, l.length, r.length);
	}

    public static void merge(int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {

            if (l[i] <= r[j])
                a[k++] = l[i++];
            else
                a[k++] = r[j++];

        }

        while (i < left)
            a[k++] = l[i++];

        while (j < right)
            a[k++] = r[j++];
    }
    /******************************************************************/

}
