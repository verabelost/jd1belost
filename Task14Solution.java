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
            System.out.println("�� ����� �� �����" );
            sc.next();
            continue;

               }   

            while(bo==true){
            	
            	if(month<=0||month>12){
                System.out.println("������ ������ ���, �������� ��������" );
                month=sc.nextInt();
                continue;
                  }
            	else{
            		
            		switch(month){
            		 case 1:  monthst = "������";
            		 break;
            		 case 2:  monthst = "�������";
            		 break;
            		 case 3:  monthst = "����";
            		 break;
            		 case 4:  monthst = "������";
            		 break;
            		 case 5:  monthst = "���";
            		 break;
            		 case 6:  monthst = "����";
            		 break;
            		 case 7:  monthst = "����";
            		 break;
            		 case 8:  monthst = "������";
            		 break;
            		 case 9:  monthst = "��������";
            		 break;
            		 case 10:  monthst = "�������";
            		 break;
            		 case 11:  monthst = "������";
            		 break;
            		 case 12:  monthst = "�������";
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


