package D.eclipse.vera.dz;

public class Sortirovka {

	public static void main(String[] args) {
		int a[]= {1,9,2,8,3,7,4,6,5};
		int n=0;
		for (int i=0; i<a.length;i++){
			for (int j= i+1;j<a.length;j++){
				if (a[i] > a[j])
				{
					n = a[i];
					a[i] = a[j];
					a[j] = n;
				}
			}
			
		}
		for(int i:a)
		{
			System.out.print(i + " ");
		}
	}

}
