
import java.util.Scanner;

public class yunsuan {
	public static void main(String[]args)
	{
		yunsuan a=new yunsuan();
		System.out.println("��ѡ����ֵ��Χ�����ֵ��");
		Scanner in =new Scanner(System.in);
		int range=in.nextInt();
		System.out.println("��ѡ�����޸���(1 or 2)");
		int choose1=in.nextInt();
		System.out.println("��ѡ�����޳˳���(1 or 2)");
		Scanner in3=new Scanner(System.in);
		int choose2=in3.nextInt();
		Scanner in1=new Scanner(System.in);
		System.out.println("������Ҫ��ӡ������");
		int m=in1.nextInt();
	
		for(int n=0;n<m;n++)
		{
			char[] c1={'+','-','*','/'};
		      int  c=(int)(Math.random()*4); 
		      if(choose1==1&&choose2==1)
		      {
	         if(c1[c]=='+')
	        {
	        	 a.add(range);
	        }
	         else if(c1[c]=='-')
	         {
	        	 a.jian2(range);
	         }
	         else if(c1[c]=='*')
	         {
	        	 a.chen(range);
	         }
	         else if(c1[c]=='/')
	         {
	          a.chu1(range);
	         }
		    }
		      else if((choose1==1&&choose2==2))
		      {
		    	  if(c1[c]=='+')
			        {
			        	 a.add(range);
			        }
			         else if(c1[c]=='-')
			         {
			        	 a.jian2(range);
			         }
			         else if(c1[c]=='*')
			         {
			        	m++;
			         }
			         else if(c1[c]=='/')
			         {
			          m++;
			         }
		    	  
		      }
		      else if((choose1==2&&choose2==2))
		      {
		    	  if(c1[c]=='+')
			        {
			        	 a.add(range);
			        }
			         else if(c1[c]=='-')
			         {
			        	 a.jian1(range);
			         }
			         else if(c1[c]=='*')
			         {
			        	m++;
			         }
			         else if(c1[c]=='/')
			         {
			          m++;
			         }
		      }
		      else if((choose1==2&&choose2==1))
		      {
		    	  if(c1[c]=='+')
			        {
			        	 a.add(range);
			        }
			         else if(c1[c]=='-')
			         {
			        	 a.jian1(range);
			         }
			         else if(c1[c]=='*')
			         {
			        	 a.chen(range);
			         }
			         else if(c1[c]=='/')
			         {
			          a.chu1(range);
			         }
		      }
		}
	}
	public void add(int range)
	{
		int answer=0;
		int x=getrandom(range);
  	    int y=getrandom(range);
  	       System.out.print(x);
	       System.out.print('+');
	       System.out.print(y);
	       System.out.print("=");
	       System.out.println();
	       System.out.println("������𰸣�");
	       Scanner in2=new Scanner(System.in);
		      int q=in2.nextInt();
	       answer= x+ y;
	       System.out.println(answer);
	    	  if(q==answer)
	    	  {
	    		  System.out.println("�ش���ȷ��");
	    	  }
	    	  else 
	    		  System.out.println("�ش����");
	}
	public void jian1(int range)
	{
		int answer=0;
		int x=getrandom(range);
  	    int y=getrandom(range);
  	  if( x> y)
  	  {
  		  System.out.print(x);
	       System.out.print('-');
	       System.out.print(y);
	       System.out.print("=");
	       System.out.println();
	       System.out.println("������𰸣�");
	       Scanner in2=new Scanner(System.in);
		      int q=in2.nextInt();
	 	  answer=x-y;
		  if(q==answer)
		  {
  		  System.out.println("�ش���ȷ��");
  	     }
  	     else 
  		  System.out.println("�ش����");
  	  }
	}
	public void jian2(int range)
	{
		int answer=0;
		int x=getrandom(range);
  	    int y=getrandom(range);
  	       System.out.print(x);
	       System.out.print('-');
	       System.out.print(y);
	       System.out.print("=");
	       System.out.println();
	       System.out.println("������𰸣�");
	       Scanner in2=new Scanner(System.in);
		      int q=in2.nextInt();
	       answer= x- y;
	       System.out.println(answer);
	    	  if(q==answer)
	    	  {
	    		  System.out.println("�ش���ȷ��");
	    	  }
	    	  else 
	    		  System.out.println("�ش����");
	}
	public void chu1(int range)
	{
		int answer=0;
		int x=getrandom(range);
  	    int y=getrandom(range);
  	       System.out.print(x);
	       System.out.print('/');
	       System.out.print(y);
	       System.out.print("=");
	       System.out.println();
	       System.out.println("������𰸣�");
	       Scanner in2=new Scanner(System.in);
		      int q=in2.nextInt();
	       answer= x/y;
	       System.out.println(answer);
	    	  if(q==answer)
	    	  {
	    		  System.out.println("�ش���ȷ��");
	    	  }
	    	  else 
	    		  System.out.println("�ش����");
	}
	
	public void chen2(int range)
	{
		int answer=0;
		int x=getrandom(range);
  	    int y=getrandom(range);
  	    if(x<y)
  	    {
  	       System.out.print(x);
	       System.out.print('*');
	       System.out.print(y);
	       System.out.print("=");
	       System.out.println();
	       System.out.println("������𰸣�");
	       Scanner in2=new Scanner(System.in);
		      int q=in2.nextInt();
	       answer= x*y;
	       System.out.println(answer);
	    	  if(q==answer)
	    	  {
	    		  System.out.println("�ش���ȷ��");
	    	  }
	    	  else 
	    		  System.out.println("�ش����");
  	    }
	}
	public void chen(int range)
	{
		int answer=0;
		int x=getrandom(range);
  	    int y=getrandom(range);
  	       System.out.print(x);
	       System.out.print('*');
	       System.out.print(y);
	       System.out.print("=");
	       System.out.println();
	       System.out.println("������𰸣�");
	       Scanner in2=new Scanner(System.in);
		      int q=in2.nextInt();
	       answer= x*y;
	       System.out.println(answer);
	    	  if(q==answer)
	    	  {
	    		  System.out.println("�ش���ȷ��");
	    	  }
	    	  else 
	    		  System.out.println("�ش����");
	}
	public int  getrandom(int range)
	{
		int x=(int) ( Math.random() * range );
		return x;
	}
}
	