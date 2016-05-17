package D.eclipse.vera.dz;

import java.util.Scanner;

//дана длина ребра куба. Найти  площадь грани, площадь полной поверхности этого куба.

public class Task19Solution

{

     public static void main(String[] args){ 
    	 double a=0;
    	 
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
             double s=0;
             double v=0;
             double spoln;
             if(a>0){
             s=Math.pow(a, 2);
             v=Math.pow(a, 3);
             spoln=s*6;
             System.out.println("площадь грани куба="+s+" полная площадь куба="+spoln+" объём куба = "+v);
             }
             else{
            	 System.out.println("такой куб не построишь");
             }
             
               
                  

sc.close();

bool = false;

}

}

     }



