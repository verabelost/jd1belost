
package D.eclipse.vera.dz;

public class Listing3Task6Solution {

	public static void main(String[] args) {
		int ms[]={1,2,3,4,5,6,7};
		
		int n=0;
		for(int i=0;i<(ms.length/2);i++){
			n=ms[i];
			ms[i]=ms[(ms.length-1)-i];
			ms[(ms.length-1)-i]=n;
		}
		for(int i=0;i<(ms.length);i++)
		System.out.print(ms[i]+" ");
	}

}
