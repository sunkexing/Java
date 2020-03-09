import java.util.Scanner;
import java.lang.Math;
public class TestDemo{
	
	
	//交换数字，但是用了方法后不会交换(形参  实参 )
	public static void swap(int a,int b){
		int tmp=a;
		a=b;
		b=tmp;
	}
	public static void main(String[] args){
		int a=10;
		int b=20;
		System.out.println(a+": 交换前："+b);
		swap(a,b);
		System.out.println(a+": 交换前："+b);
	}
	
	
	
	
	//求n的阶乘和(一个方法)
	public static int sumFac1(int x){
		int sum=0;
		for(int i=1;i<=x;i++){
			int ret=1;
			for(int j=1;j<=i;j++){
				ret=ret*j;
			}
			sum+=ret;
		}
		return sum;
	}
	
	public static void main7(String[] args){
		Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
		System.out.println(sumFac1(n));
	}
	
	
	//求n的阶乘和(用到两个方法)  1!+2!+3!+..+n！
	
	public static int sumFac(int x){
		int sum=0;
		for(int i=1;i<=x;i++){
			sum+=fac(i);
		}
		return sum;
	}
	
    public static void main6(String[] args){
		Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
		System.out.println(sumFac(n));
	}
	

    
	//求n的阶乘
	public static int fac(int x){//阶乘
		int ret=1;
		for(int y=1;y<=x;y++){
			ret=ret*y;
		}
		return ret;
	}
    
	public static void main5(String[] args){
		Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
		System.out.println(fac(n));
	}
	
	
   
	//用方法求三个数的最大值
	public static int bigSmall(int x,int y,int z){
		int max=x>y?x:y;
		int max2=z>max?z:max;
		return max2;
	}
	
	public static void main4(String[] args){
		Scanner scan =new Scanner (System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		bigSmall(a,b,c);
		System.out.println(bigSmall(a,b,c));
	}
		
	//用方法求两个数加和
	public static int  addSum(int x,int y){
		int sum=0;
		sum=x+y;
		return sum;
	}
	
	public static void main3(String[] args){
		int a=10;
		int b=20;
		System.out.println(addSum(a,b));
	}
	
	//用方法求1-100的和
	public static int addSum(int x){
		int sum=0;
		for(x=1;x<=100;x++){
			sum+=x;
		}
		return sum;
	}
	public static void main2(String[] args){
		int i=1;
		System.out.println(addSum(i));
	}
	
	//1-100的和
	public static void main1(String[] args){
		int sum =0;
		for(int i=0;i<=100;i++){
			sum=sum+i;
		}
		System.out.println(sum);
	}
	
}