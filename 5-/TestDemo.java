import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
public class TestDemo{
	//输出一个整数的每一位
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
	    int n=scan.nextInt();
		if(n<0){
			System.out.println("此数是负数");
			n=-n;
		}
		while(n!=0){//132
			int tmp=n%10;//2
			System.out.println(tmp);
			n=n/10;
		}
	}
	
	
	//获取一个数二进制序列中所有的偶数位和奇数位，分别输出二进制序列
	public static void main16(String[] args){
		Scanner scan=new Scanner(System.in);
	    int n=scan.nextInt();
		for(int i=31;i>=1;i-=2){
			System.out.print(((n>>>i)&1)+" ");
		}
		System.out.println();
		for(int i=30;i>=0;i-=2){
			System.out.print(((n>>>i)&1)+" ");
		}
	}

	//给一个整数，输出它的二进制数中1的个数
	public static void main15(String[] args){
		Scanner scan=new Scanner(System.in);
	    int n=scan.nextInt();
		int count =0;
		while(n!=0){
			count++;
			n=n&(n-1);
		}
		System.out.println(count);
	}
	
	//给一个整数，输出它的二进制数中1的个数
	public static void main14(String[] args){
		Scanner scan=new Scanner(System.in);
	    int n=scan.nextInt();
		int count =0;
		while(n!=0){
		   if((n&1)!=0){
			   count++;
		   }
			n=n>>>1;
		}
		System.out.println(count);
	}


	//模拟实现登录密码系统,三次机会
	public static void main13(String[] args){
		System.out.println("请输入密码，您有三次机会");
		int count=3;
		while(count!=0){
			Scanner scan=new Scanner(System.in);
			String password=scan.next();
			if(password.equals("123456")){
				System.out.println("密码正确");
				break;
			}else{
				count--;
				System.out.println("密码错误，你还有"+count+"次机会");
				if(count==0){
					System.out.println("good bye");
				}
			}
		}
	}
	

	
	//求出0～999之间的所有“水仙花数”并输出。
	//(“水仙花数”是指一个三位数，其各位数字的立方和恰好等于该数本身,如；153＝1^3＋5^3＋3^3，则153是一个“水仙花数“。）
    public static void main12(String[] args){
		for(int i=0;i<=999;i++){
			//1.判断当前i是几位数
		    int tmp=i;
			int count=0;
			int sum=0;
			while(tmp!=0){
				count++;
				tmp=tmp/10;
			}
			//2.各位数字做次方
			tmp=i;
			while(tmp!=0){
			    sum += Math.pow(tmp%10,count);
				tmp=tmp/10;
			}
			//加和
			if(sum==i){
				System.out.println(sum+"是要找的数字");
			}		
		}
	}
	
	//计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
	public static void main11(String[] args){
		int i=1;
		double sum=0;
		int flg=1;
		for(i=1;i<=100;i++){
			sum+=1.0/i*flg;
			flg=-flg;
		}
		System.out.println(sum);
	}
	
	
	
	//求两个数的最大公约数
	public static void main10(String[] args){
		//10  20   10
		//18  24   6
		Scanner scan=new Scanner(System.in);
		int i=scan.nextInt();
		int j=scan.nextInt();
		int k=i%j;
		while(k!=0){
			i=j;
			j=k;
			k=i%j;
		}
		System.out.print(j);
	}
	
	
	
	
	//乘法口诀表
	public static void main9(String[] args){
		System.out.println("输入x");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int i=0;
		int ret=0;
		for(i=1;i<=n;i++){
			int j=0;
			for(j=1;j<=i;j++){
				ret=j*i;
				System.out.print(j +"*"+i+"="+(ret)+" ");
			}
		}
		
	}
	
	
	//完成猜数字游戏 ，用户输入数字，判断该数字是大于，小于，还是等于随机生成的数字，等于的时候退出程序。
	public static void main8(String[] args){
		System.out.println("输入1-100之间的数：");
		Random ran = new Random();
		int ranNumber = ran.nextInt(100)+1;//[1-100]
		Scanner scan=new Scanner(System.in);
		while(true){//死循环
		int n=scan.nextInt();
		if(n>ranNumber){
			System.out.println("猜大了");
		}else if(n<ranNumber){
			System.out.println("猜小了");
		}else{
			System.out.println("猜对了");
			break;
		}
		}
	}
	
	
	//根据输入的年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
	public static void main7(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n<=18){
			System.out.println("你是少年");
		}else if(n>=19 && n<=28){
            System.out.println("你是青年");
		}else if(n>=29 && n<=55){
			System.out.println("你是中年");
		}else {
			System.out.println("你是老年");	
		}
	}
	
	
	//给定一个数字，打印1-n之间的素数
	public static void main6(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int i=1;
		for(i=1;i<=n;i++){
			int j =2;
			for(j=2;j<=Math.sqrt(i);j++){
				if(i%j==0){
					break;
				}
			}
			if(j>Math.sqrt(i)){
				System.out.println(i+"是素数");
			}
		}
	}
	
	
	
	//给定一个数字，判定一个数字是否是素数
	public static void main5(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int i=2;
		for(i=2;i<=Math.sqrt(n);i++){
			if(n%i==0){
				break;
			}
		}
		if(i>Math.sqrt(n)){
			System.out.println(n+"是素数");
		}
		}
	
	
	
	
	
	//给定一个数字，判定一个数字是否是素数
	public static void main4(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int i=2;
		for(i=2;i<=n/2;i++){
			if(n%i==0){
				break;
			}
		}
		if(i>n/2){
			System.out.println(n+"是素数");
		}
	}

	
	
		//给定一个数字，判定一个数字是否是素数
		public static void main3(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int i;
		for(i=2;i<n;i++){
			if(n%i==0){
				break;
			}
		}
		//程序走到这里的时候，有2种情况：
		//1、循环正常的退出   素数
		//2、因为break        不是素数
		if(i>=n){
			System.out.println(n + " 是素数 ");
		}
	}
	
	
	

	//输出 1000 - 2000 之间所有的闰年
	public static void main2(String[] args){
		int i=1000;
		for(i=1000;i<=2000;i++){
			if(i%4==0 &&  i%100!=0  || i%400==0)
				System.out.println(i);
			continue;
		}
	}
	
	

	//编写程序数一下 1到 100 的所有整数中出现多少个数字9
		
	
	public static void main1(String[] args){
		int i=1;
		int count=0;
		for(i=1;i<=100;i++){
			if(i%10==9){
				count++;
			}
			if(i/10==9){
				count++;
			}
		}
		System.out.println(count);
	}
}
