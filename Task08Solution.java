package test;

import java.util.Scanner;

//import java.lang.Math;

public class Task08Solution

   {

     public static void main(String[] args)

        { 
	      double x=0;
	      double y=0;
	      double n=0;

          boolean bool = true;
          boolean rezu = false;

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
            	while (bool==true)
                {
                	if (sc.hasNextDouble())
                	{
                		n = sc.nextDouble();
                	}

                    else
                    {
                    	System.out.println("Вы ввели не число" );
                    	sc.next();
                    	continue;
                    }
                if (   ((x+y)>n)&& ((y+n)>x)&&( (n+x)>y))
                    {
                    	rezu=true;
                    }

       System.out.println(rezu);
       sc.close();
       bool = false;

}

}

}
}
}