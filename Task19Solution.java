package D.eclipse.vera.dz;

import java.util.Scanner;

//���� ����� ����� ����. �����  ������� �����, ������� ������ ����������� ����� ����.

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

             System.out.println("�� ����� �� �����" );

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
             System.out.println("������� ����� ����="+s+" ������ ������� ����="+spoln+" ����� ���� = "+v);
             }
             else{
            	 System.out.println("����� ��� �� ���������");
             }
             
               
                  

sc.close();

bool = false;

}

}

     }



