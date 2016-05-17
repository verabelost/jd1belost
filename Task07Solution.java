package D.eclipse.vera.dz;

import java.util.Scanner;

//import java.lang.Math;

public class Task07Solution

{

     public static void main(String[] args){ 
    	 double x=0;
    	 double y=0;
    	 
         boolean rez = false;
         boolean bool = true;

         Scanner sc=new Scanner (System.in);

         while (bool==true)

             {

             if (sc.hasNextDouble())

                {

                x = sc.nextDouble();

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

                    y = sc.nextDouble();

                  }

                 else

              {

              System.out.println("Вы ввели не число" );

              sc.next();

              continue;

}
                if((y>=0&&y<=3&&x>=-2&&x<=2) || (y>=-3&&y<=0&&x>=-3&&x>=3))
                {
                	rez=true;
                }
                

System.out.println(rez);

sc.close();

bool = false;

}

}

}

}
