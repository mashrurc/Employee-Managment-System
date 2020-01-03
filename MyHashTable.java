package InheritanceGUI;
import java.util.*;


public class MyHashTable {

	private ArrayList<EmployeeInfo>[] buckets;


	public MyHashTable(int howManyBuckets) {

		buckets = new ArrayList[howManyBuckets];
		
		// For each element in the array, instantiate its ArrayList.
		for (int i = 0; i < howManyBuckets; i++) {
			buckets[i] = new ArrayList();  // Instantiate the ArrayList for bucket i.
		}
	}
	
	
	// METHODS
	
	public int calcBucket(int employeeNumber) {
		return(employeeNumber % buckets.length);
	}
	
	
	public void addToTable(EmployeeInfo theStudent) {
		buckets[calcBucket(theStudent.employeeNumber)].add(theStudent);
	}
	
	
	public EmployeeInfo removeFromTable(int employeeNumber) {
		int x = calcBucket(employeeNumber);
		for (int i=0;i<buckets[x].size();i++) {
			if (buckets[x].get(i).employeeNumber == employeeNumber) {
				EmployeeInfo tempporary = buckets[x].get(i);
				buckets[x].remove(i);
				return tempporary;
			}
		}
		return null;
		 
	}
	
	
	public void displayTable() {
		System.out.println("\nHere's the HashTable: \n");
		for (int i=0;i<buckets.length;i++) {
			for (int x=0; x<buckets[i].size();x++) {
				System.out.println("Bucket"+i+": "+buckets[i].get(x));
			}
		}
	}
	
	

}