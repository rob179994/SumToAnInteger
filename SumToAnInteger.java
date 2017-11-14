import java.util.ArrayList;

public class SumToAnInteger {

	public ArrayList<Integer> findSum(ArrayList<Integer> inputListOne,ArrayList<Integer> inputListTwo, int sumTo) {
		
		ArrayList<Integer> results = new ArrayList<Integer>();
		for(int i=0;i<inputListOne.size();i++) {
			// break if greater than required number to sum to, due to sorted list (assumed increasing order)
			if(inputListOne.get(i)>sumTo) {
				break;
			}
			
			int sum = inputListOne.get(i);
			// iterate through second list to see if an element can be added to sum to produce sumTo
			for(int j=0;j<inputListTwo.size();j++) {
				
				// too large, so break due to sorted list
				if(sum+inputListTwo.get(j)>sumTo) {
					break;
				}
				else if(sum+inputListTwo.get(j)==sumTo) {
					results.add(i);
					results.add(j);
				}
				// else if < sumTo, continue to next item
			}
		}
		return results;
	}
	
	
	public static void main(String[] args){
		
		SumToAnInteger sum = new SumToAnInteger();
		
		// create test case and add test items
		ArrayList<Integer> testListOne = new ArrayList<Integer>();
		testListOne.add(1);
		testListOne.add(2);
		testListOne.add(2);
		testListOne.add(2);
		testListOne.add(3);
		testListOne.add(5); 
		testListOne.add(6);  // [1,2,2,2,3,5,6]

		ArrayList<Integer> testListTwo = new ArrayList<Integer>();
		testListTwo.add(1);
		testListTwo.add(2);
		testListTwo.add(3);
		testListTwo.add(3);
		testListTwo.add(5); 
		testListTwo.add(6);  // [1,2,3,3,5,6]
		
		
		// get results and print them
		ArrayList<Integer> result = sum.findSum(testListOne,testListTwo,5);
		System.out.println(result);
	}
}
