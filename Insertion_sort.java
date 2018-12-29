
public class Insertion_sort {
	
	public void swap(int[] list, int i, int j) {
		int temp;
		temp = list[j];
		list[j] = list[i];
		list[i] = temp;
		
	}
	
	
	public int[] insertionSort(int[] list) {
		int i, j, key, temp;
		
		for(i=1; i<list.length; i++) {
			key = list[i];
			j = i - 1;
			while(j>=0 && key < list[j]) {
				swap(list, j, j+1);
				j--;
			}
			
			
					
			
			
		}
		return list;
		
	}
	
	

}
