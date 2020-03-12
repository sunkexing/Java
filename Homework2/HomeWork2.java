import java.util.Scanner;

public class HomeWork2{
	
	//在同一个类中,分别定义求两个整数之和的方法 和 三个小数之和的方法。 并执行代码，求出结果
	public static int sum(int x,int y){
		return x+y;
	}
	public static double  sum(double x,double y,double z){
		return x+y+z;
	}
	
	public static void main(String[] args){
	 	int x=1;
		int y=2;
		double a=1.5;
		double b=0.5;
		double c=1.0;
		System.out.println(sum(x,y));
		System.out.println(sum(a,b,c));
	}
	
	//在同一个类中定义多个方法：
	//要求不仅可以求两个整数的最大值，还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
	public static int com(int x,int y){
		int max=x>y?x:y;
		return max;
	}
	
	
	public static double com(double x,double y){
		double max=x>y?x:y;
		return max;
	}
	public static double com(double x,double y,int z){
		double max=(com(x,y)>z?com(x,y):z);
		return max;
	}
	
	
	public static void main7(String[] args){
		int x=1;
		int y=2;
		double z=0.5;
		double p=1.5;
		System.out.println(com(z,p,y));
		System.out.println(com(x,y));
		System.out.println(com(z,p));
	}
	
	//创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
	//要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
	public static int max2(int x,int y){
		int max=(x>y?x:y);
		return max;
	}
	public static int max3(int x,int y,int z){
		
		int max=(max2(x,y)>z?max2(x,y):z);
		return max;
	}
	
	
	public static void main6(String[] args){
	    int x=1;
		int y=2;
		int z=3;
		System.out.println(max2(x,y));
		System.out.println(max3(x,y,z));
	}
	
	
	//调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
	public static void main5(String[] args){
		int []arr={1,1,2,3,2,4,4};
		for(int i=0;i<7;i++){
			if(arr[i]%2!=0){
				System.out.print(arr[i]);
			}
		}
		for(int j=0;j<7;j++){
			if(arr[j]%2==0){
				System.out.print(arr[j]);
			}
		}
	}
	
	
	public static void main4(String[] args){
		Scanner scan=new Scanner(System.in);
	    int n=scan.nextInt();
		int tmp=1;
		for(int i=1;i<=n;i++){
			tmp=tmp*i;
		}
		System.out.println(tmp);
	}
	
	//求1！+2！+3！+4！+........+n!的和
	public static int facSum(int x){
		int sum=0;
		for(int i=1;i<=x;i++){
			sum+=fac(i);
		}
		return sum;
	}
		
	public static int fac(int x){
		if(x==1){
			return 1;
		}else{
			return x*fac(x-1);
		}
	}
	public static void main3(String[] args){
		Scanner scan=new Scanner(System.in);
	    int n=scan.nextInt();
		System.out.println(facSum(n));
	}
	
	
	
	//求斐波那契数列的第n项。(迭代实现)
	public static int fib(int x){
		if(x<=2){
			return 1;
		}else{
			return fib(x-1)+fib(x-2);
		}
		
	}
	
	public static void main2(String[] args){
		
		Scanner scan=new Scanner(System.in);
	    int n=scan.nextInt();
		System.out.println(fib(n));
	}
	
	
	
	
	
	public static void main1(String[] args){
		//有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
		
		int []arr={1,1,2,3,2,4,4};
		int count=0;
		for(int i=0;i<7;i++){
			count =0;
			for(int j=0;j<7;j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}
			if(count==1){
					System.out.println(arr[i]);
				}
		}
		
		
	}
	
	
}