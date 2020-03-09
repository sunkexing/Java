//方法的重载
public class TestDemo2{
	
	
	public static void main(String[] args){
		int a=10;
		int b=20;
		int ret=add(a,b);
		System.out.println( "两个数的和是"+ret);
		
		double c=1.5;
		double d=2.5;
		System.out.println( "两个小数的和是"+add(c,d));
		
		int e=1;
		System.out.println( "三个数的和是" + add(a,b,e));
	}
	
	public static int add (int x,int y){
		return x+y;
	}
	
	public static double add (double x,double y){
		return x+y;
	}
	
	public static int add (int x,int y,int z){
		return x+y+z;
	}
}