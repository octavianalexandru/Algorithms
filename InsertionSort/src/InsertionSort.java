
public class InsertionSort {

	
	public static void iSort(double[] a){   //we check each number in order and place it in the proper position according to the ones already checked(position smaller than his) 
		for(int i =1 ; i<a.length;i++){           //starting from the second position, we take each number and swap it succesively with the number to the left with the condition that it is smaller than his left neighbour(they are not sorted)
			for(int j = i ;j>0;j--)
				if(a[j]<a[j-1]){ 
					double temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
				else
					break;
		}
	}
	
	public static void main(String[] args) {
		double[] a = {3,6,4,10,15,2};
		iSort(a);
		for(int i =0;i<a.length;i++)
			System.out.println(a[i]+" ");

	}

}
