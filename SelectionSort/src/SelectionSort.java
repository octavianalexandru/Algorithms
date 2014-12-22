
public class SelectionSort {

	
	
	public static void sSort(double[] a){  //at every step the algorithm searches for the minimum in the subarray begenning from the current position and ending at the last position and swaps it with the current position
		                                   //it doesn't check for minimum in the whole array for the reason that, at every step, the subarray starting from position 0 and ending at the current position -1, is already sorted
		for (int i = 0; i<a.length-1;i++){
			for(int j = i+1;j<a.length;j++)
				if(a[j]<a[i]){
					double temp = a[j];
					a[j]=a[i];
					a[i] = temp;
				}
			
			
		}	
			
			
		
	}
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		double[] a = {3,5,4,10,15,6,57,96,3,5,7,8,5,7,9,0,6,4,35,7,9,6,5,8,90,6,5,8,90,7,5,4,6,89,6,4,7,9,765,6,8,75,4,6,7,86,57,7,8,9};
		sSort(a);
		for(int i = 0 ; i <a.length ; i++)
			System.out.println(a[i]);
		
		
		long endTime = System.currentTimeMillis();
		long duration = (endTime - startTime);
		
		System.out.println(duration);
		

	}

}
