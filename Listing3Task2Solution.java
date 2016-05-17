package D.eclipse.vera.dz;

public class Listing3Task2Solution {
	public static void main(String[] args) {
		int mass []={1,1,4,0,8,0,7,1,0,78,9,0,5,0,1,2,3,4,5,19};
		int numb=0;
		for(int i=0; i<mass.length; i++){
			if(mass[i]==i){
				numb=numb+mass[i];
			}
		
		}
		System.out.println(numb);
	}

}
