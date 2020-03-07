public class TestDemo{//类
     public static void main(String[] args){
		 int  a = 3;
		 byte b = a;
	 }

    public static void main12(String[] args){
		String str="\"张三\"";
		System.out.println(str);
		System.out.println("\\\"hello\\\"");
	}
	
    public static void main11(String[] args){
		 //short  char
		 short sh=10;
		 char ch='高';
		 sh=(short)ch;
		 System.out.println(sh);
	}
	 
    public static void main10(String[] args){
    byte b=10;
	char ch='高';
	char ch2=9;
	//b=(byte)ch;
	ch=(char)b;
	System.out.println(b);
	System.out.println(ch);
	//System.out.println(ch2);//9所对应的字符，不建议这么做，字符就是字符
	}
	
    public static boolean flg;//属性 :boolean 对应的默认值为'false'
    public static char ch;//默认值 '\u0000'打印不出来	
	public static void main9(String[] args){//方法
		System.out.println(flg);
		System.out.println(ch);
	}
	
	public static void main8(String[] args){
		String s1="12";
		int a=Integer.parseInt(s1);
		System.out.println(a);
	}
	
	public static void main7(String[] args){
		//int -> String
		int a=10;
		String s1=a+"";
		System.out.println(s1);
		String s2=String.valueOf(12.5);//valueOf将参数转化为字符串
		System.out.println(s2);
	} 
	
	public static void main6(String[] args){
		int a=10;
		long b=12L;
		//int c=a+b;//不同类型参与运算会自动提升为较大类型
		long c=a+b;
		System.out.println(c);
		int d=20;
		int e=a+d;
		System.out.println(e);
	}
	
	public static void main5(String[] args){
		byte a=10;
		byte b=12;
		//int c=a+b;
		byte c=(byte)(a+b);
		System.out.println(c);
	}
	
	public static void main4(String[] args){
		byte a=100;
		//byte b=128超过byte范围
	}
	
	public static void main3(String[] args){
		//boolean 不能和其他类型进行转换；
	}
	
	public static void main2(String[] args){
		int a=10;
		double b=12.5;
		//a=(int)b;
		b=a;
		System.out.println(b);
	}
	
	public static void main1(String[] args){
		int a=10;
		long b=30L;
		//a=(int)b;
		b=a;
		System.out.println(b);
	}
}