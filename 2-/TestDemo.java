public class TestDemo{//程序固定先找main函数
     public static void main (String[] args){
		 int a=10;
		 System.out.println(a);
		 a=0;
		 System.out.println(a);
		 System.out.println("==============");
		 final int SIZE=200;
		 System.out.println(SIZE);
	 }
     
     public static void main10 (String[] args){
		{
			 int a=10;
			 System.out.println(a);
		}
	 }
	 
     public static void main9 (String[] args){
		 //在屏幕上打出"hello"
		 String a="\"hello\"";
		 String b="\\hello\\";
		 System.out.println(a);
		 System.out.println(b);
	 }
	 
     public static void main8 (String[] args){
		 String s="abcdef";
		 System.out.println(s);
		 int a=10;
		 System.out.println("a="+a);
		 int c=20;
		 System.out.println(a+c);//30
		 System.out.println("a+c ="+a+c);//a+c =1020
		 System.out.println("a+c ="+a+" "+c);//a+c =10 20
		 System.out.println("a ="+a+" ,c ="+c);//a =10 , c =20
		 System.out.println("a+c ="+(a+c));//a+c =30 “+”只是个连接符
		 double d=12.5;
		 System.out.println("you="+d);//you=12.5
	 }

    public static void main7 (String[] args){
		boolean b=true;//布尔类型
		System.out.println(b);
	}
	
    public static void main6 (String[] args){
		short s=32767;
		System.out.println(s);
		System.out.println(Short.MAX_VALUE);
	}
	
	
    public static void main5 (String[] args){
		byte b=12;
		System.out.println(b);
		//int c=2147483648;
		//System.out.println(c);
		int a=Integer.MAX_VALUE+1;
		System.out.println(a);
		System.out.println(Integer.MAX_VALUE+1);	
	}



	public static void main4 (String[] args){
		char c='孙';
		System.out.println(c);
		int d='a';//ascii码中'a'对应的是97
		System.out.println(d);
	}
	
	
	public static void main3 (String[] args){
		//float f=12.5;
		float f=12.5f;
		System.out.println(f);
		double a=1.0d;
		System.out.println(a);
	}
	
	
	
	public static void main2 (String[] args){
		double a=1.0;
		double b=2.0;
		System.out.println(a/b);
	}

	
	public static void main1 (String[] args){
		int a=10;
		System.out.println("a="+a);
		long b=20L;
		System.out.println("b="+b);
		double c=12.5;
		System.out.println("c="+c);
	}
}