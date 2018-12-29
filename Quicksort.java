
public class Quicksort {
	
	Insertion_sort asznee = new Insertion_sort();
	

	public void Quicksorter(int[] A, int start, int end) {
		if(start < end) {
			int pivot = partition(A, start, end);
			Quicksorter(A, start, pivot-1);
			Quicksorter(A, pivot+1, end);
		}
		
	}
	
	public int partition(int [] A, int start, int end) {
		
		int x = A[end];
		int i = start - 1;
		for(int j=start; j<= end-1; j++) {
			if(A[j] <= x) {
				i++;
				asznee.swap(A, i, j);
			
			}
		
		}
		
		asznee.swap(A, i+1, end);
		
		return i+1;
		
		
	}

}
