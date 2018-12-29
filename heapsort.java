
public class heapsort {
	
	Insertion_sort asznee = new Insertion_sort();
	
	public int parent(int i) {
		return Math.floorDiv(i, 2);
		
	}
	
	public int leftchild(int i) {
		return 2*i + 1;
	}
	
	public int rightchild(int i) {
		return 2*i + 2;
	}
	
	
	public void bubbledown(int[] A, int n, int i) {

		int l = leftchild(i);
		int r = rightchild(i);	
		int largest;
		if(l < n && A[l] > A[i] ) {
			//leftchild is greater
			largest = l;
		
		}
		else {
			largest = i;
			
		}
		
		if(r < n  && A[r] > A[largest] ) {
			// rightchild is larger
			largest = r;
		}
		
		if(largest != i) {
			asznee.swap(A, i, largest);
			bubbledown(A, n, largest);
		}
		
	}
	
	public void buildheap(int[] A, int n) {
		for(int i = n/2 - 1; i >= 0; i--) {
			bubbledown(A, n, i);
		}
	}
	
	
	public void heapsorter(int[] A) {
		buildheap(A, A.length);
		for(int i=A.length-1; i >= 0; i--) {
			asznee.swap(A, 0, i);
			bubbledown(A, i, 0);
		}
		
		
		
	}

}
