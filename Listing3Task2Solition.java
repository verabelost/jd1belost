package D.eclipse.vera.dz;

public class Listing3Task2Solition {

	public static void main(String[] args) {
		int mas []={1,4,7,0,8,0,7,1,0,78,9,0,5,0,1,2,3,4,5,6};
		int n=0;
		
	
		for(int p:mas)
			
		{  
			
			if (p!=0){
			n++;	
				
			}
			
		}
		int masic []=new int[n];	
		int verif=0;
			for(int i=0; i<mas.length;i++ ){
				if(mas[i]!=0)
				{
					masic[verif]=mas[i];
					System.out.print(masic[verif]+" ");
					verif++;
					
				}
						
			}
		
		}


	}


