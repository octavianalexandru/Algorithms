import java.util.Scanner;


public class BinarySearch {

	public static int bSearch(double[] a, int x){   //parameters: a is the array in which we are searching for the value x
		int l = 0;                          //initialize left boundary index
		int r = a.length-1;                 //initialize right boundary index
		int m = (a.length-1)/2;             //initialize middle index
		
		while(l<r){                        //the loop stops when the left boundary gets bigger than the right(when the value x is not present in the array a)
			if(a[m]==x)                    //the condition when we found the value(returns the index of the value)
				return m;
			else
				if(x>a[m])                //if the value we are searching for is in the left half of the array, then the old middle becomes the right boundary
					l=m+1;
				else
					if(x<a[m])            //if the value we are searching for is in the right half of the array, then the old middle becomes the left boundary
						r = m;
			m = (l+r)/2;                // a new middle is computed
		
			
		
	}
		
			return -1;                 //this part of the program is executed only when the value was not found in the array, thus returning -1
}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double[] a = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 
		       		41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
		
		
		System.out.println(bSearch(a,73));
	}

}
