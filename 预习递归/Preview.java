import java.util.Scanner;
public  class Preview {
	
	//求菲波那切数列的第N项
	public static int count =0;
	
	public static int fib(int x){
		if(x<=2){
			return 1;
		}else if(x==3){
			count++;
		}
		
		return fib(x-1)+fib(x-2);
	}
		
	public static void main4(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(fib(n));
		System.out.println(count);
	}
	
	//输入一个非负整数，返回组成它各位数字之和
	public static int sum1(int x){
		if(x<10){
			return x;
		}
		return sum1(x/10)+x%10;
		
	}
	public static void main3(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(sum1(n));
	}

	
	//递归求1+2+...+10
	public static int sum(int x){
		if(x==1){
			return 1;
		}else{
			return x+sum(x-1);
		}
		}
	
	public static void main2(String[] args){
		Scanner scan=new Scanner(System.in);
		int i=scan.nextInt();
		System.out.println(sum(i));
	}
		
	//按顺序打印一个数字的每一位
	public static void print(int num){
		if(num>9){
			print(num/10);
		}
		System.out.println(num%10);
	}	
	
	public static void main1(String[] args){
		Scanner scan=new Scanner(System.in);
		int c=scan.nextInt();
		print(c);
		}
	}
	
	
	
	
	
	
