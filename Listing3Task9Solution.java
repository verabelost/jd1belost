// Даны две возрастающие последовательности, образовать из них новую
//возрастающую последовательность
package D.eclipse.vera.dz;

public class Listing3Task9Solution {

	public static void main(String[] args) {
		int a[]={1,3,7,9,11};
		int b[]={2,4,6,8,12};
		
		int ab[]=new int [a.length+b.length];
		for(int n=0;n<ab.length;n++){
			if(n<a.length){
				ab[n]=a[n];
				}
				else{
					ab[n]=b[n-a.length];
				}
				
			}
		int k=0;
        for(int i=0; i<ab.length; i++){
        	for(int j=i+1; j<ab.length;j++){
        		if(ab[i]>=ab[j]){
        			k=ab[i];
        		    ab[i]=ab[j];
        		    ab[j]=k;        		 
        	}
        	
        	}
        }
        	 for(int p:ab){
        	System.out.print(p+" ");
        	
        	}
        		
        
       
        }}
       
        	
        	
        
        



