//方法的递归
public class TestDemo3{
	
	//求1+2+3+4+5
	public static void main(String[] args){
		int i=10;
		
		System.out.println( addSum(i));
	}
	public static int addSum(int x){
		if(x==1){
			return 1;
		}
		return x+addSum(x-1);
	}
	
	
	//求5的阶乘
	public static void main1(String[] args){
		int a=5;
		System.out.println( fac(a));
	}
	public static int fac(int n){
		if(n==1){
			return 1;
		}
		return n*fac(n-1);
	}
}