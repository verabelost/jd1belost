package D.eclipse.vera.dz;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int mon=sc.nextInt();
		String name="";
		
		if(mon<=0||mon>12){
			while(mon<=0||mon>12)
			 {  System.out.println("��� ������ ������");
				mon=sc.nextInt();
				
			 }
			if (mon==1){name="������";}
			else if(mon==2){name="�������";}
			else if(mon==3){name="����";}
			else if(mon==4){name="������";}
			else if(mon==5){name="���";}
			else if(mon==6){name="����";}
			else if(mon==7){name="����";}
			else if(mon==8){name="������";}
			else if(mon==9){name="��������";}
			else if(mon==10){name="�������";}
			else if(mon==11){name="������";}
			else if(mon==12){name="�������";}
			
			}
		else{
			if (mon==1){name="������";}
			else if(mon==2){name="�������";}
			else if(mon==3){name="����";}
			else if(mon==4){name="������";}
			else if(mon==5){name="���";}
			else if(mon==6){name="����";}
			else if(mon==7){name="����";}
			else if(mon==8){name="������";}
			else if(mon==9){name="��������";}
			else if(mon==10){name="�������";}
			else if(mon==11){name="������";}
			else if(mon==12){name="�������";}
		   
		}
		System.out.println(name);	
		
	}

}
