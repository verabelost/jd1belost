package D.eclipse.vera.dz;

import java.util.Scanner;

public class Task14Solution {
    public static void main(String[] args){ 
   	     int month=0;
   	  String monthst="";
   	 
       
        boolean bool = true;
        boolean bo=true;

        Scanner sc=new Scanner (System.in);

        while (bool==true)

            {
            if (sc.hasNextInt())
               {
               month = sc.nextInt();
               }
            else
               {
            System.out.println("Вы ввели не число" );
            sc.next();
            continue;

               }   

            while(bo==true){
            	
            	if(month<=0||month>12){
                System.out.println("такого месяца нет, измените значение" );
                month=sc.nextInt();
                continue;
                  }
            	else{
            		
            		switch(month){
            		 case 1:  monthst = "Январь";
            		 break;
            		 case 2:  monthst = "Февраль";
            		 break;
            		 case 3:  monthst = "Март";
            		 break;
            		 case 4:  monthst = "Апрель";
            		 break;
            		 case 5:  monthst = "Май";
            		 break;
            		 case 6:  monthst = "Июнь";
            		 break;
            		 case 7:  monthst = "Июль";
            		 break;
            		 case 8:  monthst = "Август";
            		 break;
            		 case 9:  monthst = "Сентябрь";
            		 break;
            		 case 10:  monthst = "Октябрь";
            		 break;
            		 case 11:  monthst = "Ноябрь";
            		 break;
            		 case 12:  monthst = "Декабрь";
            		 break;
            		 
            		}
                 System.out.println(monthst);
            	bo=false;
                bool = false;
  
            	}
              
               	
               }
               



sc.close();


}

}

}


