package D.eclipse.vera.dz;

import java.util.Scanner;

//import java.lang.Math;

public class Task18Solution

{

     public static void main(String[] args){ 
    	 double a=0;
    	 double b=0;
    	 double c=0;
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

             System.out.println("�� ����� �� �����" );

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

              System.out.println("�� ����� �� �����" );

              sc.next();

              continue;
              

}
                while (bool==true)

                {

                   if (sc.hasNextDouble())

                     {

                       c = sc.nextDouble();

                     }

                    else

                 {

                 System.out.println("�� ����� �� �����" );

                 sc.next();

                 continue;
                
                 }
                   if(a==b&&b==c&&a>0)
                   {
                	   System.out.println("����������� � ������ ��������� �������������");
                   }
                   else
                   {
                	   if(a<=0||b<=0||c<=0)
                	   {System.out.println("����������� �� ���������");}
                	   else{
                	   System.out.println("����������� �� ��������������");
                	   }
                   }	   


sc.close();

bool = false;

}

}

     }}}



