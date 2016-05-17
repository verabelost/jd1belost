package D.eclipse.vera.dz;

import java.util.Scanner;

public class Task21Solution {
	
	public static void main (String[] args){
		 double a=0;
    	 double b=0;
    	 double h=0;
    	 boolean bool = true;

         Scanner sc=new Scanner (System.in);

         while (bool==true)

             {

             if (sc.hasNextDouble())

                {

                a = sc.nextDouble();

                }

             else

                {

             System.out.println("Вы ввели не число" );

             sc.next();

             continue;

                }

             while (bool==true)

             {

                if (sc.hasNextDouble())

                  {

                    b = sc.nextDouble();

                  }

                 else

              {

              System.out.println("Вы ввели не число" );

              sc.next();

              continue;
              

}
                while (bool==true)

                {

                   if (sc.hasNextDouble())

                     {

                       h = sc.nextDouble();

                     }

                    else

                 {

                 System.out.println("Вы ввели не число" );

                 sc.next();

                 continue;
                
                 }
                   double sinus=0;
                  
                   for(double i=a;i<b;i=i+h){
                	   sinus=(Math.sin(i))*i;
                	   System.out.println(i+"    "+sinus);
                	                   	   
                	   }
                   }


sc.close();

bool = false;

}

}

     }
		
	}



