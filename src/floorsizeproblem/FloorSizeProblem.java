package floorsizeproblem;

import java.util.*;

public class FloorSizeProblem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the total no of floors in the building");
		int N = input.nextInt();
		
		ArrayList<Integer> sizeOfFloor = new ArrayList<Integer>();
		Hashtable<Integer, Integer> DayFloor = new Hashtable<Integer, Integer>();
		
		for(int i = 1; i<=N; i++) {
			System.out.println("Enter the floor size given on day: "+i);
			int floorsize = input.nextInt();
			
			sizeOfFloor.add(floorsize);
			DayFloor.put(floorsize, i);
		}
		
		Collections.sort(sizeOfFloor, Collections.reverseOrder());
		
		for(int i = 1; i <= N; i++) {
			System.out.println("Day: "+i);
			
			while(i >= DayFloor.get(sizeOfFloor.get(0))) {
				System.out.print(sizeOfFloor.get(0)+" ");
				sizeOfFloor.remove(0);
				
				if(sizeOfFloor.isEmpty() == true) {
					break;
				}
			}
			
			System.out.println();
		}
		
		input.close();
		
		
	}

}
