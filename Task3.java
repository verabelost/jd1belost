package D.eclipse.vera.dz;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int mon=sc.nextInt();
		String name="";
		
		if(mon<=0||mon>12){
			while(mon<=0||mon>12)
			 {  System.out.println("нет такого мес€ца");
				mon=sc.nextInt();
				
			 }
			if (mon==1){name="€нварь";}
			else if(mon==2){name="февраль";}
			else if(mon==3){name="март";}
			else if(mon==4){name="апрель";}
			else if(mon==5){name="май";}
			else if(mon==6){name="июнь";}
			else if(mon==7){name="июль";}
			else if(mon==8){name="август";}
			else if(mon==9){name="сент€брь";}
			else if(mon==10){name="окт€брь";}
			else if(mon==11){name="но€брь";}
			else if(mon==12){name="декабрь";}
			
			}
		else{
			if (mon==1){name="€нварь";}
			else if(mon==2){name="февраль";}
			else if(mon==3){name="март";}
			else if(mon==4){name="апрель";}
			else if(mon==5){name="май";}
			else if(mon==6){name="июнь";}
			else if(mon==7){name="июль";}
			else if(mon==8){name="август";}
			else if(mon==9){name="сент€брь";}
			else if(mon==10){name="окт€брь";}
			else if(mon==11){name="но€брь";}
			else if(mon==12){name="декабрь";}
		   
		}
		System.out.println(name);	
		
	}

}
