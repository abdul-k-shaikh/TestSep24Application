package test.com;

public class Pattern1 {

	public static void main(String[] args) {
//		List<Integer> numList = Arrays.asList(1,3,5,6,7,10,13);
		int numList[] = { 7, 1, 3, 5, 6, 10, 13 };
		int target = 17;
		for (int i = 0, j = 1; i < numList.length-1; i++) {
			if (numList[i] + numList[j] == target) {
				System.out.println("indexes are :" + i + ":" + j);
				j++;
				break;
				
			} else {
				System.out.println("didnt match");
			}
		}
	}

}
