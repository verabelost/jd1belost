//Заданы два одномерных массивас различным количеством элементов и натуральное 
//число к объединить их в один массив, включив  между к-тым и к+1-м элементом 1-го
//
package D.eclipse.vera.dz;

public class Listing3Task8Solution {

	public static void main(String[] args) {
	int k=4;
	int mas1[]={1,2,3,4,5,6,7,9};
	int mas2[]={28,17,3,14,88,93};
    
	int mas3[]=new int [(mas1.length)+(mas2.length)];
    for (int i=0; i<mas3.length;i++){
    	if(i<=k){
    		mas3[i]=mas1[i];
    		}
    		else{
    			if(i<=mas2.length+k){
    				mas3[i]=mas2[i-(k+1)];
    		     }
    			else{
    				 mas3[i]=mas1[i-mas2.length];
    			}
    	        }
    	System.out.print(mas3[i]+" ");
    }
    	
	}

}
