package D.eclipse.vera.dz;

public class ListingTask2Solution {

	public static void main(String[] args) {
		int mass []={1,1,4,0,8,0,7,1,0,79,9,0,5,0,1,2,3,4,5,19};
		double numb=0;
		double proc=0;
		for(int p:mass ){
			if((p%2)==0){
				numb++;
			   }
		
		}
		proc=(numb/mass.length)*100;
		System.out.println("нечётных чисел в последовательности= "+proc+"%");

	}

}
