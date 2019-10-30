/*Class:		CSE 1323L/W01
Date:			10/25/2019  
Name:			Terrence Smith
Assgnmt Name:	IntArray   
Assignment#:	Lab 5A 
Resources: 		Introduction to Java Programming and Data Structures: Comp Version 11th e, 
 				Ch. 13 and 18. https://www.geeksforgeeks.org/equals-hashcode-methods-java/*/

import java.util.Arrays;

public class IntArray {
	int[] array;
	
	IntArray (int[] array) {
		this.array = array;
	}
	// gets array
	public int[] getArray() {
		return array;
	}
	// sets array
	public void setArray(int[] array) {
		this.array = array;
	}
	
	public String toString () {
		return Arrays.toString(array);
	}
	
	//determines if arrays are equal
	public boolean equals(Object o) {
		if (this.array == o) 
			return true;
        if (o == null || o.getClass() != this.getClass())
        	return false;
        
        IntArray arr = (IntArray) o;
        
        return Arrays.equals(array, arr.array);
		
	}
	// recursive method returning sum of all elements
	public int sumInts(int n) {
		if(n == array.length) 
			return 0;
		else
			return array[n] + sumInts(n+1);
	}
	
	public int sum() {
		return sumInts(0);
	}

}
	
class TestIntArray {
	public static void main(String[] args) {
		IntArray array = new IntArray(null);
		array.setArray(new int[] {5,4,3,2,1});
		
		// output to user
		System.out.println("Sum of integers: "+array.toString().replace("[","").replace("]","")+" = "+array.sum());
		System.out.println("Arrays are equal: "+array.equals(new IntArray(new int[]{5,4,3,2,1})));

	}

}
